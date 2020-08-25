package com.nt.test;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Mobile;
import com.nt.utility.HibernateUtil;

public class Create_Table {

	public static void main(String[] args) {
		Session ses=null;
		Mobile mob=null;
		Transaction tx=null;
		boolean flag=true;
		long idval=0;
		
	//Getting Session Object
		ses=HibernateUtil.getSession();
	//Create enitity class Object
        mob= new Mobile();
       // mob.setNo(2L);
        mob.setBrand("Vivo12");
        mob.setOwner("Kajol15");
        try {
        	tx=ses.beginTransaction();	
        	idval=(long)	ses.save(mob);
        	System.out.println("Generated id value::"+idval);
        		flag=true;	    	
        }
        catch (Exception e) {
			// TODO: handle exception
        	e.printStackTrace();
        	flag=false;
		}
        finally {
			if(flag) {
			
				System.out.println("Object is is Saved");
				tx.commit();
		}
        else {
        	System.out.println("Object is not saved");
        	tx.rollback();
        }
//closing the Connection
			HibernateUtil.closeFactory();
			HibernateUtil.closeSession(ses);
        
	}//fianlly
}
}
