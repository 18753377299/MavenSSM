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
	/** 对应字段：usercode 用户编码*/
	private String userCode;
	/** 对应字段：username 用户名称*/
	private String username;
	/** 对应字段：department 部门*/
	private String department;
	/** 对应字段：project_code 所属项目代码*/
	private String projectCode;
	/** 对应字段：project_name 所属项目名称*/
	private String projectName;
	/** 对应字段：sign_date 签到日期*/
	private String signDate;
	/** 对应字段：sign_time_start 签到开始时间*/
	private String signTimeStart;
	/** 对应字段：sign_time_end 签到结束时间*/
	private String signTimeEnd;
	
}
