package com.example.dao;

import java.util.List;

import com.example.vo.RiskReportFireDanger;

public interface RiskReportFireDangerMapper {
    int deleteByPrimaryKey(String riskFileNo);

    int insert(RiskReportFireDanger record);

    int insertSelective(RiskReportFireDanger record);

    RiskReportFireDanger selectByPrimaryKey(String riskFileNo);

    int updateByPrimaryKeySelective(RiskReportFireDanger record);

    int updateByPrimaryKey(RiskReportFireDanger record);
    /*批量插入信息*/
    int insertBatchFireDanger(List<RiskReportFireDanger> riskReportFireDangerList);
    
    
    
}