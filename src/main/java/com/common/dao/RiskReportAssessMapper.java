package com.common.dao;

import com.vo.RiskReportAssess;

public interface RiskReportAssessMapper {
	
    int deleteByPrimaryKey(String riskFileNo);

    int insert(RiskReportAssess record);

    int insertSelective(RiskReportAssess record);

    RiskReportAssess selectByPrimaryKey(String riskFileNo);

    int updateByPrimaryKeySelective(RiskReportAssess record);

    int updateByPrimaryKey(RiskReportAssess record);
}