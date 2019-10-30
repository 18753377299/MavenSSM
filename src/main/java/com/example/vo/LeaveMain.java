package com.example.vo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 *
 * 通过ins-framework-mybatis工具自动生成，请勿手工修改。表leave_main的PO对象<br/>
 * 对应表名：leave_main
 *
 */
@Data
public class LeaveMain implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 对应字段：id */
	private Integer id;
	/** 对应字段：jobNum */
	private String jobNum;
	/** 对应字段：teamCode */
	private String teamCode;
	/** 对应字段：teamName */
	private String teamName;
	/** 对应字段：leaveType */
	private String leaveType;
	/** 对应字段：detailDesc */
	private String detailDesc;
	/** 对应字段：startTime */
	private Date startTime;
	/** 对应字段：endTime */
	private Date endTime;
	/** 对应字段：sumDay */
	private Float sumDay;
	/** 对应字段：insertTimeForHis */
	private Date insertTimeForHis;
	/** 对应字段：operateTimeForHis */
	private Date operateTimeForHis;
	/** 对应字段：employeeName */
	private String employeeName;
	/** 对应字段：leaveFlag */
	private String leaveFlag;
	/** 对应字段：inspectionReport */
	private String inspectionReport;

}
