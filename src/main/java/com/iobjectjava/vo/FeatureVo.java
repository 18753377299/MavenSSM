package com.iobjectjava.vo;

import java.io.Serializable;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年9月16日 下午2:09:06
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class FeatureVo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/*面数据信息*/
	private String geometry;
	/*该对面数据对应的灾害字段信息*/
	private AttributeVo attributes;
	/*地图类型*/
	private String type;
	
	public String getGeometry() {
		return geometry;
	}
	public void setGeometry(String geometry) {
		this.geometry = geometry;
	}
	public AttributeVo getAttributes() {
		return attributes;
	}
	public void setAttributes(AttributeVo attributes) {
		this.attributes = attributes;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
