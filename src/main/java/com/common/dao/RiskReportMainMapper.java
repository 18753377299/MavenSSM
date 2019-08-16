package com.common.dao;

import java.util.List;
import java.util.Map;

import com.po.request.RiskRequestVo;
import com.vo.RiskReportMain;

public interface RiskReportMainMapper {
    int deleteByPrimaryKey(String riskFileNo);

    int insert(RiskReportMain record);

    int insertSelective(RiskReportMain record);

    RiskReportMain selectByPrimaryKey(String riskFileNo);

    int updateByPrimaryKeySelective(RiskReportMain record);

    int updateByPrimaryKeyWithBLOBs(RiskReportMain record);

    int updateByPrimaryKey(RiskReportMain record);
    /*查询RiskReportMain数据以及他所关联的子表数据*/
    public RiskReportMain queryRiskReportFire(String riskFileNo);
    
    public List<RiskReportMain>  queryRiskReportMainPage(Map<String, Object> map);
    
}