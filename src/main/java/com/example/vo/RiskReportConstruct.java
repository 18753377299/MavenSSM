package com.example.vo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class RiskReportConstruct implements Serializable {
    private String riskfileno;

    private Date insert_time_for_his;

    private Date operatetimeforhis;

    private static final long serialVersionUID = 1L;

    public String getRiskfileno() {
        return riskfileno;
    }

    public void setRiskfileno(String riskfileno) {
        this.riskfileno = riskfileno == null ? null : riskfileno.trim();
    }

    public Date getInsert_time_for_his() {
        return insert_time_for_his;
    }

    public void setInsert_time_for_his(Date insert_time_for_his) {
        this.insert_time_for_his = insert_time_for_his;
    }

    public Date getOperatetimeforhis() {
        return operatetimeforhis;
    }

    public void setOperatetimeforhis(Date operatetimeforhis) {
        this.operatetimeforhis = operatetimeforhis;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", riskfileno=").append(riskfileno);
        sb.append(", insert_time_for_his=").append(insert_time_for_his);
        sb.append(", operatetimeforhis=").append(operatetimeforhis);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}