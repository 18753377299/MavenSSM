package com.example.func.iobjectjava.javamain.vo;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年5月20日 下午4:26:09
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@Entity
//@Table(name = "WZ_CORPORELS")
public class WzCorporeLs implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private WzCorporeLsId id;
	
	private  BigDecimal pointx_2000;
	private  BigDecimal pointy_2000;
	private  BigDecimal pointx_02;
	private  BigDecimal pointy_02;
	private String cityCode;
	private String addressName;
	private String validStatus;
	
	private BigDecimal centerX;
	private BigDecimal centerY;
	
	private String cityName;
	
	private String proName;
	
	/**       
	 *联合主键
	 */
//	@EmbeddedId
//	@AttributeOverrides( {
//			@AttributeOverride(name = "tfbh", column = @Column(name = "TFBH")),
//			@AttributeOverride(name = "mid", column = @Column(name = "MID"))})
	public WzCorporeLsId getId() {
		return id;
	}
	public void setId(WzCorporeLsId id) {
		this.id = id;
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
	public String getValidStatus() {
		return validStatus;
	}
	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
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
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
  
}
