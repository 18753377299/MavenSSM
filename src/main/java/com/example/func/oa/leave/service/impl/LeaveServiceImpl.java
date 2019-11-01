package com.example.func.oa.leave.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.utils.DateUtils;
import com.example.dao.LeaveSpecialDateMapper;
import com.example.dao.impl.LeaveMainMapperImpl;
import com.example.func.oa.leave.request.AttendanceBaseDataVo;
import com.example.func.oa.leave.request.AttendanceNotice;
import com.example.func.oa.leave.service.LeaveService;
import com.example.po.response.AjaxResult;
import com.example.vo.LeaveMain;
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
	
	@Autowired
	private LeaveMainMapperImpl leaveMainMapperImpl;
	
	/**
	 * @功能：考勤数据导入之后对人员信息进行操作
	 * @param 
	 * @author 
	 * @throws Exception
	 * @时间：20191030
	 * @修改记录：
	 */
	@SuppressWarnings("unused")
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

		for(Map.Entry<String, List<AttendanceBaseDataVo>>  attendanceEntry :attendanceMap.entrySet()){
			// 根据人员编码判断该人员是否已经离职,
			String userCode= attendanceEntry.getKey();
			if(true){// 离职
				continue;
			}
			Map<String, Object> countMap= countPersonMap(map,attendanceEntry.getValue(),userCode,yearMonth);
		}
		return ajaxResult;
	}
	/**
	 * @功能：统计人员缺勤记录 
	 * @param map： 一个月中工作的日期、休息的日期和特殊节假日的日期，attendanceBaseDataVoList： 个人考勤信息
	 * @author 
	 * @throws Exception
	 * @时间：20191101
	 * @修改记录：
	 */
	@SuppressWarnings("unchecked")
	public Map<String, Object> countPersonMap(Map<String,Object> map,
						List<AttendanceBaseDataVo> attendanceBaseDataVoList,String userCode,String yearMonth){
		//一个月中需要上班的日期、放假的日期、特殊节假日的日期
		Set<String> workSet = (HashSet<String>)map.get("workSet");
		Set<String> holidaySet = (HashSet<String>)map.get("holidaySet");
		Set<String> spHolidaySet = (HashSet<String>)map.get("spHolidaySet");
		// 旷工一天集合
		Set<String> completionSet = new HashSet<String>();
		// 旷工半天的集合
		Set<String> completionHalfSet = new HashSet<String>();
		//加班集合
		Set<String> workOverTimeSet = new HashSet<String>();
		int totalWorkOverTime = 0;
		for (AttendanceBaseDataVo attendanceBaseDataVo:attendanceBaseDataVoList){
			// 签到日期2018-12-12格式
			String signDate= DateUtils.strTransferStrYMD(attendanceBaseDataVo.getSignDate());
			// 工作日是否到岗,如果到岗看该时间是否是半天，如果签到时间在六点时候，十一点半之前或者签到时间和签退时间都在十一点半之后则是半天旷工
			if(workSet.contains(signDate)){
				// 当天十一点半
				Date dataSign = DateUtils.getHalfDateOfDay(signDate);
				//签到开始时间和签到结束时间 
				Date signTimeStart=null,signTimeEnd=null;
				if(StringUtils.isNotBlank(attendanceBaseDataVo.getSignTimeStart())){
					signTimeStart=DateUtils.strHMSTransferDate(attendanceBaseDataVo.getSignTimeStart());
				}
				if(StringUtils.isNotBlank(attendanceBaseDataVo.getSignTimeEnd())){
					signTimeEnd=DateUtils.strHMSTransferDate(attendanceBaseDataVo.getSignTimeEnd());
				}
				if(signTimeStart==null||signTimeEnd==null){
					// 签到或者签退为null,则为旷工
					completionSet.add(signDate);
				}else if((signTimeStart.before(dataSign)&&signTimeEnd.before(dataSign))||
						(signTimeStart.after(dataSign)&&signTimeEnd.after(dataSign))){
					// 旷工半天
					completionHalfSet.add(signDate);
				}else {
					
				}
				workSet.remove(signDate);
			}else if(holidaySet.contains(signDate)){
				// 加班集合
				workOverTimeSet.add(signDate);
			}
		}
		// 查询出某人该月的所有请假信息
		List<LeaveMain> leaveMainList=this.queryLeaveMainList(userCode,yearMonth);
		for(LeaveMain leaveMain:leaveMainList){
			int sumDay = leaveMain.getSumDay();  //请假天数,看请假天数是不是等于半天
			String  startTime = DateUtils.getNextDate(leaveMain.getStartTime());
			for(int i=0;i<sumDay;i++){
				
			}

		}
		// 对于剩下的工作日，看该工作日是否进行请假或者出差，如果都没有则是旷工
		Iterator<String> iterator = workSet.iterator();
		while(iterator.hasNext()){
			String workDate = iterator.next();
			
		}
		return null;
	}
	//查询个人一个月之内的请假信息
	public List<LeaveMain> queryLeaveMainList(String userCode,String yearMonth){
		List<LeaveMain> leaveMainList  = Collections.emptyList();
		try {
			Map<String,String> map = new HashMap<String, String>();
			String startMonthDate = DateUtils.getStartDateOfMonth(yearMonth);
			String enndMonthDate = DateUtils.getEndDateOfMonth(yearMonth);
			map.put("userCode", userCode);
			map.put("startTime", startMonthDate);
			map.put("endTime", enndMonthDate);
			leaveMainList = leaveMainMapperImpl.queryLeaveMainList(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return leaveMainList;
	}
	/*进行考勤数据整理操作 */
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
//			workSetStr= new HashSet<String>();
			holidaySet= new HashSet<String>();
//			holidaySetStr= new HashSet<String>();
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
//							workSetStr.add(dayOfYear);
						}else if("0".equals(specialDateMap.get(dayOfYear))){
							holidaySet.add(dayOfYear);
//							holidaySetStr.add(dayOfYear);
						}else {
							spHolidaySet.add(dayOfYear);
						}
					}else {
						// 1
						if("0,2".indexOf(specialDateMap.get(dayOfYear))==-1){
							workSet.add(dayOfYear);
//							workSetStr.add(dayOfYear);
						}else if(!"2".equals(specialDateMap.get(dayOfYear))){
							holidaySet.add(dayOfYear);
//							holidaySetStr.add(dayOfYear);
						}else {
							spHolidaySet.add(dayOfYear);
						}
					}
				}else {
					// 不属于特殊日期
					if("1,2,3,4,5".indexOf(DateUtils.getWeekOfDate(dayOfYear))>-1){
						workSet.add(dayOfYear);
//						workSetStr.add(dayOfYear);
					}else {
						holidaySet.add(dayOfYear);
//						holidaySetStr.add(dayOfYear);
					}
				}
			}
			map.put("workSet", workSet);
//			map.put("workSetStr", workSetStr);
			map.put("holidaySet", holidaySet);
//			map.put("holidaySetStr", holidaySetStr);
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
