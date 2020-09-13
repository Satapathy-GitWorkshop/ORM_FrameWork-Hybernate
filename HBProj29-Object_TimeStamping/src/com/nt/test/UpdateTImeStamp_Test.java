package com.nt.test;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.BankAccount;
import com.nt.utility.HibernateUtil;

public class UpdateTImeStamp_Test {
public static void main(String[] args) {
	Session ses=null;
	Transaction tx=null;
	Boolean flag=null;
	BankAccount acc=null;
	//get session Object
	ses= HibernateUtil.getSession();
	try {
		tx=ses.beginTransaction();
		//load Object
		acc=ses.load(BankAccount.class, 1L);
		if(acc!=null) {
			acc.setBalance(acc.getBalance()+5000);
			flag=true;
		}
		else {
			System.out.println("Record not found");
			return;
		}
	}
	catch (Exception e) {
		e.printStackTrace();
		flag=false;
	}
	finally {
		if(flag){
			tx.commit();
			System.out.println("Object is Upadted");
			System.out.println("Account is Opened on::"+acc.getOpn_date());
			System.out.println("Account is last Updated on::"+acc.getLastupdate());
		}
		else {
			tx.rollback();
			System.out.println("Object is not Upadted");
		}
		//close Hibernate Object
		HibernateUtil.closeFactory();
		HibernateUtil.closeSession(ses);
	}//fianlly
}
}
