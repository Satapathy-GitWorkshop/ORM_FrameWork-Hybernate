package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.nt.entity.patientInfo;
import com.nt.util.HibernateUtil;

public class LoadObjectTest {

	public static void main(String[] args) {
		Session ses=null;
		patientInfo info=null;
		//get Session object
				ses=HibernateUtil.getSession();
		try {
		//calling load method                      //The default connection pool in hibernate is c3p0
		info=ses.load(patientInfo.class,1);        //Instantiating explicit connection provider: org.hibernate.hikaricp.internal.HikariCPConnectionProvider
		                                           //Instantiating explicit connection provider: org.hibernate.vibur.internal.ViburDBCPConnectionProvider
		//varify the data                          //Instantiating explicit connection provider: org.hibernate.c3p0.internal.C3P0ConnectionProvider
		if(info==null)                             //Instantiating explicit connection provider: org.hibernate.agroal.internal.AgroalConnectionProvider
			System.out.println("Record not Found");
		else {
			System.out.println("Record found and displayed");
			System.out.println("Get Details:"+info.getPtno()+"  "+info.getPtname()+"  "+info.getPtadds());
		}
			
	}//try
		catch(HibernateException he) {
			he.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}