package com.common.db.sessionfactory.hibernate;

import org.hibernate.SessionFactory;

public interface DynamicSessionFactory extends SessionFactory {
	public SessionFactory getHibernateSessionFactory();
}
