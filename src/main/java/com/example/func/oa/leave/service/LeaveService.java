package com.example.func.oa.leave.service;

import com.example.func.oa.leave.request.AttendanceNotice;
import com.example.po.response.AjaxResult;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年10月30日 上午10:49:35
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public interface LeaveService {
	public  AjaxResult operateAttendanceData(AttendanceNotice ttendanceNotice);
}
