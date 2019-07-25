package com.riskfire.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.service.RiskCommonService;
import com.po.request.RiskRequestVo;
import com.po.response.RiskGradeVo;
import com.riskfire.dao.RiskFireDao;
import com.riskfire.service.RiskFireService;
import com.vo.UtiFactor;
import com.vo.UtiFormula;

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
		
		Map<String, String> mapObject = new HashMap<String, String>(); 
		/*通过反射将将对象中的值获取并整合到map中*/
		mapObject = riskCommonService.setObjectValueToMap(riskRequestVo);
		String riskModel = riskRequestVo.getRiskReportMain().getRiskModel();
		Map<String, String> map = new HashMap<String, String>();
		map.put("riskModel", riskModel);
		map.put("dangeType", "01,02");
		Map<String, List<UtiFactor>>  mapUtiFactorF =  riskCommonService.getUtiFactorList(map);
		
		map.put("dangeType", "03,04");
		Map<String, List<UtiFactor>>  mapUtiFactorY =  riskCommonService.getUtiFactorList(map);
		map.remove("dangeType");
		// 获取公式表信息
		Map<String,UtiFormula>  mapUtiFormula =  riskCommonService.getUtiFormulaList(map);
		if(!mapUtiFactorF.isEmpty()){
			 for(String key:mapUtiFactorF.keySet()){
				 if("01".equals(key)){
					 for(UtiFactor utiFactor:mapUtiFactorF.get(key)){
						 
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
	
	public 	List<UtiFactor> getUtiFactorById(Map<String, String> map){
//		List<UtiFactor>  utiFactorList =  riskFireDao.getUtiFactorById(map);
		
//		return utiFactorList;
		return null;
	}
	
} 
