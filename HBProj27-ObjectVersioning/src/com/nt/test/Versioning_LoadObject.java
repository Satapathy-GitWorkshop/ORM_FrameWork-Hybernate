package com.nt.test;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.BankAccount;
import com.nt.utility.HibernateUtil;

public class Versioning_LoadObject {
 public static void main(String[] args) {
	//get Session Object
	 Session ses=null;
	 Transaction tx= null;
	 BankAccount acc=null;
	 boolean flag=false;
	 ses=HibernateUtil.getSession();
	
	 
	 //no need of setting versioning values hibernate will take care of that(Default values is 0 )
	 try {
		 //create Enitity class Object and Setting the Values
		 acc= new BankAccount();
		 //begin Transaction
		 tx= ses.beginTransaction();
		 //calling load method
      	acc=ses.load(BankAccount.class,1L);
      	if(acc!=null) {
      		acc.setHoldername("kiran Satpathy");
      		acc.setBalance(4564.5f);
      	}
		 flag=true;
	 }
	 catch(HibernateException | ArithmeticException e) {
		 e.printStackTrace();
		 flag=false;
	 }
	 finally{
		 if(flag!=false) {
			 System.out.println("Object is Saved");
			 tx.commit();
			}
		 else {
			 System.out.println("Object is not saved");
			 tx.rollback();
		 }
		HibernateUtil.closeFactory();
		HibernateUtil.closeSession(ses);
	 }//finally
}
}
