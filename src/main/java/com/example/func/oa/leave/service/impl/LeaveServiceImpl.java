package com.example.func.oa.leave.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.func.oa.leave.request.AttendanceNotice;
import com.example.func.oa.leave.service.LeaveService;
import com.example.po.response.AjaxResult;
import com.example.vo.LeaveSpecialDate;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年10月30日 上午10:50:00
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
@Service
public class LeaveServiceImpl  implements LeaveService{
	
	/**
	 * @功能：考勤数据导入之后对人员信息进行操作
	 * @param 
	 * @author 
	 * @throws Exception
	 * @时间：20191030
	 * @修改记录：
	 */
	public  AjaxResult operateAttendanceData(AttendanceNotice attendanceNotice){
		AjaxResult ajaxResult =new AjaxResult();
		String yearMonth  = attendanceNotice.getYearMonth();
		// 计算工作日没来的数据、工作日来了的数据、  节假日来了的数据、节假日没来的数据和特殊节假日来了的数据
		Map<String,Object> map = new HashMap<String,Object>();
		
		return ajaxResult;
	}
	/**
	 * @功能：计算工作日没来的数据、工作日来了的数据、  节假日来了的数据、节假日没来的数据和特殊节假日来了的数据
	 * @param 
	 * @author 
	 * @throws Exception
	 * @时间：20191030
	 * @修改记录：
	 */
	public Map<String,Object> organizeDateMap(){
		Map<String,Object> map = new HashMap<String,Object>();
		
		return map;
	}
	// 查询特殊节假日的数据，并进行组织
	public Map<String, String> organizeSpecialDate(){
		
		return Collections.emptyMap();
	}
	// 查询特殊节假日信息
	public List<LeaveSpecialDate> queryLeaveSpecialDate(){
		List<LeaveSpecialDate> leaveSpecialDateList =  new ArrayList<LeaveSpecialDate>();
//		leaveSpecialDateL
//		return Collections.emptyList();
		return leaveSpecialDateList;
	}


	
	
	
}
