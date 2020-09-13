package com.nt.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.BankAccount;
import com.nt.utility.HibernateUtil;

public class CreateTimeStamp_Test {
public static void main(String[] args) {
	Session ses=null;
	BankAccount acc=null;
	Transaction tx=null;
	boolean flag=false;
	//get Session Object
	ses=HibernateUtil.getSession();
	//Create Entity class Object
	acc= new BankAccount();
	acc.setName("kajol");
	acc.setBalance(55.000f);
	acc.setType("saving");
	acc.setOpn_date(LocalDateTime.now());
	//no need of setting last update time it will manage by Hibernate itself
	try {
		//Begin transaction
		tx=ses.beginTransaction();
		//call persistance operation method
		 ses.save(acc);
		flag=true;
	}
	catch (Exception e) {
		e.printStackTrace();
		
	}
	finally {
		if(flag) {
			tx.commit();
			System.out.println("Object is Saved");
			System.out.println("Account is Opened on::"+acc.getOpn_date());
			System.out.println("Account is Updated on::"+acc.getLastupdate());
		}
		else {
			tx.rollback();
			System.out.println("Object is not Saved");
		}
		//Close Hibernate Object
		HibernateUtil.closeFactory();
		HibernateUtil.closeSession(ses);
	}//fianlly
}//main
}//class
