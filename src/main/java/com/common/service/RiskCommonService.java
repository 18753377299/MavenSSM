package com.common.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.po.response.RiskGradeVo;
import com.vo.UtiFactor;
import com.vo.UtiFormula;
import com.vo.UtiWeight;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年7月19日 下午4:45:59
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public interface RiskCommonService {
	
	public  Map<String, List<UtiFactor>>   getUtiFactorList(Map<String, String> map);
	
//	public Map<String, Map<String,List<UtiFormula>>>  getUtiFormulaList(Map<String, String> map);
	
	public  Map<String,UtiFormula>  getUtiFormulaList(Map<String, String> map);
	/**
	 * @author  liqiankun 
	 * @date 创建时间：20190725
	 * @version 1.0 
	 * @parameter 
	 * @since  通过反射将将对象中的值获取并整合到map中
	 * @return  
	 * */
	public Map<String, String>  setObjectValueToMap(Object object);
	/**
	 * @author  liqiankun 
	 * @date 创建时间：20190723
	 * @version 1.0 
	 * @parameter 
	 * @since  组织分值表的信息
	 * @return  
	 * */
	public  Map<String, Object> getScoreMap(Map<String, String> map);
	
	/**
	 * @author  liqiankun 
	 * @date 创建时间：20190723
	 * @version 1.0 
	 * @parameter  mapObject(页面中的字段值 )，utiFactor(factorType：01 类型的因子信息)，scoreMap（所有的分数）
	 * @since  获取01类型的分值信息
	 * @return  
	 * */
	public BigDecimal getScoreValue(Map<String, String> mapObject,UtiFactor utiFactor,Map<String, Object>  scoreMap);
	/**
	 * @author  liqiankun 
	 * @date 创建时间：20190813
	 * @version 1.0 
	 * @parameter  mapObject(页面中的字段值 ),utiFormula 公式表信息，mapUtiFactorY(factorType：03，04 类型的因子信息)，scoreMap（所有的分数）
	 * @since  获取配置的公式的表的信息
	 * @return  
	 * */
	public BigDecimal getUtiFormulaScoreValue(Map<String, String> mapObject,UtiFormula utiFormula,
			Map<String, List<UtiFactor>> mapUtiFactorY,Map<String, Object>  scoreMap);
	
	/**
	 * @author  liqiankun 
	 * @date 创建时间：20190813
	 * @version 1.0 
	 * @parameter 
	 * @since  组织前台返回的分值信息
	 * @return  
	 * */
	public RiskGradeVo  establishRiskGradeInfo(List<UtiWeight>  utiWeightList,Map<String, BigDecimal>  scoreTotalMap,String riskModel);
	
	
}
