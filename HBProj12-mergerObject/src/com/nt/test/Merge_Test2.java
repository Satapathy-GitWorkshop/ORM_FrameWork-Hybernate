package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.patientInfo;
import com.nt.utility.HibernateUtill;

public class Merge_Test2 {

	public static void main(String[] args) {
		//Getting Session Object
		Session ses=null;
		Transaction tx=null;
		boolean flag=true;
		ses=HibernateUtill.getSession();
		
		
		//Create Entity class Object for Modification	
				patientInfo p= new patientInfo();
		//Get the Object from db table
	  p= ses.get(patientInfo.class, 2);
System.out.println(p);
//Closing extra Connection
		
		 //TransactionManagement Statement
			try {
				tx=ses.beginTransaction();
				//Create Entity class Object for Modification	
				patientInfo p1= new patientInfo();
				p1.setPtno(2);
				p1.setPtname("sipu");
				p1.setPtadds("Odisha");
				
				//calling not select method
				//ses.delete(p1);            (javax.persistence.EntityExistsException)
				//ses.update(p1);            (org.hibernate.NonUniqueObjectException)
           		//ses.save(p1);              (org.hibernate.NonUniqueObjectException)
				ses.merge(p1);
				flag=true;
			}
	      catch ( Exception e) {
					// TODO: handle exception
	    	        e.printStackTrace();
	    	        flag=false;
				}	
			finally {
				if(flag) {
				tx.commit();
				System.out.println("Work fine");
				}
				else {
					tx.rollback();
				System.out.println("Something got Wrong");
				HibernateUtill.CloseSessionfactory();
				HibernateUtill.closeSession(ses);
				
				}
			
		}

	}
}

