package com.vo;

import java.math.BigDecimal;
import java.util.Date;
/**
 * @功能：分值表
 * @param 
 * @author 
 * @throws Exception
 * @时间：20190719
 * @修改记录：
 */
public class UtiScore implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	/**风控模板号*/
	private String riskModel;
	/**因子编号*/
	private String factorNo;
	/**灾因*/
	private String dangerType;
	/**因子取值*/
	private String factorValue;
	
//	private UtiScoreId id;
	/**分值*/
	private BigDecimal factorScore;
	/**有效标志位*/
	private String validStatus;
	
	private Date insertTimeForHis;
	
	private Date operateTimeForHis;
	
	public String getRiskModel() {
		return riskModel;
	}
	public void setRiskModel(String riskModel) {
		this.riskModel = riskModel;
	}
	public String getFactorNo() {
		return factorNo;
	}
	public void setFactorNo(String factorNo) {
		this.factorNo = factorNo;
	}
	public String getDangerType() {
		return dangerType;
	}
	public void setDangerType(String dangerType) {
		this.dangerType = dangerType;
	}
	public String getFactorValue() {
		return factorValue;
	}
	public void setFactorValue(String factorValue) {
		this.factorValue = factorValue;
	}
	public BigDecimal getFactorScore() {
		return factorScore;
	}
	public void setFactorScore(BigDecimal factorScore) {
		this.factorScore = factorScore;
	}
	public String getValidStatus() {
		return validStatus;
	}
	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
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
	
	
	
}
