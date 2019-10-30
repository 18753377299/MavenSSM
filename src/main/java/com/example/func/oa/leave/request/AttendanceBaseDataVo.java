package com.example.func.oa.leave.request;

import java.io.Serializable;

import lombok.Data;

/**
 *
 * 通过ins-framework-mybatis工具自动生成，表attendance_base_data的VO对象<br/>
 * 对应表名：attendance_base_data
 *
 */
@Data
public class AttendanceBaseDataVo implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 对应字段：id */
	private String id;
	/** 对应字段：usercode */
	private String userCode;
	/** 对应字段：username */
	private String username;
	/** 对应字段：department */
	private String department;
	/** 对应字段：project_code */
	private String projectCode;
	/** 对应字段：project_name */
	private String projectName;
	/** 对应字段：sign_date */
	private String signDate;
	/** 对应字段：sign_time_start */
	private String signTimeStart;
	/** 对应字段：sign_time_end */
	private String signTimeEnd;
	
}
