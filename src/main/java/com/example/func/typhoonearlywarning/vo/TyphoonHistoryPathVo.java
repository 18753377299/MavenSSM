package com.example.func.typhoonearlywarning.vo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

public class TyphoonHistoryPathVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tfbh;
	private Date rqsj;
	private String wd;
	private String jd;
	private String zxqy;
	private String zxfs;
	private String ydsd;
	private String ydfx;
	private String radius7;
	private String radius100;
	private String depict;
	private String bedit;
	private String isuse;

	public String getTfbh() {
		return tfbh;
	}

	public void setTfbh(String tfbh) {
		this.tfbh = tfbh;
	}

	public Date getRqsj() {
		return rqsj;
	}

	public void setRqsj(Date rqsj) {
		this.rqsj = rqsj;
	}

	public String getWd() {
		return wd;
	}

	public void setWd(String wd) {
		this.wd = wd;
	}

	public String getJd() {
		return jd;
	}

	public void setJd(String jd) {
		this.jd = jd;
	}

	public String getZxqy() {
		return zxqy;
	}

	public void setZxqy(String zxqy) {
		this.zxqy = zxqy;
	}

	public String getZxfs() {
		return zxfs;
	}

	public void setZxfs(String zxfs) {
		this.zxfs = zxfs;
	}

	public String getYdsd() {
		return ydsd;
	}

	public void setYdsd(String ydsd) {
		this.ydsd = ydsd;
	}

	public String getYdfx() {
		return ydfx;
	}

	public void setYdfx(String ydfx) {
		this.ydfx = ydfx;
	}

	public String getRadius7() {
		return radius7;
	}

	public void setRadius7(String radius7) {
		this.radius7 = radius7;
	}

	public String getRadius100() {
		return radius100;
	}

	public void setRadius100(String radius100) {
		this.radius100 = radius100;
	}

	public String getDepict() {
		return depict;
	}

	public void setDepict(String depict) {
		this.depict = depict;
	}

	public String getBedit() {
		return bedit;
	}

	public void setBedit(String bedit) {
		this.bedit = bedit;
	}

	public String getIsuse() {
		return isuse;
	}

	public void setIsuse(String isuse) {
		this.isuse = isuse;
	}

}
