package com.common.db.sessionfactory.hibernate;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.SessionFactoryUtils;

public class DynamicTransactionManager extends HibernateTransactionManager {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4072348800796877576L;

	@Override
	public SessionFactory getSessionFactory() {
		// TODO Auto-generated method stub
		DynamicSessionFactory dynamicSessionFactory = (DynamicSessionFactory) super.getSessionFactory();
		SessionFactory hibernateSessionFactory = dynamicSessionFactory.getHibernateSessionFactory();
		return hibernateSessionFactory;
	}

	@Override
	public DataSource getDataSource() {
		// TODO Auto-generated method stub
		return SessionFactoryUtils.getDataSource(getSessionFactory());
	}

}
