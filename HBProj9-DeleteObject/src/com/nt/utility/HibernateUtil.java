package com.nt.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
private static SessionFactory factory;
static {
	Configuration cfg=null;
	cfg= new Configuration();
	cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
	//create sessionfactory Object
	factory=cfg.buildSessionFactory();
}
public static Session getSession() {
	if(factory!=null) {
		return factory.openSession();
	}
	else {
		return null;
	}
}
public static void closeSessionFactory() {
	if(factory!=null) {
		factory.close();
}
}
public static void CloseSession(Session ses) {
	if(ses!=null)
		ses.close();
}

}//class
