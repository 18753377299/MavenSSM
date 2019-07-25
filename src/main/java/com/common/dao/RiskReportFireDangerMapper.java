package com.common.dao;

import com.vo.RiskReportFireDanger;

public interface RiskReportFireDangerMapper {
    int deleteByPrimaryKey(String riskFileNo);

    int insert(RiskReportFireDanger record);

    int insertSelective(RiskReportFireDanger record);

    RiskReportFireDanger selectByPrimaryKey(String riskFileNo);

    int updateByPrimaryKeySelective(RiskReportFireDanger record);

    int updateByPrimaryKey(RiskReportFireDanger record);
}