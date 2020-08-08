package com.nt.utility;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
public static SessionFactory factory;
//Create Container inside static block
static {
	Configuration cfg=null;
	
	try {
		cfg= new Configuration();
		cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
		//Create Sessionfactory objevt
		factory=cfg.buildSessionFactory();
	}
	catch(HibernateException he) {
		he.printStackTrace();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
//create Session Object
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
	
	
}

