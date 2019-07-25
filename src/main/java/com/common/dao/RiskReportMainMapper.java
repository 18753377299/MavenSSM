package com.common.dao;

import com.vo.RiskReportMain;

public interface RiskReportMainMapper {
    int deleteByPrimaryKey(String riskFileNo);

    int insert(RiskReportMain record);

    int insertSelective(RiskReportMain record);

    RiskReportMain selectByPrimaryKey(String riskFileNo);

    int updateByPrimaryKeySelective(RiskReportMain record);

    int updateByPrimaryKeyWithBLOBs(RiskReportMain record);

    int updateByPrimaryKey(RiskReportMain record);
}