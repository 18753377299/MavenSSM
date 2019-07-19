package com.riskfire.dao;

import java.util.List;
import java.util.Map;

import com.vo.UtiFactor;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年7月19日 下午4:05:03
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public interface RiskFireDao {
	public List<UtiFactor> getUtiFactorById(Map<String, String> map);
	
}
