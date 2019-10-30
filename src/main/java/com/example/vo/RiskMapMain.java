package com.example.vo;

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
* @since  地图主类
* @return  */

public class RiskMapMain implements Serializable {
    private Integer addressid;

    private String proposalno;

    private String policyno;

    private String classcode;

    private String riskcode;

    private Date startdate;

    private Short starthour;

    private Date enddate;

    private Short endhour;

    private BigDecimal sumamount;

    private String coinsflag;

    private BigDecimal coinsrate;

    private String comcode;

    private BigDecimal reamountchg;

    private static final long serialVersionUID = 1L;

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public String getProposalno() {
        return proposalno;
    }

    public void setProposalno(String proposalno) {
        this.proposalno = proposalno == null ? null : proposalno.trim();
    }

    public String getPolicyno() {
        return policyno;
    }

    public void setPolicyno(String policyno) {
        this.policyno = policyno == null ? null : policyno.trim();
    }

    public String getClasscode() {
        return classcode;
    }

    public void setClasscode(String classcode) {
        this.classcode = classcode == null ? null : classcode.trim();
    }

    public String getRiskcode() {
        return riskcode;
    }

    public void setRiskcode(String riskcode) {
        this.riskcode = riskcode == null ? null : riskcode.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Short getStarthour() {
        return starthour;
    }

    public void setStarthour(Short starthour) {
        this.starthour = starthour;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Short getEndhour() {
        return endhour;
    }

    public void setEndhour(Short endhour) {
        this.endhour = endhour;
    }

    public BigDecimal getSumamount() {
        return sumamount;
    }

    public void setSumamount(BigDecimal sumamount) {
        this.sumamount = sumamount;
    }

    public String getCoinsflag() {
        return coinsflag;
    }

    public void setCoinsflag(String coinsflag) {
        this.coinsflag = coinsflag == null ? null : coinsflag.trim();
    }

    public BigDecimal getCoinsrate() {
        return coinsrate;
    }

    public void setCoinsrate(BigDecimal coinsrate) {
        this.coinsrate = coinsrate;
    }

    public String getComcode() {
        return comcode;
    }

    public void setComcode(String comcode) {
        this.comcode = comcode == null ? null : comcode.trim();
    }

    public BigDecimal getReamountchg() {
        return reamountchg;
    }

    public void setReamountchg(BigDecimal reamountchg) {
        this.reamountchg = reamountchg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", addressid=").append(addressid);
        sb.append(", proposalno=").append(proposalno);
        sb.append(", policyno=").append(policyno);
        sb.append(", classcode=").append(classcode);
        sb.append(", riskcode=").append(riskcode);
        sb.append(", startdate=").append(startdate);
        sb.append(", starthour=").append(starthour);
        sb.append(", enddate=").append(enddate);
        sb.append(", endhour=").append(endhour);
        sb.append(", sumamount=").append(sumamount);
        sb.append(", coinsflag=").append(coinsflag);
        sb.append(", coinsrate=").append(coinsrate);
        sb.append(", comcode=").append(comcode);
        sb.append(", reamountchg=").append(reamountchg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}