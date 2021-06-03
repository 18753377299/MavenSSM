package com.common.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
@Table(name = "riskFactory_main")
public class RiskFactoryMain implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 风险档案编号 清分为null
     */
    private String riskFileNo;
    /**
     * 归属机构
     */
    private String comCode;
    /**
     * * 模板号
     */
    private String riskModel;
    /**
     * * 被保险人类型 1 个人 2 团体
     */
    private String insuredType;
    /**
     * 被保险人代码
     */
    private String insuredCode;
    /**
     * 被保险人姓名/企业名称
     */
    private String insuredName;
    /**
     * 行业类型代码
     */
    private String businessClass;
    /**
     * 操作人员代码
     */
    private String operatorCode;
    /**
     * 操作人员姓名
     */
    private String operatorName;
    /**
     * 提交核保时间 清分为null
     */
    private Date undwrtSubmitDate;
    /**
     * 审核状态
     * 1. 保存 0
     * 2. 待风险评估机构一级审核 4
     * 3. 一级审核打回 2
     * 4. 待保险公司二级审核 9
     * 5. 二级审核打回 6
     * 6. 二级审核通过 1
     * 7. 暂存  T
     */
    private String underwriteFlag;
    /**
     * 核保通过时间 清分为null
     */
    private Date underwriteDate;
    /**
     * 核保人员代码 清分为null
     */
    private String underwriteCode;
    /**
     * 核保人员姓名 清分为null
     */
    private String underwriteName;
    /**
     * 查勘机构
     */
    private String explorecomCode;
    /**
     * 查勘机构中文
     */
    private String explorecomCodeCName;
    /**
     * 查勘人
     */
    private String explorer;
    /**
     * 查勘人中文
     */
    private String explorerCName;
    /**
     * 查勘日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date exploreDate;
    /**
     * 制作日期
     */
    private Date madeDate;
    /**
     * 请求端标志 0-web 1-Android 2-IOS
     */
    private String mobileFlag;
    /**出单类型，1-内部人员出单 2-外部人员出单*/
    private String issueOrderType;
    /**拓展字段1*/
    private String extendedFieldOne;
    /**拓展字段2*/
    private String extendedFieldTwo;
    /**拓展字段3*/
    private String extendedFieldThree;

    /**
     * 插入时间
     */
    private Date insertTimeForHis;
    /**
     * 更新时间
     */
    private Date operateTimeForHis;

    /**整改清单*/
//    private List<RiskReportFactoryRectify> riskReportFactoryRectifyList = new ArrayList<RiskReportFactoryRectify>(0);
    /** 影像资料 */
//    private List<RiskReportPicture> riskReportPictureList;

    public RiskFactoryMain() {
    }

    public RiskFactoryMain(String riskFileNo, String comCode, String comCodeCName, String riskModel, String insuredType,
                           String insuredCode, String insuredName, String businessSource, String businessSourceName,
                           String businessClass, String operatorCode, String operatorName, Date undwrtSubmitDate,
                           String underwriteFlag, String rectifyFlag, Date underwriteDate, String underwriteCode,
                           String underwriteName, String explorecomCode, String explorecomCodeCName, String explorer,
                           String explorerCName, Date exploreDate, Date madeDate, String exploreType, String lastRiskFileNo,
                           String addRisk, String explain, String highlightRisk, BigDecimal score, String riskSuggest,
                           String othSuggest, String addMessage, String archivesNo, String mobileFlag, String executionId,
                           String rectifyExecutionid, String repulsesugggest, String valuation, Date insertTimeForHis,
                           Date operateTimeForHis) {
        this.riskFileNo = riskFileNo;
        this.comCode = comCode;
        this.riskModel = riskModel;
        this.insuredType = insuredType;
        this.insuredCode = insuredCode;
        this.insuredName = insuredName;
        this.businessClass = businessClass;
        this.operatorCode = operatorCode;
        this.operatorName = operatorName;
        this.undwrtSubmitDate = undwrtSubmitDate;
        this.underwriteFlag = underwriteFlag;
        this.underwriteDate = underwriteDate;
        this.underwriteCode = underwriteCode;
        this.underwriteName = underwriteName;
        this.explorecomCode = explorecomCode;
        this.explorecomCodeCName = explorecomCodeCName;
        this.explorer = explorer;
        this.explorerCName = explorerCName;
        this.exploreDate = exploreDate;
        this.madeDate = madeDate;
        this.insertTimeForHis = insertTimeForHis;
        this.operateTimeForHis = operateTimeForHis;
//        this.riskReportFactoryRectifyList = riskReportFactoryRectifyList;
    }


    @Id
    @Column(name = "RISKFILENO")
    public String getRiskFileNo() {
        return riskFileNo;
    }

    public void setRiskFileNo(String riskFileNo) {
        this.riskFileNo = riskFileNo;
    }

    @Column(name = "COMCODE")
    public String getComCode() {
        return comCode;
    }

    public void setComCode(String comCode) {
        this.comCode = comCode;
    }


    @Column(name = "INSUREDNAME")
    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    @Column(name = "BUSINESSCLASS")
    public String getBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(String businessClass) {
        this.businessClass = businessClass;
    }

    @Column(name = "OPERATORCODE")
    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    @Column(name = "UNDWRTSUBMITDATE")
    public Date getUndwrtSubmitDate() {
        return undwrtSubmitDate;
    }

    public void setUndwrtSubmitDate(Date undwrtSubmitDate) {
        this.undwrtSubmitDate = undwrtSubmitDate;
    }

    @Column(name = "UNDERWRITEFLAG")
    public String getUnderwriteFlag() {
        return underwriteFlag;
    }

    public void setUnderwriteFlag(String underwriteFlag) {
        this.underwriteFlag = underwriteFlag;
    }

    @Column(name = "UNDERWRITEDATE")
    public Date getUnderwriteDate() {
        return underwriteDate;
    }

    public void setUnderwriteDate(Date underwriteDate) {
        this.underwriteDate = underwriteDate;
    }

    @Column(name = "UNDERWRITECODE")
    public String getUnderwriteCode() {
        return underwriteCode;
    }

    public void setUnderwriteCode(String underwriteCode) {
        this.underwriteCode = underwriteCode;
    }

    @Column(name = "UNDERWRITENAME")
    public String getUnderwriteName() {
        return underwriteName;
    }

    public void setUnderwriteName(String underwriteName) {
        this.underwriteName = underwriteName;
    }

    @Column(name = "EXPLORECOMCODE")
    public String getExplorecomCode() {
        return explorecomCode;
    }

    public void setExplorecomCode(String explorecomCode) {
        this.explorecomCode = explorecomCode;
    }

    @Column(name = "EXPLORER")
    public String getExplorer() {
        return explorer;
    }

    public void setExplorer(String explorer) {
        this.explorer = explorer;
    }


    @Column(name = "EXPLOREDATE")
    @Temporal(TemporalType.DATE)
    public Date getExploreDate() {
        return exploreDate;
    }

    public void setExploreDate(Date exploreDate) {
        this.exploreDate = exploreDate;
    }

    @Column(name = "MADEDATE")
    public Date getMadeDate() {
        return madeDate;
    }

    public void setMadeDate(Date madeDate) {
        this.madeDate = madeDate;
    }

    @Column(name = "RISKMODEL")
    public String getRiskModel() {
        return riskModel;
    }

    public void setRiskModel(String riskModel) {
        this.riskModel = riskModel;
    }

    @Column(name = "INSUREDTYPE")
    public String getInsuredType() {
        return insuredType;
    }

    public void setInsuredType(String insuredType) {
        this.insuredType = insuredType;
    }

    @Column(name = "INSUREDCODE")
    public String getInsuredCode() {
        return insuredCode;
    }

    public void setInsuredCode(String insuredCode) {
        this.insuredCode = insuredCode;
    }
    @Column(name = "MOBILEFLAG")
    public String getMobileFlag() {
        return mobileFlag;
    }

    public void setMobileFlag(String mobileFlag) {
        this.mobileFlag = mobileFlag;
    }
    @Transient
    public String getExplorecomCodeCName() {
        return explorecomCodeCName;
    }

    public void setExplorecomCodeCName(String explorecomCodeCName) {
        this.explorecomCodeCName = explorecomCodeCName;
    }

    @Transient
    public String getExplorerCName() {
        return explorerCName;
    }

    public void setExplorerCName(String explorerCName) {
        this.explorerCName = explorerCName;
    }

    @Transient
    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    // @Column(name = "INSERTTIMEFORHIS", insertable = false, updatable = false)
//	@CreatedDate
    @Column(name = "INSERTTIMEFORHIS", updatable = false)
    public Date getInsertTimeForHis() {
        return insertTimeForHis;
    }

    public void setInsertTimeForHis(Date insertTimeForHis) {
        this.insertTimeForHis = insertTimeForHis;
    }

    // @Column(name = "OPERATETIMEFORHIS", insertable = false)
//	@LastModifiedDate
    @Column(name = "OPERATETIMEFORHIS")
    public Date getOperateTimeForHis() {
        return operateTimeForHis;
    }

    public void setOperateTimeForHis(Date operateTimeForHis) {
        this.operateTimeForHis = operateTimeForHis;
    }
/*
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "riskReportSafeFactoryMain")
//	@Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    @Fetch(FetchMode.SUBSELECT)
    public List<RiskReportFactoryRectify> getRiskReportFactoryRectifyList() {
        return riskReportFactoryRectifyList;
    }

    public void setRiskReportFactoryRectifyList(List<RiskReportFactoryRectify> riskReportFactoryRectifyList) {
        this.riskReportFactoryRectifyList = riskReportFactoryRectifyList;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "riskReportSafeFactoryMain")
    @Fetch(FetchMode.SUBSELECT)
    public List<RiskReportPicture> getRiskReportPictureList() {
        return riskReportPictureList;
    }

    public void setRiskReportPictureList(List<RiskReportPicture> riskReportPictureList) {
        this.riskReportPictureList = riskReportPictureList;
    }*/

}
