//package com.picc.riskctrl.typhoonearlywarning.model;
//
//import java.io.Serializable;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import org.hibernate.annotations.Cache;
//import org.hibernate.annotations.CacheConcurrencyStrategy;
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@Entity
//@Table(name = "WZ_TFBH")
//public class TyphoonLatestInfo implements Serializable{
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private String tfbh;
//	private String tfm;
//	private String tFland;
//	private String id;
//	private String isCompleted;
//	private String tfme;
//	private String bedite;
//	private String isLand;
//	private String isActive;
//	private Date tfDate;
//	private String isUse;
//	
//	@Id
//	@Column(name = "TFBH",nullable= false)
//	public String getTfbh() {
//		return tfbh;
//	}
//	public void setTfbh(String tfbh) {
//		this.tfbh = tfbh;
//	}
//	@Column(name = "TFM")
//	public String getTfm() {
//		return tfm;
//	}
//	public void setTfm(String tfm) {
//		this.tfm = tfm;
//	}
//	@Column(name = "TFLAND")
//	public String gettFland() {
//		return tFland;
//	}
//	public void settFland(String tFland) {
//		this.tFland = tFland;
//	}
//	@Column(name = "ID")
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	@Column(name = "ISCOMPLETED")
//	public String getIsCompleted() {
//		return isCompleted;
//	}
//	public void setIsCompleted(String isCompleted) {
//		this.isCompleted = isCompleted;
//	}
//	@Column(name = "TFME")
//	public String getTfme() {
//		return tfme;
//	}
//	public void setTfme(String tfme) {
//		this.tfme = tfme;
//	}
//	@Column(name = "TFDATE")
//	public Date getTfDate() {
//		return tfDate;
//	}
//	public void setTfDate(Date tfDate) {
//		this.tfDate = tfDate;
//	}
//	@Column(name = "BEDITE")
//	public String getBedite() {
//		return bedite;
//	}
//	public void setBedite(String bedite) {
//		this.bedite = bedite;
//	}
//	@Column(name = "ISLAND")
//	public String getIsLand() {
//		return isLand;
//	}
//	public void setIsLand(String isLand) {
//		this.isLand = isLand;
//	}
//	@Column(name = "ISACTIVE")
//	public String getIsActive() {
//		return isActive;
//	}
//	public void setIsActive(String isActive) {
//		this.isActive = isActive;
//	}
//	@Column(name = "ISUSE")
//	public String getIsUse() {
//		return isUse;
//	}
//	public void setIsUse(String isUse) {
//		this.isUse = isUse;
//	}
//	
//	
//	
//	
//}
