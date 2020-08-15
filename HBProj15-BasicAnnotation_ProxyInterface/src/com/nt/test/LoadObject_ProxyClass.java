package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.enitity.Project;
import com.nt.utility.HIbernateUtil;

public class LoadObject_ProxyClass {
	//Mian Method

	public static void main(String[] args) {
	//get Session object
		Session ses=null;
		Transaction tx=null;
		boolean flag=true;
		
		ses=HIbernateUtil.getInstance();
		//create enitityClass Object
		Project proj= new Project();
		proj.setProjid(1230);
		proj.setProjname("foreignExchange");
		proj.setProjcapacity(156);
		proj.setCompname("TechMozo");
		//Trasactional Statement
		try {
			tx=ses.beginTransaction();
			if(ses!=null) {
				//ses.save(proj);
				ses.load(Project.class,1230);
				System.out.println(proj);
			flag=true;
			}
		}//try
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			flag=false;
		}//catch
	finally {
		if(flag) {
			tx.commit();
			System.out.println("Object is saved");
		}
		else {
			tx.rollback();
			System.out.println("Object is not saved");
	}	
		//closig extra Connection
		HIbernateUtil.closeSessionFactory();
		HIbernateUtil.CloseSession(ses);
		
	}//fianlly
  }//main
}//class
