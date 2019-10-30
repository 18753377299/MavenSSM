package com.example.dao;

import org.apache.ibatis.annotations.Param;

import com.example.vo.RiskMapMain;

public interface RiskMapMainMapper {
    int deleteByPrimaryKey(@Param("addressid") Integer addressid, @Param("proposalno") String proposalno);

    int insert(RiskMapMain record);

    int insertSelective(RiskMapMain record);

    RiskMapMain selectByPrimaryKey(@Param("addressid") Integer addressid, @Param("proposalno") String proposalno);

    int updateByPrimaryKeySelective(RiskMapMain record);

    int updateByPrimaryKey(RiskMapMain record);
}