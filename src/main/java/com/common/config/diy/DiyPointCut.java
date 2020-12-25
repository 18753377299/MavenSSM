  package com.common.config.diy;

public class DiyPointCut {
	 //前置通知
	     public void before(){
	        System.out.println("begin transaction ");
	     }
	     
	     //后置通知
	     public void after(){
	         System.out.println("commit transaction ");
	     }
}
