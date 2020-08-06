package com.example.dao;

import com.example.vo.RiskReportSaleMain;

public interface RiskReportSaleMainMapper {
    int deleteByPrimaryKey(String archivesno);

    int insert(RiskReportSaleMain record);

    int insertSelective(RiskReportSaleMain record);

    RiskReportSaleMain selectByPrimaryKey(String archivesno);

    int updateByPrimaryKeySelective(RiskReportSaleMain record);

    int updateByPrimaryKey(RiskReportSaleMain record);
}