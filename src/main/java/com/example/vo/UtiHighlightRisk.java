package com.example.vo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UtiHighlightRisk implements Serializable {
    @ApiModelProperty(value = "风控模板号")
    private String riskModel;

    @ApiModelProperty(value = "存储表名")
    private String fromTable;

    @ApiModelProperty(value = "存储字段名")
    private String fromColumn;

    @ApiModelProperty(value = "取值")
    private String riskValue;

    @ApiModelProperty(value = "取值是否为突出风险")
    private String riskFlag;

    @ApiModelProperty(value = "有效标志位")
    private String validStatus;

    @ApiModelProperty(value = "插入时间")
    private Date insertTimeForHis;

    @ApiModelProperty(value = "修改时间")
    private Date operateTimeForHis;

    @ApiModelProperty(value = "突出风险描述")
    private String riskReminder;

    private static final long serialVersionUID = 1L;

    public String getRiskModel() {
        return riskModel;
    }

    public void setRiskModel(String riskModel) {
        this.riskModel = riskModel == null ? null : riskModel.trim();
    }

    public String getFromTable() {
        return fromTable;
    }

    public void setFromTable(String fromTable) {
        this.fromTable = fromTable == null ? null : fromTable.trim();
    }

    public String getFromColumn() {
        return fromColumn;
    }

    public void setFromColumn(String fromColumn) {
        this.fromColumn = fromColumn == null ? null : fromColumn.trim();
    }

    public String getRiskValue() {
        return riskValue;
    }

    public void setRiskValue(String riskValue) {
        this.riskValue = riskValue == null ? null : riskValue.trim();
    }

    public String getRiskFlag() {
        return riskFlag;
    }

    public void setRiskFlag(String riskFlag) {
        this.riskFlag = riskFlag == null ? null : riskFlag.trim();
    }

    public String getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus == null ? null : validStatus.trim();
    }

    public Date getInsertTimeForHis() {
        return insertTimeForHis;
    }

    public void setInsertTimeForHis(Date insertTimeForHis) {
        this.insertTimeForHis = insertTimeForHis;
    }

    public Date getOperateTimeForHis() {
        return operateTimeForHis;
    }

    public void setOperateTimeForHis(Date operateTimeForHis) {
        this.operateTimeForHis = operateTimeForHis;
    }

    public String getRiskReminder() {
        return riskReminder;
    }

    public void setRiskReminder(String riskReminder) {
        this.riskReminder = riskReminder == null ? null : riskReminder.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", riskModel=").append(riskModel);
        sb.append(", fromTable=").append(fromTable);
        sb.append(", fromColumn=").append(fromColumn);
        sb.append(", riskValue=").append(riskValue);
        sb.append(", riskFlag=").append(riskFlag);
        sb.append(", validStatus=").append(validStatus);
        sb.append(", insertTimeForHis=").append(insertTimeForHis);
        sb.append(", operateTimeForHis=").append(operateTimeForHis);
        sb.append(", riskReminder=").append(riskReminder);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}