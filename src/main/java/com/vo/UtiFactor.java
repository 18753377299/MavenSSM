package com.vo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UtiFactor implements Serializable {
	
    @ApiModelProperty(value = "风控模板号")
    private String riskModel;

    @ApiModelProperty(value = "因子编号")
    private String factorNo;

    @ApiModelProperty(value = "灾因")
    private String dangerType;

    @ApiModelProperty(value = "因子类型")
    private String factorType;

    @ApiModelProperty(value = "存储表名")
    private String fromTable;

    @ApiModelProperty(value = "存储字段名")
    private String fromColumn;

    @ApiModelProperty(value = "是否允许为空")
    private String nullAble;

    @ApiModelProperty(value = "字段类型")
    private String columnType;

    @ApiModelProperty(value = "字段中文名")
    private String columnCname;

    @ApiModelProperty(value = "最值类型")
    private String factorExtType;

    @ApiModelProperty(value = "最值")
    private BigDecimal factorExt;

    @ApiModelProperty(value = "有效标志位")
    private String validStatus;

    @ApiModelProperty(value = "插入时间")
    private Date insertTimeForHis;

    @ApiModelProperty(value = "修改时间")
    private Date operateTimeForHis;

    private static final long serialVersionUID = 1L;

    public String getRiskModel() {
        return riskModel;
    }

    public void setRiskModel(String riskModel) {
        this.riskModel = riskModel == null ? null : riskModel.trim();
    }

    public String getFactorNo() {
        return factorNo;
    }

    public void setFactorNo(String factorNo) {
        this.factorNo = factorNo == null ? null : factorNo.trim();
    }

    public String getDangerType() {
        return dangerType;
    }

    public void setDangerType(String dangerType) {
        this.dangerType = dangerType == null ? null : dangerType.trim();
    }

    public String getFactorType() {
        return factorType;
    }

    public void setFactorType(String factorType) {
        this.factorType = factorType == null ? null : factorType.trim();
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

    public String getNullAble() {
        return nullAble;
    }

    public void setNullAble(String nullAble) {
        this.nullAble = nullAble == null ? null : nullAble.trim();
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType == null ? null : columnType.trim();
    }

    public String getColumnCname() {
        return columnCname;
    }

    public void setColumnCname(String columnCname) {
        this.columnCname = columnCname == null ? null : columnCname.trim();
    }

    public String getFactorExtType() {
        return factorExtType;
    }

    public void setFactorExtType(String factorExtType) {
        this.factorExtType = factorExtType == null ? null : factorExtType.trim();
    }

    public BigDecimal getFactorExt() {
        return factorExt;
    }

    public void setFactorExt(BigDecimal factorExt) {
        this.factorExt = factorExt;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", riskModel=").append(riskModel);
        sb.append(", factorNo=").append(factorNo);
        sb.append(", dangerType=").append(dangerType);
        sb.append(", factorType=").append(factorType);
        sb.append(", fromTable=").append(fromTable);
        sb.append(", fromColumn=").append(fromColumn);
        sb.append(", nullAble=").append(nullAble);
        sb.append(", columnType=").append(columnType);
        sb.append(", columnCname=").append(columnCname);
        sb.append(", factorExtType=").append(factorExtType);
        sb.append(", factorExt=").append(factorExt);
        sb.append(", validStatus=").append(validStatus);
        sb.append(", insertTimeForHis=").append(insertTimeForHis);
        sb.append(", operateTimeForHis=").append(operateTimeForHis);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}