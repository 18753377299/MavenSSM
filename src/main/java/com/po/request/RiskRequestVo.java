package com.po.request;

import java.io.Serializable;

import lombok.Data;

import com.vo.RiskReportMain;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年7月19日 下午3:57:35
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
@Data
public class RiskRequestVo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private RiskReportMain riskReportMain;
	
}
