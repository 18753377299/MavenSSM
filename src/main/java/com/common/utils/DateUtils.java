package com.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年10月22日 下午5:33:59
 * @version 1.0 
 * @parameter 
 * @since  日期类型的工具
 * @return  */
public class DateUtils {
	public static SimpleDateFormat  sdf_YMD = new SimpleDateFormat("yyyy-MM-dd");
	public static SimpleDateFormat  sdf_HMS = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
	/**
	 * 获得某个月最大天数
	 * @param year 年份
	 * @param month 月份 (1-12)
	 * @return 某个月最大天数
	 */
	public  static int getMaxDayByYearMonth(int year,int month){
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		return calendar.getActualMaximum(Calendar.DATE);
	}
	/**
	 * 获取某一日期的下一天的日期
	 * @param year 年份
	 * @param month 月份 (1-12)
	 * @return 
	 */
	public static String getNextDate(Date date){
//		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		return  sdf_YMD.format(calendar.getTime());
	}
	/**
	 * 获取的一天的开始时间
	 * @param year 年份
	 * @param month 月份 (1-12)
	 * @return 
	 */
	public static String getStartDateOfDay(Date date){
//		SimpleDateFormat  sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		try {
//			System.out.println(sdf_YMD.format(date));
//			System.out.println(sdf_YMD.parse(sdf_YMD.format(date)));
			calendar.setTime(sdf_YMD.parse(sdf_YMD.format(date)));
		} catch (ParseException e) {
			e.printStackTrace();
		}
//		calendar.setTime(date);
//		// 如果值传递年月日的话，可以把下面这一段去掉
//		calendar.set(Calendar.HOUR_OF_DAY, 0);
//		calendar.set(Calendar.MINUTE, 0);
//		calendar.set(Calendar.SECOND, 0);
//		calendar.set(Calendar.MILLISECOND, 0);
//		System.out.println(calendar.getTimeInMillis());
		
	    /**  other way 
	    SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
	    SimpleDateFormat formater2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    start = formater2.parse(formater.format(new Date())+ " 00:00:00");
	    end = formater2.parse(formater.format(new Date())+ " 23:59:59");*/
		
		return sdf_HMS.format(calendar.getTime());
	}
	/**
	 * 获取的一天的结束时间
	 * @param year 年份
	 * @param month 月份 (1-12)
	 * @return 
	 */
	public static String getEndDateOfDay(Date date){
//		SimpleDateFormat  sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
//		calendar.set(Calendar.HOUR_OF_DAY,23);
//		calendar.set(Calendar.MINUTE, 59);
//		calendar.set(Calendar.SECOND, 59);
//		calendar.set(Calendar.MILLISECOND, 999);
		// 获取到第二天减一秒
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		calendar.add(Calendar.SECOND, -1);
//		System.out.println(calendar.getTimeInMillis());
		return sdf_HMS.format(calendar.getTime());
	}
	
}
