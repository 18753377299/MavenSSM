package com.common.dao;

import com.vo.UtiFactor;
import org.apache.ibatis.annotations.Param;

public interface UtiFactorMapper {
	
    int deleteByPrimaryKey(@Param("riskModel") String riskModel, @Param("factorNo") String factorNo, @Param("dangerType") String dangerType);

    int insert(UtiFactor record);

    int insertSelective(UtiFactor record);

    UtiFactor selectByPrimaryKey(@Param("riskModel") String riskModel, @Param("factorNo") String factorNo, @Param("dangerType") String dangerType);

    int updateByPrimaryKeySelective(UtiFactor record);

    int updateByPrimaryKey(UtiFactor record);
}