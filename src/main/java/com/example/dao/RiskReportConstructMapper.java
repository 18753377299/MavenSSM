package com.example.dao;

import com.example.vo.RiskReportConstruct;

public interface RiskReportConstructMapper {
    int deleteByPrimaryKey(String riskfileno);

    int insert(RiskReportConstruct record);

    int insertSelective(RiskReportConstruct record);

    RiskReportConstruct selectByPrimaryKey(String riskfileno);

    int updateByPrimaryKeySelective(RiskReportConstruct record);

    int updateByPrimaryKey(RiskReportConstruct record);
}