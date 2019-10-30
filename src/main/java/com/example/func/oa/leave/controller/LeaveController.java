package com.example.func.oa.leave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.func.leave.request.AttendanceNotice;
import com.example.func.leave.service.LeaveService;
import com.example.po.response.AjaxResult;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年10月30日 上午10:51:28
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
@RestController
@RequestMapping(value="/leave")
public class LeaveController {
	
	@Autowired
    LeaveService leaveService;
	/**
	 * @功能：考勤数据导入之后对人员信息进行操作
	 * @param 
	 * @author 
	 * @throws Exception
	 * @时间：20191030
	 * @修改记录：
	 */
	@RequestMapping(value="/operateAttendanceData",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public  AjaxResult operateAttendanceData(@RequestBody AttendanceNotice attendanceNotice){
		AjaxResult ajaxResult =new AjaxResult();
		ajaxResult =leaveService.operateAttendanceData(attendanceNotice);
		return ajaxResult;
	}
}
