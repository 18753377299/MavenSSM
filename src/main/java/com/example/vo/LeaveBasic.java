package com.example.vo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 *
 * 通过ins-framework-mybatis工具自动生成，请勿手工修改。表leave_basic的PO对象<br/>
 * 对应表名：leave_basic
 *
 */
@Data
public class LeaveBasic implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 对应字段：id */
	private Integer id;
	/** 对应字段：jobNum */
	private String jobNum;
	/** 对应字段：teamCode */
	private String teamCode;
	/** 对应字段：teamName */
	private String teamName;
	/** 对应字段：annualDay */
	private Float annualDay;
	/** 对应字段：usedAnnualDay */
	private Float usedAnnualDay;
	/** 对应字段：retreatDay */
	private Float retreatDay;
	/** 对应字段：usedRetreatDay */
	private Float usedRetreatDay;
	/** 对应字段：sickDay */
	private Float sickDay;
	/** 对应字段：usedSickDay */
	private Float usedSickDay;
	/** 对应字段：insertTimeForHis */
	private Date insertTimeForHis;
	/** 对应字段：operateTimeForHis */
	private Date operateTimeForHis;
	/** 对应字段：employeeName */
	private String employeeName;

}
