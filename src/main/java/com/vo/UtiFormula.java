package com.vo;

import java.util.Date;

@lombok.Data
public class UtiFormula implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;
	
//	private UtiFormulaId id;
	
	/**风控模板号*/
	private String riskModel;
	/**因子编号*/
	private String factorNo;
	/**灾因*/
	private String dangerType;
	/**计算公式*/
	private String content;
	/**集合类型*/
	private String listType;
	/**有效标志位*/
	private String validStatus;
	
	private Date insertTimeForHis;
	
	private Date operateTimeForHis;
	
	
	
}
