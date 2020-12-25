package com.example.func.map.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * @author  作者 E-mail: liqiankun
 * @date 创建时间：2019年5月21日 下午1:50:58
 * @version 1.0 
 * @parameter 
 * @since  为了创建点数据集而创建的vo类
 * @return  */
public class RiskMapAddressField implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private BigDecimal POINTX_2000;
	private BigDecimal POINTY_2000;
	private BigDecimal POINTX_02;
	private BigDecimal POINTY_02;
	private String CITYCODE;
	private String ADDRESSNAME;
	private BigDecimal SCORE;
	private String VALIDSTATUS;
	private String MANUALFLAG;
	private String OPERATORCODE;
	private Date OPERATORDATE;
	private BigDecimal RAINSCALE;
	private BigDecimal THUNDERSTORMSCALE;
	private BigDecimal SNOWSTORMSCALE;
	private BigDecimal HAILSCALE;
	private BigDecimal FLOODSCALE;
	private BigDecimal TYPHOONSCALE;
	private BigDecimal LANDSLIDESCALE;
	private BigDecimal EQPGA;
	
	
}
