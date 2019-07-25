package com.vo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RiskReportMain implements Serializable {
	
    @ApiModelProperty(value = "风险档案编号")
    private String riskFileNo;

    @ApiModelProperty(value = "险类代码")
    private String classCode;

    @ApiModelProperty(value = "产品代码")
    private String riskCode;

    @ApiModelProperty(value = "归属机构")
    private String comCode;

    @ApiModelProperty(value = "存货比例")
    private BigDecimal stockRate;

    @ApiModelProperty(value = "风控报告模板 ")
    private String riskModel;

    @ApiModelProperty(value = "被保险人类型")
    private String insuredType;

    @ApiModelProperty(value = "被保险人代码 ")
    private String insuredCode;

    @ApiModelProperty(value = "被保险人姓名/企业名称")
    private String insuredName;

    @ApiModelProperty(value = "保险财产地址(省)")
    private String addressProvince;

    @ApiModelProperty(value = "保险财产地址(市)")
    private String addressCity;

    @ApiModelProperty(value = "保险财产地址(区或县)")
    private String addressCounty;

    @ApiModelProperty(value = "保险财产地址(详细)")
    private String addressDetail;

    @ApiModelProperty(value = " 邮政编码")
    private String postCode;

    @ApiModelProperty(value = "国民经济行业代码")
    private String businessSource;

    @ApiModelProperty(value = "行业类型代码")
    private String businessClass;

    @ApiModelProperty(value = "被保险人/企业性质 ")
    private String unitNature;

    @ApiModelProperty(value = "以往承保情况 ")
    private String underwriteStatus;

    @ApiModelProperty(value = "操作人员代码 ")
    private String operatorCode;

    @ApiModelProperty(value = " 操作人员集团统一工号")
    private String operatorCode_uni;

    @ApiModelProperty(value = " 三年内历史赔付损失记录")
    private String historyLoseFlag;

    @ApiModelProperty(value = "总保险金额")
    private BigDecimal sumAmount;

    @ApiModelProperty(value = "提交核保时间 ")
    private Date undwrtSubmitDate;

    @ApiModelProperty(value = "核保标志 ")
    private String underwriteFlag;

    @ApiModelProperty(value = "核保通过时间")
    private Date underwriteDate;

    @ApiModelProperty(value = "核保人员姓名")
    private String underwriteCode;

    @ApiModelProperty(value = "核保人员姓名")
    private String underwriteName;

    @ApiModelProperty(value = "查勘机构")
    private String explorecomCode;

    @ApiModelProperty(value = "查勘人")
    private String explorer;

    @ApiModelProperty(value = "查勘人集团统一工号")
    private String explorer_uni;

    @ApiModelProperty(value = "查勘日期")
    private Date exploreDate;

    @ApiModelProperty(value = "制作日期")
    private Date madeDate;

    @ApiModelProperty(value = " 查勘类别:1 初勘,2 复勘")
    private String exploreType;

    @ApiModelProperty(value = "初勘风控报告编号")
    private String lastriskFileNo;

    @ApiModelProperty(value = "请求端标志 0-web 1-Android 2-IOS")
    private String mobileFlag;

    @ApiModelProperty(value = "照片编号")
    private String archivesNo;

    @ApiModelProperty(value = "投保附加险情况 A 扩展盗窃、抢劫责任   B 扩展供应中断责任  C 扩展露天堆放责任")
    private String addRisk;

    @ApiModelProperty(value = "单次事故可能最大损失")
    private BigDecimal onceAccidentLosest;

    @ApiModelProperty(value = " 危险单位数量")
    private Integer riskUnitNumber;

    @ApiModelProperty(value = "损失率")
    private BigDecimal loseRate;

    @ApiModelProperty(value = "综合得分")
    private BigDecimal score;

    @ApiModelProperty(value = "需要替换")
    private String riskSuggest;

    @ApiModelProperty(value = "所使用的权重表id")
    private Integer utiWeightId;

    @ApiModelProperty(value = "所使用的流程实例id")
    private String executionId;

    @ApiModelProperty(value = "2000坐标系经度")
    private BigDecimal pointx_2000;

    @ApiModelProperty(value = "2000坐标系纬度")
    private BigDecimal pointy_2000;

    @ApiModelProperty(value = "02坐标系经度")
    private BigDecimal pointx_02;

    @ApiModelProperty(value = "02坐标系纬度")
    private BigDecimal pointy_02;

    @ApiModelProperty(value = "风险评估等级")
    private String valuation;

    @ApiModelProperty(value = "投保单号 ")
    private String proposalNo;

    @ApiModelProperty(value = "保单号")
    private String policyNo;

    @ApiModelProperty(value = " 插入时间")
    private Date insertTimeForHis;

    @ApiModelProperty(value = "更新时间")
    private Date operateTimeForHis;

    @ApiModelProperty(value = "需要替换")
    private String customerExplain;

    @ApiModelProperty(value = "危险单位划分说明 ")
    private String riskUnitExplain;

    @ApiModelProperty(value = "突出风险")
    private String highlightRisk;

    @ApiModelProperty(value = "现场评估补充说明 *or***风险隐患说明")
    private String supplementAppraisal;

    @ApiModelProperty(value = "风控建议 ")
    private String othSuggest;

    @ApiModelProperty(value = "补充说明 * or **防灾防损建议")
    private String addMessage;

    @ApiModelProperty(value = "拒绝建议")
    private String repulseSugggest;

    private static final long serialVersionUID = 1L;

    public String getRiskFileNo() {
        return riskFileNo;
    }

    public void setRiskFileNo(String riskFileNo) {
        this.riskFileNo = riskFileNo == null ? null : riskFileNo.trim();
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode == null ? null : classCode.trim();
    }

    public String getRiskCode() {
        return riskCode;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode == null ? null : riskCode.trim();
    }

    public String getComCode() {
        return comCode;
    }

    public void setComCode(String comCode) {
        this.comCode = comCode == null ? null : comCode.trim();
    }

    public BigDecimal getStockRate() {
        return stockRate;
    }

    public void setStockRate(BigDecimal stockRate) {
        this.stockRate = stockRate;
    }

    public String getRiskModel() {
        return riskModel;
    }

    public void setRiskModel(String riskModel) {
        this.riskModel = riskModel == null ? null : riskModel.trim();
    }

    public String getInsuredType() {
        return insuredType;
    }

    public void setInsuredType(String insuredType) {
        this.insuredType = insuredType == null ? null : insuredType.trim();
    }

    public String getInsuredCode() {
        return insuredCode;
    }

    public void setInsuredCode(String insuredCode) {
        this.insuredCode = insuredCode == null ? null : insuredCode.trim();
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName == null ? null : insuredName.trim();
    }

    public String getAddressProvince() {
        return addressProvince;
    }

    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince == null ? null : addressProvince.trim();
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity == null ? null : addressCity.trim();
    }

    public String getAddressCounty() {
        return addressCounty;
    }

    public void setAddressCounty(String addressCounty) {
        this.addressCounty = addressCounty == null ? null : addressCounty.trim();
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getBusinessSource() {
        return businessSource;
    }

    public void setBusinessSource(String businessSource) {
        this.businessSource = businessSource == null ? null : businessSource.trim();
    }

    public String getBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(String businessClass) {
        this.businessClass = businessClass == null ? null : businessClass.trim();
    }

    public String getUnitNature() {
        return unitNature;
    }

    public void setUnitNature(String unitNature) {
        this.unitNature = unitNature == null ? null : unitNature.trim();
    }

    public String getUnderwriteStatus() {
        return underwriteStatus;
    }

    public void setUnderwriteStatus(String underwriteStatus) {
        this.underwriteStatus = underwriteStatus == null ? null : underwriteStatus.trim();
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode == null ? null : operatorCode.trim();
    }

    public String getOperatorCode_uni() {
        return operatorCode_uni;
    }

    public void setOperatorCode_uni(String operatorCode_uni) {
        this.operatorCode_uni = operatorCode_uni == null ? null : operatorCode_uni.trim();
    }

    public String getHistoryLoseFlag() {
        return historyLoseFlag;
    }

    public void setHistoryLoseFlag(String historyLoseFlag) {
        this.historyLoseFlag = historyLoseFlag == null ? null : historyLoseFlag.trim();
    }

    public BigDecimal getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(BigDecimal sumAmount) {
        this.sumAmount = sumAmount;
    }

    public Date getUndwrtSubmitDate() {
        return undwrtSubmitDate;
    }

    public void setUndwrtSubmitDate(Date undwrtSubmitDate) {
        this.undwrtSubmitDate = undwrtSubmitDate;
    }

    public String getUnderwriteFlag() {
        return underwriteFlag;
    }

    public void setUnderwriteFlag(String underwriteFlag) {
        this.underwriteFlag = underwriteFlag == null ? null : underwriteFlag.trim();
    }

    public Date getUnderwriteDate() {
        return underwriteDate;
    }

    public void setUnderwriteDate(Date underwriteDate) {
        this.underwriteDate = underwriteDate;
    }

    public String getUnderwriteCode() {
        return underwriteCode;
    }

    public void setUnderwriteCode(String underwriteCode) {
        this.underwriteCode = underwriteCode == null ? null : underwriteCode.trim();
    }

    public String getUnderwriteName() {
        return underwriteName;
    }

    public void setUnderwriteName(String underwriteName) {
        this.underwriteName = underwriteName == null ? null : underwriteName.trim();
    }

    public String getExplorecomCode() {
        return explorecomCode;
    }

    public void setExplorecomCode(String explorecomCode) {
        this.explorecomCode = explorecomCode == null ? null : explorecomCode.trim();
    }

    public String getExplorer() {
        return explorer;
    }

    public void setExplorer(String explorer) {
        this.explorer = explorer == null ? null : explorer.trim();
    }

    public String getExplorer_uni() {
        return explorer_uni;
    }

    public void setExplorer_uni(String explorer_uni) {
        this.explorer_uni = explorer_uni == null ? null : explorer_uni.trim();
    }

    public Date getExploreDate() {
        return exploreDate;
    }

    public void setExploreDate(Date exploreDate) {
        this.exploreDate = exploreDate;
    }

    public Date getMadeDate() {
        return madeDate;
    }

    public void setMadeDate(Date madeDate) {
        this.madeDate = madeDate;
    }

    public String getExploreType() {
        return exploreType;
    }

    public void setExploreType(String exploreType) {
        this.exploreType = exploreType == null ? null : exploreType.trim();
    }

    public String getLastriskFileNo() {
        return lastriskFileNo;
    }

    public void setLastriskFileNo(String lastriskFileNo) {
        this.lastriskFileNo = lastriskFileNo == null ? null : lastriskFileNo.trim();
    }

    public String getMobileFlag() {
        return mobileFlag;
    }

    public void setMobileFlag(String mobileFlag) {
        this.mobileFlag = mobileFlag == null ? null : mobileFlag.trim();
    }

    public String getArchivesNo() {
        return archivesNo;
    }

    public void setArchivesNo(String archivesNo) {
        this.archivesNo = archivesNo == null ? null : archivesNo.trim();
    }

    public String getAddRisk() {
        return addRisk;
    }

    public void setAddRisk(String addRisk) {
        this.addRisk = addRisk == null ? null : addRisk.trim();
    }

    public BigDecimal getOnceAccidentLosest() {
        return onceAccidentLosest;
    }

    public void setOnceAccidentLosest(BigDecimal onceAccidentLosest) {
        this.onceAccidentLosest = onceAccidentLosest;
    }

    public Integer getRiskUnitNumber() {
        return riskUnitNumber;
    }

    public void setRiskUnitNumber(Integer riskUnitNumber) {
        this.riskUnitNumber = riskUnitNumber;
    }

    public BigDecimal getLoseRate() {
        return loseRate;
    }

    public void setLoseRate(BigDecimal loseRate) {
        this.loseRate = loseRate;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getRiskSuggest() {
        return riskSuggest;
    }

    public void setRiskSuggest(String riskSuggest) {
        this.riskSuggest = riskSuggest == null ? null : riskSuggest.trim();
    }

    public Integer getUtiWeightId() {
        return utiWeightId;
    }

    public void setUtiWeightId(Integer utiWeightId) {
        this.utiWeightId = utiWeightId;
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId == null ? null : executionId.trim();
    }

    public BigDecimal getPointx_2000() {
        return pointx_2000;
    }

    public void setPointx_2000(BigDecimal pointx_2000) {
        this.pointx_2000 = pointx_2000;
    }

    public BigDecimal getPointy_2000() {
        return pointy_2000;
    }

    public void setPointy_2000(BigDecimal pointy_2000) {
        this.pointy_2000 = pointy_2000;
    }

    public BigDecimal getPointx_02() {
        return pointx_02;
    }

    public void setPointx_02(BigDecimal pointx_02) {
        this.pointx_02 = pointx_02;
    }

    public BigDecimal getPointy_02() {
        return pointy_02;
    }

    public void setPointy_02(BigDecimal pointy_02) {
        this.pointy_02 = pointy_02;
    }

    public String getValuation() {
        return valuation;
    }

    public void setValuation(String valuation) {
        this.valuation = valuation == null ? null : valuation.trim();
    }

    public String getProposalNo() {
        return proposalNo;
    }

    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo == null ? null : proposalNo.trim();
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo == null ? null : policyNo.trim();
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

    public String getCustomerExplain() {
        return customerExplain;
    }

    public void setCustomerExplain(String customerExplain) {
        this.customerExplain = customerExplain == null ? null : customerExplain.trim();
    }

    public String getRiskUnitExplain() {
        return riskUnitExplain;
    }

    public void setRiskUnitExplain(String riskUnitExplain) {
        this.riskUnitExplain = riskUnitExplain == null ? null : riskUnitExplain.trim();
    }

    public String getHighlightRisk() {
        return highlightRisk;
    }

    public void setHighlightRisk(String highlightRisk) {
        this.highlightRisk = highlightRisk == null ? null : highlightRisk.trim();
    }

    public String getSupplementAppraisal() {
        return supplementAppraisal;
    }

    public void setSupplementAppraisal(String supplementAppraisal) {
        this.supplementAppraisal = supplementAppraisal == null ? null : supplementAppraisal.trim();
    }

    public String getOthSuggest() {
        return othSuggest;
    }

    public void setOthSuggest(String othSuggest) {
        this.othSuggest = othSuggest == null ? null : othSuggest.trim();
    }

    public String getAddMessage() {
        return addMessage;
    }

    public void setAddMessage(String addMessage) {
        this.addMessage = addMessage == null ? null : addMessage.trim();
    }

    public String getRepulseSugggest() {
        return repulseSugggest;
    }

    public void setRepulseSugggest(String repulseSugggest) {
        this.repulseSugggest = repulseSugggest == null ? null : repulseSugggest.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", riskFileNo=").append(riskFileNo);
        sb.append(", classCode=").append(classCode);
        sb.append(", riskCode=").append(riskCode);
        sb.append(", comCode=").append(comCode);
        sb.append(", stockRate=").append(stockRate);
        sb.append(", riskModel=").append(riskModel);
        sb.append(", insuredType=").append(insuredType);
        sb.append(", insuredCode=").append(insuredCode);
        sb.append(", insuredName=").append(insuredName);
        sb.append(", addressProvince=").append(addressProvince);
        sb.append(", addressCity=").append(addressCity);
        sb.append(", addressCounty=").append(addressCounty);
        sb.append(", addressDetail=").append(addressDetail);
        sb.append(", postCode=").append(postCode);
        sb.append(", businessSource=").append(businessSource);
        sb.append(", businessClass=").append(businessClass);
        sb.append(", unitNature=").append(unitNature);
        sb.append(", underwriteStatus=").append(underwriteStatus);
        sb.append(", operatorCode=").append(operatorCode);
        sb.append(", operatorCode_uni=").append(operatorCode_uni);
        sb.append(", historyLoseFlag=").append(historyLoseFlag);
        sb.append(", sumAmount=").append(sumAmount);
        sb.append(", undwrtSubmitDate=").append(undwrtSubmitDate);
        sb.append(", underwriteFlag=").append(underwriteFlag);
        sb.append(", underwriteDate=").append(underwriteDate);
        sb.append(", underwriteCode=").append(underwriteCode);
        sb.append(", underwriteName=").append(underwriteName);
        sb.append(", explorecomCode=").append(explorecomCode);
        sb.append(", explorer=").append(explorer);
        sb.append(", explorer_uni=").append(explorer_uni);
        sb.append(", exploreDate=").append(exploreDate);
        sb.append(", madeDate=").append(madeDate);
        sb.append(", exploreType=").append(exploreType);
        sb.append(", lastriskFileNo=").append(lastriskFileNo);
        sb.append(", mobileFlag=").append(mobileFlag);
        sb.append(", archivesNo=").append(archivesNo);
        sb.append(", addRisk=").append(addRisk);
        sb.append(", onceAccidentLosest=").append(onceAccidentLosest);
        sb.append(", riskUnitNumber=").append(riskUnitNumber);
        sb.append(", loseRate=").append(loseRate);
        sb.append(", score=").append(score);
        sb.append(", riskSuggest=").append(riskSuggest);
        sb.append(", utiWeightId=").append(utiWeightId);
        sb.append(", executionId=").append(executionId);
        sb.append(", pointx_2000=").append(pointx_2000);
        sb.append(", pointy_2000=").append(pointy_2000);
        sb.append(", pointx_02=").append(pointx_02);
        sb.append(", pointy_02=").append(pointy_02);
        sb.append(", valuation=").append(valuation);
        sb.append(", proposalNo=").append(proposalNo);
        sb.append(", policyNo=").append(policyNo);
        sb.append(", insertTimeForHis=").append(insertTimeForHis);
        sb.append(", operateTimeForHis=").append(operateTimeForHis);
        sb.append(", customerExplain=").append(customerExplain);
        sb.append(", riskUnitExplain=").append(riskUnitExplain);
        sb.append(", highlightRisk=").append(highlightRisk);
        sb.append(", supplementAppraisal=").append(supplementAppraisal);
        sb.append(", othSuggest=").append(othSuggest);
        sb.append(", addMessage=").append(addMessage);
        sb.append(", repulseSugggest=").append(repulseSugggest);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}