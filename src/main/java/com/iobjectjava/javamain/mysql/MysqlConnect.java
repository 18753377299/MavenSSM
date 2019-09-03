package com.iobjectjava.javamain.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iobjectjava.javamain.common.JdbcUtils;


public class MysqlConnect {
	
	public static void main(String [] args){
		Connection connect = null;
//        Statement statement = null;
        PreparedStatement preState = null;
        ResultSet resultSet = null;
		try {
//           Class.forName("oracle.jdbc.OracleDriver");
			// 进行参数连接
			connect = JdbcUtils.getMysqlConnection();
			
           System.out.println(connect);  
           
//         statement = connect.createStatement();
          
           String sql = "select * from account where accountId ='11' ";
//           PreparedStatement preState = connect.prepareStatement("select  * from tb1_dept where id = ?");
           preState = connect.prepareStatement(sql);
           
//         resultSet = statement.executeQuery("select  * from RISKINFO_CLAIM where SERIALNO ='26'");
//         resultSet = statement.executeQuery("select * from SMDTV_45 where SMID=3");
           	
           resultSet = preState.executeQuery();        

          
           while (resultSet.next()){
        	   String amount = resultSet.getString("amount");
        	   String deptId = resultSet.getString("deptId");
        	   System.out.println("================="+amount+":"+deptId);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }finally {
    	   /* 关闭数据库资源*/
    	   JdbcUtils.closeResource( resultSet, preState,connect);
       }
	}

	
}
