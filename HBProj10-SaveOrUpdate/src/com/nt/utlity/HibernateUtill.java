package com.nt.utlity;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtill {
   private static SessionFactory factory;
   static {
	  try {
	   //Create IOC Container
	   Configuration cfg=null;
	   cfg= new Configuration();
	   cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
        factory=cfg.buildSessionFactory();
	  }//try
	  catch (HibernateException he) {
		// TODO: handle exception
		  he.printStackTrace();
	}
	  catch (Exception e) {
		// TODO: handle exception
		  e.printStackTrace();
	}
   }
   public static Session getSession() {
	   if(factory!=null)
		   return factory.openSession();
	   else {
		   return null;
	   }
   }//getSession()
   public static void CloseSessionfactory() {
	   if(factory!=null)
		   factory.close();
   }
   public static void closeSession(Session ses) {
	   if(ses!=null)
		   ses.close();
   }
   
}
