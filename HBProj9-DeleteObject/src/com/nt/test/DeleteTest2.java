package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Patient;
import com.nt.utility.HibernateUtil;

public class DeleteTest2 {

	public static void main(String[] args) {
		 Session  ses=null;
		 Patient p=null;
		 Transaction tx=null;
		 boolean flag=true;
	//Getting Session Object
		 ses=HibernateUtil.getSession();
	//Create entity class Object
		 p = new Patient();
	//Transactionmanagement Code
		 try {
			 tx= ses.beginTransaction();
			//Create entity class Object
			 p = new Patient();
			 //Getting object data from db table
			 p=ses.get(Patient.class,2);
			 //Deleting data having existing value
			 ses.delete(p);
			 flag=true;
		 }
		 catch (HibernateException he) {
			he.printStackTrace();
			flag= false;
		}
finally {
	if(flag) {
		tx.commit();
	System.out.println("Object deleted");
}
	
		 else {
			 System.out.println("Object not deleted");
		 }
//Closing Other Connection
	HibernateUtil.closeSessionFactory();
	HibernateUtil.CloseSession(ses);
	}//finally

}//main
}//Class
