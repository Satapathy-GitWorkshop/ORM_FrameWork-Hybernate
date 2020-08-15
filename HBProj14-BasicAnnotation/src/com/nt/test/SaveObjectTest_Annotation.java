package com.nt.test;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Project;
import com.nt.utility.HIbernateUtil;

public class SaveObjectTest_Annotation {

	public static void main(String[] args) {
		Session ses=null;
		Project proj=null;
		Transaction tx=null;
		Boolean flag=true;
		//Getting Session Object
		ses=HIbernateUtil.getInstance();
    try {
    	//Create entity class Object
    	proj= new Project();
    	proj.setProjectid(2L);
    	proj.setProjectname("Fexchange");
    	proj.setProjectcapacity(2);
    	proj.setCompanyname("TechMozo");
    	//Transactional Code
    	if(ses!=null)
    	tx=ses.beginTransaction();
    	ses.save(proj);
    	flag=true;
    }//try
    catch(Exception E) {
    	E.printStackTrace();
    	flag=false;
    }//catch
    finally {
    	if(flag) {
    		tx.commit();
    		System.out.println("Object Saved");
    }
    else {
    	tx.rollback();
    	System.out.println("Object not saved");
    }
}//fianlly
}//main
}//class
