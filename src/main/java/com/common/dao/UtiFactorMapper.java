package com.common.dao;

import java.util.List;
import java.util.Map;

import com.vo.UtiFactor;

import org.apache.ibatis.annotations.Param;

public interface UtiFactorMapper {
	
    int deleteByPrimaryKey(@Param("riskModel") String riskModel, @Param("factorNo") String factorNo, @Param("dangerType") String dangerType);

    int insert(UtiFactor record);

    int insertSelective(UtiFactor record);

    UtiFactor selectByPrimaryKey(@Param("riskModel") String riskModel, @Param("factorNo") String factorNo, @Param("dangerType") String dangerType);

    int updateByPrimaryKeySelective(UtiFactor record);

    int updateByPrimaryKey(UtiFactor record);
    
    /**
	 * @author  liqiankun 
	 * @date 创建时间：20190723
	 * @version 1.0 
	 * @parameter 
	 * @since 查询出UtiFactor的集合
	 * @return  
	 * */
	public  List<UtiFactor> getUtiFactorList(Map<String, String> map);
}