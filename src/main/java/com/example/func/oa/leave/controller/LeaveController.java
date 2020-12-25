package com.example.func.oa.leave.controller;

import com.example.func.oa.leave.request.AttendanceNotice;
import com.example.func.oa.leave.service.LeaveService;
import com.example.po.response.AjaxResult;
import com.example.po.response.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年10月30日 上午10:51:28
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
@Controller
@RequestMapping(value="/leave")
public class LeaveController {
	
	@Autowired
    private LeaveService leaveService;
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
	@RequestMapping(value="/test",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public  AjaxResult test(HttpServletRequest request){
		UserInfo userInfo =(UserInfo)request.getAttribute("userInfo");
		AjaxResult ajaxResult =new AjaxResult();
//		leaveService.queryLeaveSpecialDate();
		leaveService.queryLeaveMainList("","2018-12");
		return ajaxResult;
	}
}
