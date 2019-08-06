package com.common.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.vo.UtiFactor;
import com.vo.UtiFormula;
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
	
	public BigDecimal getScoreValue(Map<String, String> mapObject,UtiFactor utiFactor,Map<String, Object>  scoreMap);
	
	
	
	
}
