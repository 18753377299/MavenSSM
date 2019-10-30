package com.common.utils;

import java.lang.reflect.Field;
import java.util.Locale;
import java.util.ResourceBundle;

import com.example.vo.RiskReportMain_1;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年7月25日 下午4:14:51
 * @version 1.0 
 * @parameter 
 * @since  替换表的语句
 * @return  */
public class ReplaceStatement {
	//连接参数获取
    private static  String tableStatement;

    static {
    	/*获取连接iobjectjava的数据信息*/
		ResourceBundle filePath = ResourceBundle.getBundle("config.createTable", Locale.getDefault());
		 // 定义数据源连接信息，假设以下所有数据源设置都存在
		tableStatement = filePath.getString("tableStatement");
    }	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("=======" + tableStatement);
		RiskReportMain_1 riskReportMain_1 = new RiskReportMain_1();
		Field [] fileds = riskReportMain_1.getClass().getDeclaredFields();
		System.out.println("=========length========"+fileds.length);
		for(Field field:fileds){
			field.setAccessible(true);
			if(field.getType().equals(java.util.List.class)){
			}else {
				String fieldName = field.getName();
				int index = tableStatement.indexOf(fieldName.toLowerCase().trim());
				if(index>-1){
					int length = fieldName.length();
					String targetName = tableStatement.substring(index,index+length);
					tableStatement = tableStatement.replaceAll(targetName, fieldName);
				}
				
			}
		}
		if(tableStatement.indexOf("),")>-1){
			tableStatement =  tableStatement.replaceAll("\\),","\\) COMMENT '需要替换',");
		}
		if(tableStatement.indexOf("NULL,")>-1){
			tableStatement = tableStatement.replaceAll("NULL,", "NULL COMMENT  '需要替换',");
		}
		if(tableStatement.indexOf("TEXT,")>-1){
			tableStatement = tableStatement.replaceAll("TEXT,", "TEXT COMMENT  '需要替换',");
		}
		if(tableStatement.indexOf("INTEGER,")>-1){
			tableStatement = tableStatement.replaceAll("INTEGER,", "INTEGER COMMENT  '需要替换',");
		}
		if(tableStatement.indexOf("DATE,")>-1){
			tableStatement = tableStatement.replaceAll("DATE,", "DATE COMMENT  '需要替换',");
		}
		if(tableStatement.indexOf("SECOND,")>-1){
			tableStatement = tableStatement.replaceAll("SECOND,", "DATE COMMENT  '需要替换',");
		}
		
		System.out.println("====target===" + tableStatement);
		
		
	}

}
