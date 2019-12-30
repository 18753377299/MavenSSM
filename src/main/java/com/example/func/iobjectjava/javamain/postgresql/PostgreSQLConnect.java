package com.example.func.iobjectjava.javamain.postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.common.utils.map.JdbcUtils;

public class PostgreSQLConnect {
	public static void main(String []args){
		Connection connect = null;
		PreparedStatement preState = null;
		ResultSet resultSet = null;
		try {
			// 进行参数连接
		 connect = JdbcUtils.getPostgreConnection();
			
         System.out.println(connect);  
         
//       statement = connect.createStatement();
         // public下的
//         String sql = "select * from sys_user where id ='11' ";
         // sdx下的
         String sql = "select * from SMDTV_1 where name ='Anhui Province'";
         preState = connect.prepareStatement(sql);
         
//       resultSet = statement.executeQuery("select  * from RISKINFO_CLAIM where SERIALNO ='26'");
//       resultSet = statement.executeQuery("select * from SMDTV_45 where SMID=3");
         	
         resultSet = preState.executeQuery();        

        
         while (resultSet.next()){
      	   String name = resultSet.getString("name");
      	   String smperimeter = resultSet.getString("smperimeter");
      	   System.out.println("================="+name+":"+smperimeter);
         }
     } catch (Exception e) {
         e.printStackTrace();
     }finally {
  	   /* 关闭数据库资源*/
  	   JdbcUtils.closeResource( resultSet, preState,connect);
     }
		
	}
}
