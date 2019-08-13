package com.map.vo;

import java.io.Serializable;
import java.sql.Timestamp;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年5月8日 下午3:54:46
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class WzTFLsljVo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String tfbh;
	private Timestamp rqsj;
	private String wd;
	private String jd;
	private String zxqy;
	private String zxfs;
	private String ydsd;
	private String ydfx;
	private String radius7;
	private String radius10;
	private String depict;
	private String bedit;
	private String isUse;
	private String flag;
	
	public String getTfbh() {
		return tfbh;
	}
	public void setTfbh(String tfbh) {
		this.tfbh = tfbh;
	}
	public Timestamp getRqsj() {
		return rqsj;
	}
	public void setRqsj(Timestamp rqsj) {
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
	public String getRadius10() {
		return radius10;
	}
	public void setRadius10(String radius10) {
		this.radius10 = radius10;
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
	public String getIsUse() {
		return isUse;
	}
	public void setIsUse(String isUse) {
		this.isUse = isUse;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
}
