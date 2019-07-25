package com.common.dao;

import com.vo.UtiHighlightRisk;
import org.apache.ibatis.annotations.Param;

public interface UtiHighlightRiskMapper {
    int deleteByPrimaryKey(@Param("riskModel") String riskModel, @Param("fromTable") String fromTable, @Param("fromColumn") String fromColumn, @Param("riskValue") String riskValue);

    int insert(UtiHighlightRisk record);

    int insertSelective(UtiHighlightRisk record);

    UtiHighlightRisk selectByPrimaryKey(@Param("riskModel") String riskModel, @Param("fromTable") String fromTable, @Param("fromColumn") String fromColumn, @Param("riskValue") String riskValue);

    int updateByPrimaryKeySelective(UtiHighlightRisk record);

    int updateByPrimaryKeyWithBLOBs(UtiHighlightRisk record);

    int updateByPrimaryKey(UtiHighlightRisk record);
}