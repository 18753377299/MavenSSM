package com.example.func.iobjectjava.vo;

import java.io.Serializable;
import java.util.List;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年9月16日 下午2:06:39
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class ReceivePolygonVector implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String displayFieldName;
	private List<FeatureVo> features;
	private String fieldAliases;
	private String geometryType;
	private String type;
	
	public String getDisplayFieldName() {
		return displayFieldName;
	}
	public void setDisplayFieldName(String displayFieldName) {
		this.displayFieldName = displayFieldName;
	}
	public List<FeatureVo> getFeatures() {
		return features;
	}
	public void setFeatures(List<FeatureVo> features) {
		this.features = features;
	}
	public String getFieldAliases() {
		return fieldAliases;
	}
	public void setFieldAliases(String fieldAliases) {
		this.fieldAliases = fieldAliases;
	}
	public String getGeometryType() {
		return geometryType;
	}
	public void setGeometryType(String geometryType) {
		this.geometryType = geometryType;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}