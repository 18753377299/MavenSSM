package com.vo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * @功能：权重表
 * @param 
 * @author 
 * @throws Exception
 * @时间：20190719
 * @修改记录：
 */
public class UtiWeight implements Serializable {
    @ApiModelProperty(value = "id号")
    private Long id;

    @ApiModelProperty(value = "有效标志位")
    private String riskModel;

    @ApiModelProperty(value = "归属机构")
    private String comCode;

    @ApiModelProperty(value = "维护人代码")
    private String operatorCode;

    @ApiModelProperty(value = "维护人名称")
    private String operatorName;

    @ApiModelProperty(value = "火灾风险值")
    private BigDecimal fireWeight;

    @ApiModelProperty(value = "水灾风险值")
    private BigDecimal waterWeight;

    @ApiModelProperty(value = "风灾风险值")
    private BigDecimal windWeight;

    @ApiModelProperty(value = "雷灾风险值")
    private BigDecimal thunderWeight;

    @ApiModelProperty(value = "雪灾风险值")
    private BigDecimal snowWeight;

    @ApiModelProperty(value = "盗抢风险值")
    private BigDecimal theftWeight;

    @ApiModelProperty(value = "地震风险值")
    private BigDecimal earthquakeWeight;

    @ApiModelProperty(value = "地质灾害风险值")
    private BigDecimal geologyWeight;

    @ApiModelProperty(value = "有效标志位")
    private String validStatus;

    @ApiModelProperty(value = "插入时间")
    private Date insertTimeForHis;

    @ApiModelProperty(value = "修改时间")
    private Date operateTimeForHis;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRiskModel() {
        return riskModel;
    }

    public void setRiskModel(String riskModel) {
        this.riskModel = riskModel == null ? null : riskModel.trim();
    }

    public String getComCode() {
        return comCode;
    }

    public void setComCode(String comCode) {
        this.comCode = comCode == null ? null : comCode.trim();
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode == null ? null : operatorCode.trim();
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public BigDecimal getFireWeight() {
        return fireWeight;
    }

    public void setFireWeight(BigDecimal fireWeight) {
        this.fireWeight = fireWeight;
    }

    public BigDecimal getWaterWeight() {
        return waterWeight;
    }

    public void setWaterWeight(BigDecimal waterWeight) {
        this.waterWeight = waterWeight;
    }

    public BigDecimal getWindWeight() {
        return windWeight;
    }

    public void setWindWeight(BigDecimal windWeight) {
        this.windWeight = windWeight;
    }

    public BigDecimal getThunderWeight() {
        return thunderWeight;
    }

    public void setThunderWeight(BigDecimal thunderWeight) {
        this.thunderWeight = thunderWeight;
    }

    public BigDecimal getSnowWeight() {
        return snowWeight;
    }

    public void setSnowWeight(BigDecimal snowWeight) {
        this.snowWeight = snowWeight;
    }

    public BigDecimal getTheftWeight() {
        return theftWeight;
    }

    public void setTheftWeight(BigDecimal theftWeight) {
        this.theftWeight = theftWeight;
    }

    public BigDecimal getEarthquakeWeight() {
        return earthquakeWeight;
    }

    public void setEarthquakeWeight(BigDecimal earthquakeWeight) {
        this.earthquakeWeight = earthquakeWeight;
    }

    public BigDecimal getGeologyWeight() {
        return geologyWeight;
    }

    public void setGeologyWeight(BigDecimal geologyWeight) {
        this.geologyWeight = geologyWeight;
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
        sb.append(", id=").append(id);
        sb.append(", riskModel=").append(riskModel);
        sb.append(", comCode=").append(comCode);
        sb.append(", operatorCode=").append(operatorCode);
        sb.append(", operatorName=").append(operatorName);
        sb.append(", fireWeight=").append(fireWeight);
        sb.append(", waterWeight=").append(waterWeight);
        sb.append(", windWeight=").append(windWeight);
        sb.append(", thunderWeight=").append(thunderWeight);
        sb.append(", snowWeight=").append(snowWeight);
        sb.append(", theftWeight=").append(theftWeight);
        sb.append(", earthquakeWeight=").append(earthquakeWeight);
        sb.append(", geologyWeight=").append(geologyWeight);
        sb.append(", validStatus=").append(validStatus);
        sb.append(", insertTimeForHis=").append(insertTimeForHis);
        sb.append(", operateTimeForHis=").append(operateTimeForHis);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}