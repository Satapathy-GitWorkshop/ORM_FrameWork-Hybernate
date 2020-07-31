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
    	//bootstarp Hibernate
    cfg= new Configuration();
      cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
    	  factory=cfg.buildSessionFactory();
    } //try
    catch (HibernateException he) {
   he.printStackTrace();
	}
   catch (Exception e) {
	e.printStackTrace();
}
 }
    public static Session getSession(){
    	if (factory!=null) {
    		return factory.openSession();
    	}
    	else {
    		return null;
    	}
    }//getSession();
   
    public static void Closefactory() {
    	if(factory!=null) {
    		factory.close();
    	}
    }
    public static void closeSession(Session ses) {
    	if(ses!=null)
    		ses.close();
    }//closeSession

}
