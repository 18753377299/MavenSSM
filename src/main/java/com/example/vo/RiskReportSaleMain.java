package com.example.vo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class RiskReportSaleMain implements Serializable {
    private String archivesno;

    private String explorecomcode;

    private String explorer;

    private String comcode;

    private String checkupcode;

    private String companyname;

    private String exploreaddress;

    private Date exploredate;

    private String checkupflag;

    private String mobileflag;

    private Date inserttimeforhis;

    private Date operatetimeforhis;

    private static final long serialVersionUID = 1L;

    public String getArchivesno() {
        return archivesno;
    }

    public void setArchivesno(String archivesno) {
        this.archivesno = archivesno == null ? null : archivesno.trim();
    }

    public String getExplorecomcode() {
        return explorecomcode;
    }

    public void setExplorecomcode(String explorecomcode) {
        this.explorecomcode = explorecomcode == null ? null : explorecomcode.trim();
    }

    public String getExplorer() {
        return explorer;
    }

    public void setExplorer(String explorer) {
        this.explorer = explorer == null ? null : explorer.trim();
    }

    public String getComcode() {
        return comcode;
    }

    public void setComcode(String comcode) {
        this.comcode = comcode == null ? null : comcode.trim();
    }

    public String getCheckupcode() {
        return checkupcode;
    }

    public void setCheckupcode(String checkupcode) {
        this.checkupcode = checkupcode == null ? null : checkupcode.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getExploreaddress() {
        return exploreaddress;
    }

    public void setExploreaddress(String exploreaddress) {
        this.exploreaddress = exploreaddress == null ? null : exploreaddress.trim();
    }

    public Date getExploredate() {
        return exploredate;
    }

    public void setExploredate(Date exploredate) {
        this.exploredate = exploredate;
    }

    public String getCheckupflag() {
        return checkupflag;
    }

    public void setCheckupflag(String checkupflag) {
        this.checkupflag = checkupflag == null ? null : checkupflag.trim();
    }

    public String getMobileflag() {
        return mobileflag;
    }

    public void setMobileflag(String mobileflag) {
        this.mobileflag = mobileflag == null ? null : mobileflag.trim();
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
        sb.append(", archivesno=").append(archivesno);
        sb.append(", explorecomcode=").append(explorecomcode);
        sb.append(", explorer=").append(explorer);
        sb.append(", comcode=").append(comcode);
        sb.append(", checkupcode=").append(checkupcode);
        sb.append(", companyname=").append(companyname);
        sb.append(", exploreaddress=").append(exploreaddress);
        sb.append(", exploredate=").append(exploredate);
        sb.append(", checkupflag=").append(checkupflag);
        sb.append(", mobileflag=").append(mobileflag);
        sb.append(", inserttimeforhis=").append(inserttimeforhis);
        sb.append(", operatetimeforhis=").append(operatetimeforhis);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}