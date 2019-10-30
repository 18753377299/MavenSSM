package com.map.vo;

import java.io.Serializable;
import java.sql.Timestamp;
/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年5月17日 上午10:03:32
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class WzTFYbljVo implements Serializable{

	private static final long serialVersionUID = 1L;
	/*台风编号*/
	private String tfbh;
	/*国家*/
	private String  tm;
	/*预报时间*/
	private Timestamp ybsj;
	/*发生时间*/
	private Timestamp rqsj;
	/*纬度*/
	private String wd;
	/*经度*/
	private String jd;
	/*中心气压*/
	private String zxqy;
	/*最大风速*/
	private String zxfs;
	/*移动方向*/
	private String ydfx;
	/*七级半径*/
	private String radius7;
	/*十级半径*/
	private String radius10;
	private String depict;
	private String bedit;
	private String linecoloe;
	/*是否处理， 1 未处理，0已处理*/
	private String isUse;
	
	public String getTfbh() {
		return tfbh;
	}
	public void setTfbh(String tfbh) {
		this.tfbh = tfbh;
	}
	public String getTm() {
		return tm;
	}
	public void setTm(String tm) {
		this.tm = tm;
	}
	public Timestamp getYbsj() {
		return ybsj;
	}
	public void setYbsj(Timestamp ybsj) {
		this.ybsj = ybsj;
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
	public String getLinecoloe() {
		return linecoloe;
	}
	public void setLinecoloe(String linecoloe) {
		this.linecoloe = linecoloe;
	}
	
}
