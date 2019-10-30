package com.typhoonearlywarning.vo;

import java.math.BigDecimal;
import java.util.Date;

public class RiskWarningPushVo {
	/** 顺序号 */
	private Integer serialNo;
	/** 台风编号 */
	private String TFBH;
	/** 台风名称 */
	private String TFBHName;
	/** 机构 */
	private String comCode;
	/** 机构名称 */
	private String comCodeCName;
	/** 所处地区代码 */
	private String addressCode;
	/** 所处地区名称 */
	private String addressName;
	/** 所处地区省市代码 */
	private String addressProvinceCode;
	/** 所处地区省市名称 */
	private String addressProvinceName;
	/** 报告制作人代码 */
	private String operatorCode;
	/** 报告人名称 */
	private String operatorName;
	/** 存货比例 A: 0-30% B: 30-50% C: 50-100% */
	private String inventory;
	/** 险种 */
	private String riskCode;
	/** 出现次数 */
	private Integer occurrences;
	/** 赔付率 */
	private Double lossRatio;
	/** 行业 */
	private String business;
	/** 行业名称 */
	private String businessName;
	/** 保额 */
	private BigDecimal forehead;
	/** 报告制作日期 */
	private Date madeDate;
	/** 风圈半径 */
	private Integer radius;
	/*邮箱*/
	private String email;
	/** 插入时间 */
	private Date insertTimeForHis;
	/** 更新时间 */
	private Date operateTimeForHis;

	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public String getTFBH() {
		return TFBH;
	}

	public void setTFBH(String tFBH) {
		TFBH = tFBH;
	}

	public String getTFBHName() {
		return TFBHName;
	}

	public void setTFBHName(String tFBHName) {
		TFBHName = tFBHName;
	}

	public String getComCode() {
		return comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String getComCodeCName() {
		return comCodeCName;
	}

	public void setComCodeCName(String comCodeCName) {
		this.comCodeCName = comCodeCName;
	}

	public String getAddressCode() {
		return addressCode;
	}

	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getAddressProvinceCode() {
		return addressProvinceCode;
	}

	public void setAddressProvinceCode(String addressProvinceCode) {
		this.addressProvinceCode = addressProvinceCode;
	}

	public String getAddressProvinceName() {
		return addressProvinceName;
	}

	public void setAddressProvinceName(String addressProvinceName) {
		this.addressProvinceName = addressProvinceName;
	}

	public String getOperatorCode() {
		return operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getInventory() {
		return inventory;
	}

	public void setInventory(String inventory) {
		this.inventory = inventory;
	}

	public String getRiskCode() {
		return riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public Integer getOccurrences() {
		return occurrences;
	}

	public void setOccurrences(Integer occurrences) {
		this.occurrences = occurrences;
	}

	public Double getLossRatio() {
		return lossRatio;
	}

	public void setLossRatio(Double lossRatio) {
		this.lossRatio = lossRatio;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public BigDecimal getForehead() {
		return forehead;
	}

	public void setForehead(BigDecimal forehead) {
		this.forehead = forehead;
	}

	public Date getMadeDate() {
		return madeDate;
	}

	public void setMadeDate(Date madeDate) {
		this.madeDate = madeDate;
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

	public Integer getRadius() {
		return radius;
	}

	public void setRadius(Integer radius) {
		this.radius = radius;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	
}
