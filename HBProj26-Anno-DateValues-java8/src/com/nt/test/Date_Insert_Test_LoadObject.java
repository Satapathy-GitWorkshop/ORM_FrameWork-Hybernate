package com.nt.test;



import org.hibernate.HibernateException;
import org.hibernate.Session;


import com.nt.entity.PersonInfo;
import com.nt.utility.HibernateUtil;

public class Date_Insert_Test_LoadObject {
public static void main(String[] args) {
	//Get Session Object
	Session ses=null;
	
	PersonInfo info=null;

	ses=HibernateUtil.getSession();
	try {
		 info= new PersonInfo();    
		     info=  ses.load(PersonInfo.class,28);
	}//try
	catch(HibernateException he) {
		he.printStackTrace();
	
	}
	catch (Exception e) {
		e.printStackTrace();
	
	}
	finally {
		if(info!=null) {
			System.out.println("Objecet is Found");
			System.out.println(info);
		}//if
			else {
				System.out.println("Object is not Found");
				
		}//else
	
		//Closing Object
		HibernateUtil.closeFactory();
		HibernateUtil.closeSession(ses);
		
	}//fianlly
}//main
}//class
