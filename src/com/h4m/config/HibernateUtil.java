package com.h4m.config;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
private static SessionFactory sessionFactory;
	
	private static SessionFactory buildSessionFactory(){
		SessionFactory factory = null;
		try{
		 factory = new Configuration().configure().buildSessionFactory();
		}catch(HibernateException e){
			e.printStackTrace();
			System.err.println("failed to create sessionFactory :( :( ");
		}
		return factory;
	}
	
	public static SessionFactory getSessionFactory(){
		if(sessionFactory==null){
			sessionFactory=buildSessionFactory();
		}
		return sessionFactory;
	}

}
