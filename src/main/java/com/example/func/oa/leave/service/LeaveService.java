package com.example.func.oa.leave.service;

import java.util.List;

import com.example.func.oa.leave.request.AttendanceNotice;
import com.example.po.response.AjaxResult;
import com.example.vo.LeaveMain;
import com.example.vo.LeaveSpecialDate;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年10月30日 上午10:49:35
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public interface LeaveService {
	public  AjaxResult operateAttendanceData(AttendanceNotice ttendanceNotice);
	
	public List<LeaveSpecialDate> queryLeaveSpecialDate();
	
	public List<LeaveMain> queryLeaveMainList(String userCode,String yearMonth);
}
