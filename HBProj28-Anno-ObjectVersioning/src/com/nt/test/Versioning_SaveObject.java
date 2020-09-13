package com.nt.test;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.BankAccount;
import com.nt.utility.HibernateUtil;

public class Versioning_SaveObject {
 public static void main(String[] args) {
	//get Session Object
	 Session ses=null;
	 Transaction tx= null;
	 BankAccount acc=null;
	 boolean flag=false;
	 ses=HibernateUtil.getSession();
	 //create Enitity class Object and Setting the Values
	 acc= new BankAccount();
	 acc.setHoldername("Ayush Mehera");
	 acc.setType("saving");
	 //no need of setting versioning values hibernate will take care of that(Default values is 0 )
	 try {
		 //begin Transaction
		 tx= ses.beginTransaction();
		 //calling save() method
		 ses.save(acc);
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
