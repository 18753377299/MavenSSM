package com.vo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
    private BigDecimal fireDanger;

    @ApiModelProperty(value = "水灾风险值")
    private BigDecimal waterDanger;

    @ApiModelProperty(value = "风灾风险值")
    private BigDecimal windDanger;

    @ApiModelProperty(value = "雷灾风险值")
    private BigDecimal thunderDanger;

    @ApiModelProperty(value = "雪灾风险值")
    private BigDecimal snowDanger;

    @ApiModelProperty(value = "盗抢风险值")
    private BigDecimal theftDanger;

    @ApiModelProperty(value = "地震风险值")
    private BigDecimal earthQuakeDanger;

    @ApiModelProperty(value = "地质灾害风险值")
    private BigDecimal geologyDanger;

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

    public BigDecimal getFireDanger() {
        return fireDanger;
    }

    public void setFireDanger(BigDecimal fireDanger) {
        this.fireDanger = fireDanger;
    }

    public BigDecimal getWaterDanger() {
        return waterDanger;
    }

    public void setWaterDanger(BigDecimal waterDanger) {
        this.waterDanger = waterDanger;
    }

    public BigDecimal getWindDanger() {
        return windDanger;
    }

    public void setWindDanger(BigDecimal windDanger) {
        this.windDanger = windDanger;
    }

    public BigDecimal getThunderDanger() {
        return thunderDanger;
    }

    public void setThunderDanger(BigDecimal thunderDanger) {
        this.thunderDanger = thunderDanger;
    }

    public BigDecimal getSnowDanger() {
        return snowDanger;
    }

    public void setSnowDanger(BigDecimal snowDanger) {
        this.snowDanger = snowDanger;
    }

    public BigDecimal getTheftDanger() {
        return theftDanger;
    }

    public void setTheftDanger(BigDecimal theftDanger) {
        this.theftDanger = theftDanger;
    }

    public BigDecimal getEarthQuakeDanger() {
        return earthQuakeDanger;
    }

    public void setEarthQuakeDanger(BigDecimal earthQuakeDanger) {
        this.earthQuakeDanger = earthQuakeDanger;
    }

    public BigDecimal getGeologyDanger() {
        return geologyDanger;
    }

    public void setGeologyDanger(BigDecimal geologyDanger) {
        this.geologyDanger = geologyDanger;
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
        sb.append(", fireDanger=").append(fireDanger);
        sb.append(", waterDanger=").append(waterDanger);
        sb.append(", windDanger=").append(windDanger);
        sb.append(", thunderDanger=").append(thunderDanger);
        sb.append(", snowDanger=").append(snowDanger);
        sb.append(", theftDanger=").append(theftDanger);
        sb.append(", earthQuakeDanger=").append(earthQuakeDanger);
        sb.append(", geologyDanger=").append(geologyDanger);
        sb.append(", validStatus=").append(validStatus);
        sb.append(", insertTimeForHis=").append(insertTimeForHis);
        sb.append(", operateTimeForHis=").append(operateTimeForHis);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}