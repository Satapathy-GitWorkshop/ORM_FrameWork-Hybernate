package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Patient;
import com.nt.utility.HibernateUtil;

public class Updatetest2 {

	public static void main(String[] args) {
		Session ses=null;
		Transaction tx=null;
		Patient pt=null;
		boolean flag=true;
//Get Session Object
		ses=HibernateUtil.getSession();
//TransactionManagement Code
		try {
		tx=ses.beginTransaction();
//Getting the Object from Db table
		pt=ses.get(Patient.class,1);
//Modify the Object for Partial updating
		if(pt!=null) {
		pt.setPtadds("kolkata");
		//ses.update(pt);   ----->bcz we doing inside transcationmangmt so no need of update(-)   
		flag=true;
		}
		else {
			System.out.println("Object Not Found");
			return;
		}
		
		}//try
		catch(HibernateException he) {
			flag=false;
			he.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
  finally {
	if(flag) {
		tx.commit();
		System.out.println("Object Updated");
	}
	else {
		tx.rollback();
		System.out.println("Object not Updated");
	}
	//Closing other Connection
	HibernateUtil.closeFactory();
	HibernateUtil.closeSession(ses);
}//finally		

	}//main
	}//class


