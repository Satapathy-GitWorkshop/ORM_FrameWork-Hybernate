package com.nt.utility;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HIbernateUtil {
private static SessionFactory factory;
static {
	Configuration cfg=null;
	try {
	cfg= new Configuration();
	cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
	//create sessionFactory Object
	factory=cfg.buildSessionFactory();
	}//try
	catch (HibernateException he) {
		he.printStackTrace();
	}//catch
}//static-block
   public static Session getInstance() {
	   if(factory!=null) {
		   return factory.openSession();
	   }
	   else
		   return null;
   }
   public static void closeSessionFactory() {
	   if(factory!=null)
		   factory.close();
   }
   public static void CloseSession(Session ses) {
	   if(ses!=null)
		   ses.close();
   }
}//class
