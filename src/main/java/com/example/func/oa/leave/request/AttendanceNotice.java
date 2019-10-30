package com.example.func.oa.leave.request;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class AttendanceNotice implements Serializable{

	private static final long serialVersionUID = 1L;
	private String yearMonth;
	private int count;
	private List<AttendanceBaseDataVo> attendanceBaseData;
}
