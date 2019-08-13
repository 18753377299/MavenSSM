package com.picc.riskctrl.map.vo.request;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RiskMapTyphoonBlackVo {
	/*保单号*/
	private String policyNo;
	/*被保险人*/
	private String insuredName;
	/*分公司*/
	private String branch;
	/* 分公司名称*/
	private String branchName;
	/*险种*/
	private String riskCode;
	/*保险地址*/
	private String insuerdAddress;
	/*保险金额*/
	private String insuredAmount;
	/*保费金额*/
	private String premiumsAmount;
	/*起保日期*/
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date startDate;
	/*终保日期*/
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date endDate;
	/*分保自留比例*/
	private Double percentage;
	/*联共保我方份额*/
	private Double guarantee;
	/*立案号*/
	private String caseNo;
	/*出险日期*/
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date dangerDate;
	/*出险原因*/
	private String dangerBecause;
	/*巨灾代码*/
	private String dangerCode;
	/*估计赔款*/
	private Double estimateAmount;
	/*出险地址*/
	private String dangerAddress;
	private String closeFlag;
	private String riskModel;
	private String dangerCodeCName;
	private String dangerId;
	public String getCloseFlag() {
		return closeFlag;
	}
	public void setCloseFlag(String closeFlag) {
		this.closeFlag = closeFlag;
	}
	public Date getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	private Date closeDate;
	private BigDecimal score;
	private BigDecimal pointx_2000;
	private BigDecimal pointy_2000;
	private int pageNo;
    private int pageSize;
    private long totalCount;
    private long totalPage; 
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	public long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getRiskCode() {
		return riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	public String getInsuredAmount() {
		return insuredAmount;
	}
	public void setInsuredAmount(String insuredAmount) {
		this.insuredAmount = insuredAmount;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	public Double getGuarantee() {
		return guarantee;
	}
	public void setGuarantee(Double guarantee) {
		this.guarantee = guarantee;
	}
	public String getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}
	public Date getDangerDate() {
		return dangerDate;
	}
	public void setDangerDate(Date dangerDate) {
		this.dangerDate = dangerDate;
	}
	public String getDangerBecause() {
		return dangerBecause;
	}
	public void setDangerBecause(String dangerBecause) {
		this.dangerBecause = dangerBecause;
	}
	public String getDangerCode() {
		return dangerCode;
	}
	public void setDangerCode(String dangerCode) {
		this.dangerCode = dangerCode;
	}
	public Double getEstimateAmount() {
		return estimateAmount;
	}
	public void setEstimateAmount(Double estimateAmount) {
		this.estimateAmount = estimateAmount;
	}
	public String getDangerAddress() {
		return dangerAddress;
	}
	public void setDangerAddress(String dangerAddress) {
		this.dangerAddress = dangerAddress;
	}
	public BigDecimal getScore() {
		return score;
	}
	public void setScore(BigDecimal score) {
		this.score = score;
	}
	public String getRiskModel() {
		return riskModel;
	}
	public void setRiskModel(String riskModel) {
		this.riskModel = riskModel;
	}
	public String getInsuerdAddress() {
		return insuerdAddress;
	}
	public void setInsuerdAddress(String insuerdAddress) {
		this.insuerdAddress = insuerdAddress;
	}
	public String getPremiumsAmount() {
		return premiumsAmount;
	}
	public void setPremiumsAmount(String premiumsAmount) {
		this.premiumsAmount = premiumsAmount;
	}
	public String getDangerCodeCName() {
		return dangerCodeCName;
	}
	public void setDangerCodeCName(String dangerCodeCName) {
		this.dangerCodeCName = dangerCodeCName;
	}
	public String getDangerId() {
		return dangerId;
	}
	public void setDangerId(String dangerId) {
		this.dangerId = dangerId;
	}
	public BigDecimal getPointy_2000() {
		return pointy_2000;
	}
	public void setPointy_2000(BigDecimal pointy_2000) {
		this.pointy_2000 = pointy_2000;
	}
	public BigDecimal getPointx_2000() {
		return pointx_2000;
	}
	public void setPointx_2000(BigDecimal pointx_2000) {
		this.pointx_2000 = pointx_2000;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
}
