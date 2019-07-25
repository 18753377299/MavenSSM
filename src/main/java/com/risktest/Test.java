package com.risktest;

import com.alibaba.fastjson.JSON;
import com.vo.Emp;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年6月20日 下午4:12:38
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class Test {
	
	public static void main(String []args){
		String empString= "{'empName':'123'}";
		Emp emp = JSON.parseObject(empString,Emp.class);
		System.out.println(emp.getEmpName());
	}
	
}
