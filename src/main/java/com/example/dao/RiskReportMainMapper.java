package com.example.dao;

import java.util.List;
import java.util.Map;

import com.example.vo.RiskReportMain;

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
    /**mysql通过分页查询数据*/
    public List<RiskReportMain>  queryRiskReportMainPage(Map<String, Object> map);
    /*查询出总条数 */
    public  Integer  queryRiskReportMainCount(Map<String, Object> map);
    
    
}