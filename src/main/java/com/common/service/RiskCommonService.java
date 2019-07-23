package com.common.service;

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
	
	public Map<String, Map<String,List<UtiFormula>> >  getUtiFormulaList(Map<String, String> map);
	
}
