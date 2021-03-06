package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.patientInfo;
import com.nt.utility.HibernateUtill;

public class Merge_Test {

	public static void main(String[] args) {
		//Getting Session Object
		Session ses=null;
		Transaction tx=null;
		boolean flag=true;
		ses=HibernateUtill.getSession();
		//Create Entity class Object for Modification	
		patientInfo p= new patientInfo();
		p.setPtno(3);
		p.setPtname("CHIKU");
		p.setPtadds("Odisha");
		//TransactionManagement Statement
		try {
			tx=ses.beginTransaction();
			ses.merge(p);
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
			}
	//Closing extra Connection
			HibernateUtill.CloseSessionfactory();
			HibernateUtill.closeSession(ses);
		}

	}

}
