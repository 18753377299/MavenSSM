package com.vo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UtiFormula implements Serializable {
    @ApiModelProperty(value = "风控模板号")
    private String riskModel;

    @ApiModelProperty(value = "因子编号")
    private String factorNo;

    @ApiModelProperty(value = "灾因")
    private String dangerType;

    @ApiModelProperty(value = "集合类型")
    private String listType;

    @ApiModelProperty(value = "有效标志位")
    private String validStatus;

    @ApiModelProperty(value = "插入时间")
    private Date insertTimeForHis;

    @ApiModelProperty(value = "修改时间")
    private Date operateTimeForHis;

    @ApiModelProperty(value = "计算公式")
    private String content;

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

    public String getListType() {
        return listType;
    }

    public void setListType(String listType) {
        this.listType = listType == null ? null : listType.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
        sb.append(", listType=").append(listType);
        sb.append(", validStatus=").append(validStatus);
        sb.append(", insertTimeForHis=").append(insertTimeForHis);
        sb.append(", operateTimeForHis=").append(operateTimeForHis);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}