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
//
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@Entity
//@Table(name = "WZ_TFLSLJ")
//public class TyphoonHistoryPath implements Serializable {
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private String tfbh;
//	private Date rqsj;
//	private String wd;
//	private String jd;
//	private String zxqy;
//	private String zxfs;
//	private String ydsd;
//	private String ydfx;
//	private String radius7;
//	private String radius100;
//	private String depict;
//	private String bedit;
//	private String isuse;
//
//	@Id
//	@Column(name = "TFBH")
//	public String getTfbh() {
//		return tfbh;
//	}
//
//	public void setTfbh(String tfbh) {
//		this.tfbh = tfbh;
//	}
//
//	@Column(name = "RQSJ")
//	public Date getRqsj() {
//		return rqsj;
//	}
//
//	public void setRqsj(Date rqsj) {
//		this.rqsj = rqsj;
//	}
//
//	@Column(name = "WD")
//	public String getWd() {
//		return wd;
//	}
//
//	public void setWd(String wd) {
//		this.wd = wd;
//	}
//
//	@Column(name = "JD")
//	public String getJd() {
//		return jd;
//	}
//
//	public void setJd(String jd) {
//		this.jd = jd;
//	}
//
//	@Column(name = "ZXQY")
//	public String getZxqy() {
//		return zxqy;
//	}
//
//	public void setZxqy(String zxqy) {
//		this.zxqy = zxqy;
//	}
//
//	@Column(name = "ZXFS")
//	public String getZxfs() {
//		return zxfs;
//	}
//
//	public void setZxfs(String zxfs) {
//		this.zxfs = zxfs;
//	}
//
//	@Column(name = "YDSD")
//	public String getYdsd() {
//		return ydsd;
//	}
//
//	public void setYdsd(String ydsd) {
//		this.ydsd = ydsd;
//	}
//
//	@Column(name = "YDFX")
//	public String getYdfx() {
//		return ydfx;
//	}
//
//	public void setYdfx(String ydfx) {
//		this.ydfx = ydfx;
//	}
//
//	@Column(name = "RADIUS7")
//	public String getRadius7() {
//		return radius7;
//	}
//
//	public void setRadius7(String radius7) {
//		this.radius7 = radius7;
//	}
//
//	@Column(name = "RADIUS10")
//	public String getRadius100() {
//		return radius100;
//	}
//
//	public void setRadius100(String radius100) {
//		this.radius100 = radius100;
//	}
//
//	@Column(name = "DEPICT")
//	public String getDepict() {
//		return depict;
//	}
//
//	public void setDepict(String depict) {
//		this.depict = depict;
//	}
//
//	@Column(name = "BEDIT")
//	public String getBedit() {
//		return bedit;
//	}
//
//	public void setBedit(String bedit) {
//		this.bedit = bedit;
//	}
//
//	@Column(name = "ISUSE")
//	public String getIsuse() {
//		return isuse;
//	}
//
//	public void setIsuse(String isuse) {
//		this.isuse = isuse;
//	}
//
//}
