package com.common.dao;

import java.util.List;
import java.util.Map;

import com.vo.UtiFactor;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年7月22日 上午10:11:50
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public interface RiskCommonDao {
	
	/*查询出UtiFactor的集合*/
	public  List<UtiFactor> getUtiFactorList(Map<String, String> map);
	
}
