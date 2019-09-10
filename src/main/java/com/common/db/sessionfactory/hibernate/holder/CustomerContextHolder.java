package com.common.db.sessionfactory.hibernate.holder;

public abstract class CustomerContextHolder {
	public final static String SESSION_FACTORY_INFORMIX = "masterSession";
	public final static String SESSION_FACTORY_ORACLE = "slaveSession";

	private static final ThreadLocal<String> SessionFactoryContextHolder = new ThreadLocal<String>();

	public static void setCustomerType(String customerType) {
		SessionFactoryContextHolder.set(customerType);
	}

	public static String getCustomerType() {
		return SessionFactoryContextHolder.get();
	}

	public static void clearCustomerType() {
		SessionFactoryContextHolder.remove();
	}
	
	
}
