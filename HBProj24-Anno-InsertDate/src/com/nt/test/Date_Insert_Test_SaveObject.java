package com.nt.test;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.PersonInfo;
import com.nt.utility.HibernateUtil;

public class Date_Insert_Test_SaveObject {
public static void main(String[] args) {
	//Get Session Object
	Session ses=null;
	Transaction tx=null;
	PersonInfo info=null;
	boolean flag=false;
	
	ses=HibernateUtil.getSession();
	try {
		//Begin The Transaction 
		tx=ses.beginTransaction();
		//Crreate Enitity Object
		info= new PersonInfo();
		//Setting value to the field
		     //info.setPid(100);
		       info.setPname("Saurav Satpathy");
		       info.setPadd("Odisha");
		       info.setDob(new Date(8,4,14));
		       info.setDoj(new Date(17,8,13, 5, 32, 05));
		       info.setDom(new Date());
		       //calling save(-)
		       ses.save(info);
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
		if(flag!=false) {
			System.out.println("Objecet is Saved");
			tx.commit();
		}//if
			else {
				System.out.println("Object is not saved");
				tx.rollback();
		}//else
	
		//Closing Object
		HibernateUtil.closeFactory();
		HibernateUtil.closeSession(ses);
		
	}//fianlly
}//main
}//class
