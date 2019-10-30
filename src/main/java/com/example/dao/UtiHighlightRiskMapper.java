package com.example.dao;

import org.apache.ibatis.annotations.Param;

import com.example.vo.UtiHighlightRisk;

public interface UtiHighlightRiskMapper {
    int deleteByPrimaryKey(@Param("riskModel") String riskModel, @Param("fromTable") String fromTable, @Param("fromColumn") String fromColumn, @Param("riskValue") String riskValue);

    int insert(UtiHighlightRisk record);

    int insertSelective(UtiHighlightRisk record);

    UtiHighlightRisk selectByPrimaryKey(@Param("riskModel") String riskModel, @Param("fromTable") String fromTable, @Param("fromColumn") String fromColumn, @Param("riskValue") String riskValue);

    int updateByPrimaryKeySelective(UtiHighlightRisk record);

    int updateByPrimaryKeyWithBLOBs(UtiHighlightRisk record);

    int updateByPrimaryKey(UtiHighlightRisk record);
}