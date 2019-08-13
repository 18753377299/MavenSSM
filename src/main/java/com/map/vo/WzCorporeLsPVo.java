package com.map.vo;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class WzCorporeLsPVo {

private static final long serialVersionUID = 1L;
	
	private String tfbh;
	private String cityCode;
	private String cityName;
	private BigDecimal totalAmount;
	private BigDecimal jAmount;
	private BigDecimal qAmount;
	private BigDecimal gAmount;
	private BigDecimal centerX;
	private BigDecimal centerY;
	private String proCityFlag;
	private BigDecimal corporeSum;
	private Timestamp insertTimeForHis;
	private Timestamp operateTimeForHis;
	public String getTfbh() {
		return tfbh;
	}
	public void setTfbh(String tfbh) {
		this.tfbh = tfbh;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public BigDecimal getjAmount() {
		return jAmount;
	}
	public void setjAmount(BigDecimal jAmount) {
		this.jAmount = jAmount;
	}
	public BigDecimal getqAmount() {
		return qAmount;
	}
	public void setqAmount(BigDecimal qAmount) {
		this.qAmount = qAmount;
	}
	public BigDecimal getgAmount() {
		return gAmount;
	}
	public void setgAmount(BigDecimal gAmount) {
		this.gAmount = gAmount;
	}
	public BigDecimal getCenterX() {
		return centerX;
	}
	public void setCenterX(BigDecimal centerX) {
		this.centerX = centerX;
	}
	public BigDecimal getCenterY() {
		return centerY;
	}
	public void setCenterY(BigDecimal centerY) {
		this.centerY = centerY;
	}
	public String getProCityFlag() {
		return proCityFlag;
	}
	public void setProCityFlag(String proCityFlag) {
		this.proCityFlag = proCityFlag;
	}
	public BigDecimal getCorporeSum() {
		return corporeSum;
	}
	public void setCorporeSum(BigDecimal corporeSum) {
		this.corporeSum = corporeSum;
	}
	public Timestamp getInsertTimeForHis() {
		return insertTimeForHis;
	}
	public void setInsertTimeForHis(Timestamp insertTimeForHis) {
		this.insertTimeForHis = insertTimeForHis;
	}
	public Timestamp getOperateTimeForHis() {
		return operateTimeForHis;
	}
	public void setOperateTimeForHis(Timestamp operateTimeForHis) {
		this.operateTimeForHis = operateTimeForHis;
	}

}
