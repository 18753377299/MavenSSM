package com.riskfire.service.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.dao.UtiWeightMapper;
import com.common.service.RiskCommonService;
import com.po.request.RiskRequestVo;
import com.po.response.RiskGradeVo;
import com.riskfire.dao.RiskFireDao;
import com.riskfire.service.RiskFireService;
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
				 }else {
					 
				 }

			 }
			if(mapUtiFactorF.containsKey("01")){
				/* 01 为直接因子*/
				
			}
		}
		
		return riskGradeVo;
	}
	
	//获取01类型的分值信息
//	public BigDecimal getScoreValue(Map<String, String> mapObject,UtiFactor utiFactor){
//		
//		return null;
//	}
	
} 
