package com.common.db.sessionfactory.hibernate;

import org.aspectj.lang.JoinPoint;

import com.common.db.sessionfactory.hibernate.holder.CustomerContextHolder;

public class SessionFactoryAspect{

	public void before(JoinPoint point) {
		System.out.println("-------》 切换sessionfactory【oracle】");
		CustomerContextHolder.setCustomerType(CustomerContextHolder.SESSION_FACTORY_ORACLE);
	}
	
	public void after(JoinPoint point) {
		System.out.println("-------》 切换sessionfactory【默认informix】");
		CustomerContextHolder.clearCustomerType();
	}
	
}
