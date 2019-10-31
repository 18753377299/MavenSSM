package com.example.func.oa.leave.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.utils.DateUtils;
import com.example.dao.LeaveSpecialDateMapper;
import com.example.func.oa.leave.request.AttendanceBaseDataVo;
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
	
	@Autowired
	private LeaveSpecialDateMapper leaveSpecialDateMapper;
	
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
		// 考勤数据
		List<AttendanceBaseDataVo> attendanceBaseDataList  = new ArrayList<AttendanceBaseDataVo>();
		if(attendanceNotice!=null){
			attendanceBaseDataList = attendanceNotice.getAttendanceBaseData();
		}
		// 计算工作日没来的数据、工作日来了的数据、  节假日来了的数据、节假日没来的数据和特殊节假日来了的数据
		// 计算一个月中工作的日期、休息的日期和特殊节假日的日期
		Map<String,Object> map = this.organizeDateMap(yearMonth);
		// 组织 考勤数据，将一个人员放在一个key值中
		Map<String, List<AttendanceBaseDataVo>>  attendanceMap= this.organizeAttendanceBaseData(attendanceBaseDataList);
		Set<String> workSet = (HashSet<String>)map.get("workSet");
		Set<String> holidaySet = (HashSet<String>)map.get("holidaySet");
		// 
		Set<String> completionSet = new HashSet<String>();
		Set<String> absenceSet = new HashSet<String>();
//		map.put("workSet", workSet);
//		map.put("workSetStr", workSetStr);
//		map.put("holidaySet", holidaySet);
//		map.put("holidaySetStr", holidaySetStr);
//		map.put("spHolidaySet", spHolidaySet);
		for(Map.Entry<String, List<AttendanceBaseDataVo>>  attendanceEntry :attendanceMap.entrySet()){
			// 根据人员编码判断该人员是否已经离职,
			String userCode= attendanceEntry.getKey();
			if(true){// 离职
				continue;
			}
//			List<AttendanceBaseDataVo> attendanceDataList = attendanceEntry.getValue();
			for (AttendanceBaseDataVo attendanceBaseDataVo:attendanceEntry.getValue()){
				
			}
			
		}
		return ajaxResult;
	}
	/*进行考勤数据操作 */
	public Map<String, List<AttendanceBaseDataVo>>  organizeAttendanceBaseData(List<AttendanceBaseDataVo> attendanceBaseDataList){
		Map<String, List<AttendanceBaseDataVo>>  attendanceMap =new HashMap<String, List<AttendanceBaseDataVo>>();
		for(AttendanceBaseDataVo attendanceBaseDataVo:attendanceBaseDataList){
			if(attendanceMap.containsKey(attendanceBaseDataVo.getUserCode())){
				attendanceMap.get(attendanceBaseDataVo.getUserCode()).add(attendanceBaseDataVo);
			}else {
				List<AttendanceBaseDataVo> attendanceList = new ArrayList<AttendanceBaseDataVo>();
				attendanceList.add(attendanceBaseDataVo);
				attendanceMap.put(attendanceBaseDataVo.getUserCode(), attendanceList);
			}
		}
		return attendanceMap;
	}
	/**
	 * @功能：计算工作日没来的数据(workAbsence)、工作日来了的数据(workAttend)、  
	 * 节假日来了的数据(holidayAttend)、节假日没来的数据(holidayAbsence)和特殊节假日来了(spHolidayAttend)的数据
	 * @param 
	 * @author 
	 * @throws Exception
	 * @时间：20191030
	 * @修改记录：
	 */
	public Map<String,Object> organizeDateMap(String yearMonth){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
//			String yearMonth  = attendanceNotice.getYearMonth();
			// 特殊节假日表中的map参数
			Map<String, String> specialDateMap = this.organizeSpecialDate(yearMonth);
			// 统计出节假日、工作日和特殊节假日
			Set<String> workSet,workSetStr,holidaySet,holidaySetStr,spHolidaySet;
			workSet= new HashSet<String>();
			workSetStr= new HashSet<String>();
			holidaySet= new HashSet<String>();
			holidaySetStr= new HashSet<String>();
			spHolidaySet= new HashSet<String>();
			// 获取一个月中的最大天数
			int sumDayOfMonth = DateUtils.getMaxDayByYearMonth(yearMonth);
			// 0: 休息的日期  1： 上班的日期  2： 特殊节假日的日期，正常的时候是1-5 上班，6-7 休息
			for(int i =1;i<=sumDayOfMonth;i++){
				String dayOfYear = yearMonth+"-" + (i<10 ?("0"+i) : i);
				// 判断该日期是否属于特殊日期
				if(specialDateMap.get(dayOfYear)!=null){
					if("1,2,3,4,5".indexOf(DateUtils.getWeekOfDate(dayOfYear))>-1){
						if("0,2".indexOf(specialDateMap.get(dayOfYear))==-1){
							workSet.add(dayOfYear);
							workSetStr.add(dayOfYear);
						}else if("0".equals(specialDateMap.get(dayOfYear))){
							holidaySet.add(dayOfYear);
							holidaySetStr.add(dayOfYear);
						}else {
							spHolidaySet.add(dayOfYear);
						}
					}else {
						// 1
						if("0,2".indexOf(specialDateMap.get(dayOfYear))==-1){
							workSet.add(dayOfYear);
							workSetStr.add(dayOfYear);
						}else if(!"2".equals(specialDateMap.get(dayOfYear))){
							holidaySet.add(dayOfYear);
							holidaySetStr.add(dayOfYear);
						}else {
							spHolidaySet.add(dayOfYear);
						}
					}
				}else {
					// 不属于特殊日期
					if("1,2,3,4,5".indexOf(DateUtils.getWeekOfDate(dayOfYear))>-1){
						workSet.add(dayOfYear);
						workSetStr.add(dayOfYear);
					}else {
						holidaySet.add(dayOfYear);
						holidaySetStr.add(dayOfYear);
					}
				}
			}
			map.put("workSet", workSet);
			map.put("workSetStr", workSetStr);
			map.put("holidaySet", holidaySet);
			map.put("holidaySetStr", holidaySetStr);
			map.put("spHolidaySet", spHolidaySet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	// 查询特殊节假日的数据，并进行组织成map类型
	public Map<String, String> organizeSpecialDate(String yearMonth){
		Map<String, String> map = new HashMap<String, String>();
		try {
			// 查询节假日信息
			List<LeaveSpecialDate> leaveSpecialDateList =  new ArrayList<LeaveSpecialDate>();
			map.put("date", yearMonth);
			leaveSpecialDateList =leaveSpecialDateMapper.queryLeaveSpecialDateList(map);
			//清除已有的map数据，进行参数的重复利用
			map.clear();
			for(LeaveSpecialDate leaveSpecialDate: leaveSpecialDateList){
				// 特殊节假日日期 
				String specialDate=DateUtils.dateTransferStrYMD(leaveSpecialDate.getDate());
				map.put(specialDate,leaveSpecialDate.getDateType());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Collections.emptyMap();
		}
		return map;
	}
	// 查询特殊节假日信息
	public List<LeaveSpecialDate> queryLeaveSpecialDate(){
		List<LeaveSpecialDate> leaveSpecialDateList =  new ArrayList<LeaveSpecialDate>();
		Map<String, String> map = new HashMap<String, String>();
		map.put("date", "2019");
		leaveSpecialDateList =leaveSpecialDateMapper.queryLeaveSpecialDateList(map);
//		return Collections.emptyList();
		return leaveSpecialDateList;
	}


	
	
	
}
