package com.vo;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*全参构造函数*/
@AllArgsConstructor
/*无参构造函数*/
@NoArgsConstructor
/*get\set方法*/
@Data
public class UtiFactor implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
//	private UtiFactorId id;
	
	/**风控模板号*/
	private String riskModel;
	/**因子编号*/
	private String factorNo;
	/**灾因*/
	private String dangerType;
	/**因子类型*/
	private String factorType;
	/**存储表名*/
	private String fromTable;
	/**存储字段名*/
	private String fromColumn;
	/**字段类型*/
	private String columnType;
	/**是否允许为空*/
	private String nullable;
	/**字段中文名*/
	private String columnCName;
	/**最值类型*/
	private String factorExtType;
	/**最值*/
	private BigDecimal factorExt;
	/**有效标志位*/
	private String validStatus;
	private Date insertTimeForHis;
	private Date operateTimeForHis;
	
	
}
