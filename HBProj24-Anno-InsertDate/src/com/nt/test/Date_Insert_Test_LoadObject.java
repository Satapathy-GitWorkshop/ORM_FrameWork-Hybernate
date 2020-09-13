package com.nt.test;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.PersonInfo;
import com.nt.utility.HibernateUtil;

public class Date_Insert_Test_LoadObject {
public static void main(String[] args) {
	//Get Session Object
	Session ses=null;
	Transaction tx=null;
	PersonInfo info=null;
	boolean flag=false;
	
	ses=HibernateUtil.getSession();
	try {
		
		//Crreate Enitity Object
		info= new PersonInfo();
		
		       //calling load(-)
		      info= ses.load(PersonInfo.class,25);
		       flag=true;
	}//try
	catch(HibernateException he) {
		he.printStackTrace();
		flag=false;
	}
	catch (Exception e) {
		e.printStackTrace();
		flag=false;
	}
	finally {
		if(info!=null) {
			System.out.println("Objecet is found");
			System.out.println(info);
		}//if
			else {
				System.out.println("Object is not found");
		}//else
	
		//Closing Object
		HibernateUtil.closeFactory();
		HibernateUtil.closeSession(ses);
		
	}//fianlly
}//main
}//class
