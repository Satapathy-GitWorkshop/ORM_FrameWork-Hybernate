package com.nt.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;
	static {
		Configuration cfg=null;
		try {
			//BootStrap the Hibernate
			cfg=new Configuration();
			//locate the Coofiguration file
			cfg.configure("com/nt/cfg/hibernate.cfg.xml");
			//Create sessionFactory Object
			factory=cfg.buildSessionFactory();
		}
		catch(HibernateException he) {
			he.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//try
	
//creating session Object
	public static Session getSession() {
		if(factory!=null) {
			return factory.openSession();
		}
		else
			return null;
	}
//closing factory Object
	public static void closeFactory() {
		if(factory!=null)
			factory.close();
	}
//closing Session object
	public static void closeSession(Session ses) {
		if(ses!=null)
			ses.close();
	}
}//class
