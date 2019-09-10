package com.riskfire.service.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.dao.RiskReportAssessMapper;
import com.common.dao.RiskReportFireDangerMapper;
import com.common.dao.RiskReportMainMapper;
import com.common.dao.UserMapper;
import com.common.dao.UtiWeightMapper;
import com.common.service.RiskCommonService;
import com.common.utils.RiskCommonMethodUtils;
import com.po.request.RiskRequestVo;
import com.po.response.AjaxResult;
import com.po.response.RiskGradeVo;
import com.riskfire.dao.RiskFireDao;
import com.riskfire.service.RiskFireService;
import com.vo.RiskReportAssess;
import com.vo.RiskReportMain;
import com.vo.User;
import com.vo.UtiFactor;
import com.vo.UtiFormula;
import com.vo.UtiWeight;

/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年7月19日 下午3:03:41
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
@Service("riskFireService")
public class RiskFireServiceImpl implements RiskFireService{
	
	@Autowired
	RiskFireDao riskFireDao;
	
	@Autowired 
	RiskCommonService riskCommonService;
	
	@Autowired
	UtiWeightMapper utiWeightMapper;
	
	@Autowired
	RiskReportMainMapper  riskReportMainMapper;
	
	@Autowired
	RiskReportAssessMapper riskReportAssessMapper;
	
	@Autowired
	RiskReportFireDangerMapper  riskReportFireDangerMapper;
	
	@Autowired
	UserMapper userMapper;
	
	
	/**
	 * @功能：保存并且打分
	 * @param 将数据保存到库中，并且 进行打分
	 * @author 
	 * @throws Exception
	 * @时间：20190814
	 * @修改记录：
	 */
	public AjaxResult  saveAndAssessScore(RiskRequestVo riskRequestVo){
		AjaxResult ajaxResult = new AjaxResult();
		try {
			// 打分
			RiskGradeVo riskGradeVo =this.assessScore(riskRequestVo);
			RiskReportMain riskReportMain = riskRequestVo.getRiskReportMainVo();
			riskReportMain.setRiskReportAssess(riskGradeVo.getRiskReportAssess());
			//进行保存
			riskReportMainMapper.insertSelective(riskReportMain);
			//给大对象的公共字段设置统一值
			RiskCommonMethodUtils.setValueforSpecificField(riskReportMain, "RiskFileNo", riskReportMain.getRiskFileNo());
			
			RiskReportAssess riskReportAssess =riskGradeVo.getRiskReportAssess();
			riskReportAssess.setRiskFileNo(riskReportMain.getRiskFileNo());
			//保存echarts图表分值信息
			riskReportAssessMapper.insertSelective(riskReportAssess);
			//保存火灾风险信息
			riskReportFireDangerMapper.insertBatchFireDanger(riskRequestVo.getRiskReportFireDangerList());
			
		} catch (Exception e) {
			e.printStackTrace();
			ajaxResult.setStatus(2);
			ajaxResult.setMessage("保存并且打分功能失败！");
		}
		
		return ajaxResult;
	}
	
	/**
	 * @功能：打分功能实现
	 *   需要将每一类组织一个分值 的集合，然后和权重相乘，
	 *   入口是utifactor(分子表)，通过factortype 进行分类
	 *   实体类中  表名.字段名  可以获取到该字段的值，根据该值和分值表比较，用于来获取该字段的分值
	 *   表名.字段名 通过因子遍历得到
	 * @param 
	 * @author 
	 * @throws Exception
	 * @时间：20190719
	 * @修改记录：
	 */
	public RiskGradeVo  assessScore(RiskRequestVo riskRequestVo){
		RiskGradeVo riskGradeVo =new RiskGradeVo();
//		RiskReportMain riskReportMain = riskRequestVo.getRiskReportMain();
		// 用于储存每一类的总分值信息
		Map<String, BigDecimal>  scoreTotalMap = new HashMap<String, BigDecimal>();
		
		Map<String, String> mapObject = new HashMap<String, String>(); 
		/*通过反射将将对象中的值获取并整合到map中*/
		mapObject = riskCommonService.setObjectValueToMap(riskRequestVo);
		
		String riskModel = riskRequestVo.getRiskReportMainVo().getRiskModel();
		Map<String, String> map = new HashMap<String, String>();
		map.put("riskModel", riskModel);
		map.put("factorType", "01,02");
		Map<String, List<UtiFactor>>  mapUtiFactorF =  riskCommonService.getUtiFactorList(map);
		
		map.put("factorType", "03,04");
		Map<String, List<UtiFactor>>  mapUtiFactorY =  riskCommonService.getUtiFactorList(map);
		map.remove("factorType");
		// 获取公式表信息
		Map<String,UtiFormula>  mapUtiFormula =  riskCommonService.getUtiFormulaList(map);
		// 获取分值信息
		Map<String, Object>  scoreMap = riskCommonService.getScoreMap(map);
		/*查询权重表信息*/
		List<UtiWeight>  utiWeightList =utiWeightMapper.getUtiWeightList(map);
		
		if(!mapUtiFactorF.isEmpty()){
			 for(String key:mapUtiFactorF.keySet()){
				 // 01: 直接获取
				 if("01".equals(key)){
					 for(UtiFactor utiFactor:mapUtiFactorF.get(key)){
						 BigDecimal score = BigDecimal.ZERO;
						 score =  riskCommonService.getScoreValue(mapObject,utiFactor,scoreMap);
						 // 如果存在，则进行累加；否则我们直接对分值进行保存
						 if(!scoreTotalMap.containsKey(utiFactor.getDangerType())){
							 scoreTotalMap.put(utiFactor.getDangerType(), score);
						 }else {
							 scoreTotalMap.put(utiFactor.getDangerType(),
									 scoreTotalMap.get(utiFactor.getDangerType()).add(score));
						 }
					 } 
				 }else if("02".equals(key)){
					 // 通过循环公式表来获取分值
					 if(!mapUtiFormula.isEmpty()){
						 for(UtiFormula utiFormula:mapUtiFormula.values()){
							 BigDecimal formulaScore = BigDecimal.ZERO;
							 formulaScore =  riskCommonService.getUtiFormulaScoreValue(mapObject,utiFormula,mapUtiFactorY,scoreMap);
							 
							 // 如果存在，则进行累加；否则我们直接对分值进行保存
							 if(!scoreTotalMap.containsKey(utiFormula.getDangerType())){
								 scoreTotalMap.put(utiFormula.getDangerType(), formulaScore);
							 }else {
								 scoreTotalMap.put(utiFormula.getDangerType(),
										 scoreTotalMap.get(utiFormula.getDangerType()).add(formulaScore));
							 }
						 }
					 }
				 }

			 }
		}
		// 组织前台返回的分值信息
		riskGradeVo = riskCommonService.establishRiskGradeInfo(utiWeightList,scoreTotalMap,riskModel);
		
		return riskGradeVo;
	}
	
	/**
	 * @功能：查询RiskReportMain数据以及他所关联的子表数据
	 * @param 
	 * @author 
	 * @throws Exception
	 * @时间：20190814
	 * @修改记录：
	 */
	public AjaxResult  queryRiskReportFire(String riskFileNo){
		AjaxResult ajaxResult =new AjaxResult();
		
		RiskReportMain riskReportMain =riskReportMainMapper.queryRiskReportFire(riskFileNo);
		ajaxResult.setData(riskReportMain);
		
		return ajaxResult;
	}
	/**
	 * @功能：查询风控报告，分页
	 * @param 
	 * @author 
	 * @throws Exception
	 * @时间：20190814
	 * @修改记录：
	 */
	public AjaxResult  queryRiskReportMainPage(RiskRequestVo riskRequestVo){
		AjaxResult ajaxResult =new AjaxResult();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("offset", (riskRequestVo.getPageNo()-1)*riskRequestVo.getPageSize());
		map.put("pageSize", riskRequestVo.getPageSize());
		map.put("riskReportMainVo", riskRequestVo.getRiskReportMainVo());
		// 进行分页查询
		List<RiskReportMain> riskReportMainList =riskReportMainMapper.queryRiskReportMainPage(map);
		 //根据条件查询出总的条数
		Integer count = riskReportMainMapper.queryRiskReportMainCount(map);
		Map<String, Object> mapPage= new HashMap<String, Object>();
		mapPage.put("count", count);
		ajaxResult.setData(riskReportMainList);
		ajaxResult.setMap(mapPage);
		return ajaxResult;
	}
	
	// 从数据源
	public  AjaxResult querySlaveAndMasterTable(){
		AjaxResult ajaxResult =new AjaxResult();
		User user =userMapper.selectByPrimaryKey("3");
//		long index = 1L;
//		UtiWeight  utiWeight= utiWeightMapper.selectByPrimaryKey(index);
		return ajaxResult;
	}
	// 主数据源
	public  AjaxResult querySlaveAndMasterTable2(){
		AjaxResult ajaxResult =new AjaxResult();
		long index = 1L;
		UtiWeight  utiWeight= utiWeightMapper.selectById(index);
		return ajaxResult;
	}
} 
