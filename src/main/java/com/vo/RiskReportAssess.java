package com.vo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
* @author 作者   liqiankun
* @E-mail:   
* @date 创建时间：20190813
* @version 1.0 
* @parameter 
* @since  echarts图显示表
* @return  */
public class RiskReportAssess implements Serializable {
    @ApiModelProperty(value = "风险档案编号")
    private String riskFileNo;

    @ApiModelProperty(value = "火灾")
    private BigDecimal fireDanger;

    @ApiModelProperty(value = "水灾")
    private BigDecimal waterDanger;

    @ApiModelProperty(value = "风灾")
    private BigDecimal windDanger;

    @ApiModelProperty(value = "雷雨灾害")
    private BigDecimal thunderDanger;

    @ApiModelProperty(value = "雪灾")
    private BigDecimal snowDanger;

    @ApiModelProperty(value = "盗抢灾害")
    private BigDecimal theftDanger;

    @ApiModelProperty(value = "地震灾害")
    private BigDecimal earthQuakeDanger;

    @ApiModelProperty(value = "地质灾害")
    private BigDecimal geologyDanger;

    private Date inserttimeforhis;

    private Date operatetimeforhis;

    private static final long serialVersionUID = 1L;

    public String getRiskFileNo() {
        return riskFileNo;
    }

    public void setRiskFileNo(String riskFileNo) {
        this.riskFileNo = riskFileNo == null ? null : riskFileNo.trim();
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

    public Date getInserttimeforhis() {
        return inserttimeforhis;
    }

    public void setInserttimeforhis(Date inserttimeforhis) {
        this.inserttimeforhis = inserttimeforhis;
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
        sb.append(", riskFileNo=").append(riskFileNo);
        sb.append(", fireDanger=").append(fireDanger);
        sb.append(", waterDanger=").append(waterDanger);
        sb.append(", windDanger=").append(windDanger);
        sb.append(", thunderDanger=").append(thunderDanger);
        sb.append(", snowDanger=").append(snowDanger);
        sb.append(", theftDanger=").append(theftDanger);
        sb.append(", earthQuakeDanger=").append(earthQuakeDanger);
        sb.append(", geologyDanger=").append(geologyDanger);
        sb.append(", inserttimeforhis=").append(inserttimeforhis);
        sb.append(", operatetimeforhis=").append(operatetimeforhis);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}