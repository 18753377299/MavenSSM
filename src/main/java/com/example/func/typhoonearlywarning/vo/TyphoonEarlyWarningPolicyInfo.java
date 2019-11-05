package com.example.func.typhoonearlywarning.vo;

import java.math.BigDecimal;

public class TyphoonEarlyWarningPolicyInfo {

	/* 台风编号 */
	private String typhoonSerialNo;
	/* 机构代码 */
	private String comCode;
	/* 风圈半径 */
	private Integer redius;
	/* 险种代码 */
	private String riskCode;
	/* 汇总保费 */
	private String sumPremium;
	/* 汇总保额 */
	private BigDecimal sumAmount;
	/*出现次数（理赔次数）*/
	private Integer occurNumber;
	/*经纬度*/
	private  BigDecimal pointx_2000;
	private  BigDecimal pointy_2000;
	private  BigDecimal pointx_02;
	private  BigDecimal pointy_02;
	/*标的机构代码*/
	private String cityCode;
	/*地址*/
	private String addressName;
	/** 投保单号 */
	private String proposalNo;
	/** 保单号 */
	private String policyNo;
	
	/** 关系人类型 */
	private String insuredType;
	/** 关系人代码 */
	private String insuredCode;
	/** 关系人名称 */
	private String insuredName;
	
	/*该保单下的所有关系人信息*/
//	private List<RiskMapInsured> riskMapInsuredList = new ArrayList<RiskMapInsured>();
	
	
	public String getTyphoonSerialNo() {
		return typhoonSerialNo;
	}

	public void setTyphoonSerialNo(String typhoonSerialNo) {
		this.typhoonSerialNo = typhoonSerialNo;
	}

	public Integer getRedius() {
		return redius;
	}

	public void setRedius(Integer redius) {
		this.redius = redius;
	}

	public String getComCode() {
		return comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String getSumPremium() {
		return sumPremium;
	}

	public void setSumPremium(String sumPremium) {
		this.sumPremium = sumPremium;
	}

	public BigDecimal getSumAmount() {
		return sumAmount;
	}

	public void setSumAmount(BigDecimal sumAmount) {
		this.sumAmount = sumAmount;
	}

	public String getRiskCode() {
		return riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public Integer getOccurNumber() {
		return occurNumber;
	}

	public void setOccurNumber(Integer occurNumber) {
		this.occurNumber = occurNumber;
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

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getProposalNo() {
		return proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}
	

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	

	public String getInsuredType() {
		return insuredType;
	}

	public void setInsuredType(String insuredType) {
		this.insuredType = insuredType;
	}

	public String getInsuredCode() {
		return insuredCode;
	}

	public void setInsuredCode(String insuredCode) {
		this.insuredCode = insuredCode;
	}

	public String getInsuredName() {
		return insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

//	public List<RiskMapInsured> getRiskMapInsuredList() {
//		return riskMapInsuredList;
//	}
//
//	public void setRiskMapInsuredList(List<RiskMapInsured> riskMapInsuredList) {
//		this.riskMapInsuredList = riskMapInsuredList;
//	}
	

}
