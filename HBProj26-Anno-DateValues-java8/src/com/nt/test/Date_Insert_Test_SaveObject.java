package com.nt.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
		     //info.setPid(100);  Because generator is Configured
		       info.setPname("Lata");
		       info.setPadd("Balasore");
		       info.setDob(LocalDate.of(1974,1,23));//Insert specified Date
		       info.setDoj(LocalDateTime.now());//Insert Current date/time
		       //info.setDom(LocalTime.of(23, 35, 21));  if we taking time type then Oracle Doesn't support
		       info.setDom(LocalDate.of(2018,3,12));
		     
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
