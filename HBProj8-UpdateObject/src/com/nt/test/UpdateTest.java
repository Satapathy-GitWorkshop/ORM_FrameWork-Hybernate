package com.nt.test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Patient;
import com.nt.utility.HibernateUtil;


public class UpdateTest {

	public static void main(String[] args) {
		Session session=null;
		Patient p=null;
		Transaction tx=null;
		boolean flag=true;
	//getting session Object
		session=HibernateUtil.getSession();
	//prepare full object modification with existing id
		p= new Patient();
		p.setPtno(1);
        p.setPtname("Suman");
        p.setPtadds("BBSR");
 //Transaction Management Code
        try {
      tx=session.beginTransaction();
      session.update(p);
        	flag =true;
        }//try
        catch(HibernateException he) {
        	he.printStackTrace();
        	flag=false;
        }
        catch (Exception e) {
		    e.printStackTrace();
		}
     finally {
    	 if(flag) {
    		 tx.commit();
    		 System.out.println("Object Updated");
    	 }
    	 else {
    		 tx.rollback();
    		 System.out.println("Object Update Failed");
    	 }
   //Close Object
    	 HibernateUtil.closeFactory();
    	 HibernateUtil.closeSession(session);
        }//fianlly
	}//main
}//class
