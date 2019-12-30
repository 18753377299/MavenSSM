package com.common.utils.map;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import com.supermap.data.DatasetVector;
import com.supermap.data.FieldInfo;
import com.supermap.data.FieldInfos;
import com.supermap.data.FieldType;

public class MapReflectUtils {
	
	// 获取类中相应字段的值
	public static Object getMethod(Object object, String fieldName) {
		Field f;
		Object obj = new Object();
		try {
			f = object.getClass().getDeclaredField(fieldName);
			f.setAccessible(true);
			obj = f.get(object);
			if (obj == null) {
				obj = "";
			}
		} catch (Exception  e) {
			e.printStackTrace();
		}
		return obj;
	}
	/**通过get请求来获取某个类中的字段的值*/
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Object getRadius(String radius,Object wzTFLslj){
		Object  radiusData = "";
		try {
			Class wzclass = wzTFLslj.getClass();
			String radiusName = "get"+radius.substring(0,1).toUpperCase()+radius.substring(1);
			Method method= wzclass.getDeclaredMethod(radiusName,new Class[]{});
			method.setAccessible(true);
			radiusData = (String)method.invoke(wzTFLslj);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return radiusData;
	}
	/** 给面数据添加字段信息*/
	@SuppressWarnings("rawtypes")
	public static void addFieldInfo(DatasetVector datasetVector,Object wzTFLslj){
		  FieldInfos  fieldInfosold = datasetVector.getFieldInfos();
		  
		  Class clas = wzTFLslj.getClass(); 
		  Field []  fields =  clas.getDeclaredFields();
		  if (fields.length>0){
			  for (Field field : fields){
				  String  type = field.getType().getName();
				  String fieldName = field.getName();
				  if(fieldName.equals("serialVersionUID")||type.equals("java.util.List")){
					  continue;
				  }
				  FieldInfo fieldInfoNew = new FieldInfo();
				  fieldInfoNew.setName(fieldName);
				  // 别名
				  fieldInfoNew.setCaption(fieldName);
				  // 设置默认值
//				      fieldInfoNew.setDefaultValue("0");
				  if(type.equals("java.lang.String")){
					  fieldInfoNew.setType(FieldType.TEXT);
				  }else if(type.equals("java.util.Date")){
					  fieldInfoNew.setType(FieldType.DATETIME);
				  }else if(type.equals("java.math.BigDecimal")){
					  fieldInfoNew.setType(FieldType.DOUBLE);
				  }
				  // 设置是否必录
//				      fieldInfoNew.setRequired(true);
			      fieldInfosold.add(fieldInfoNew);
			  } 
		  }
	}
		
	/**
     * @Description 通过java反射生成map数据
     * @Author 
     * @param obj
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @Date 20190509
     */
    public static Map<String,Object> getResultByReflect(Object obj){

        Map<String, Object> map = new HashMap<>();
        Field[] fields = obj.getClass().getDeclaredFields();
        for(Field field:fields){
            if (field.getName().equals("serialVersionUID")
                    || field.getType().getName().equals("java.util.List")){
                continue;
            }
            String fieldName = field.getName();
            fieldName = fieldName.substring(0, 1).toUpperCase()+fieldName.substring(1);
            try {
                Method method = obj.getClass().getMethod("get"+fieldName, new Class[]{});
                Object invokeResult = method.invoke(obj);
                //假如为日期类型，需要处理后再进行放入map中
                if(field.getType().getName().equals("java.util.Date")){
                	SimpleDateFormat  format = new SimpleDateFormat("yyyy/MM/dd");
     				try {
     					invokeResult = format.parse(format.format(invokeResult));
     				} catch (ParseException e) {
     					// TODO Auto-generated catch block
     					e.printStackTrace();
     				}
                }
                map.put(field.getName(), invokeResult);
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("构建插值数据异常");
            }
        }
        return map;
    }
	 /** 计算相差一个经度和一个纬度之间的距离*/
    public static double getDistance(Object obj){
    	int  EARTH_RADIUS = 6378137; 
//    	String lng1 = wzTFLslj.getJd();
//    	String lat1 = wzTFLslj.getWd();
    	String lng1 = MapReflectUtils.getMethod(obj,"jd")+"";
		String lat1 = MapReflectUtils.getMethod(obj,"wd")+"";
    	double  latDouble1 = rad(Double.parseDouble(lat1));
    	double  latDouble2 = rad(Double.parseDouble(lat1));
    	
    	double latSub = latDouble1 - latDouble2;
    	
//    	double  lngDouble1 = rad(Double.parseDouble(lng1));
//    	double  lngDouble2 = rad(Double.parseDouble(lng1)+1);
    	double lonSub =rad(Double.parseDouble(lng1)) - rad(Double.parseDouble(lng1)+1);
    	double distance = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(latSub / 2), 2) + Math.cos(latDouble1) * Math.cos(latDouble2) * Math.pow(Math.sin(lonSub / 2), 2)));
    	distance = distance*EARTH_RADIUS;
    	distance = Math.round(distance * 10000) / 10000;
    	
    	return distance;
    }
    
    public static double rad(double distance){
    	return distance * Math.PI / 180.0;
    }
		
}
