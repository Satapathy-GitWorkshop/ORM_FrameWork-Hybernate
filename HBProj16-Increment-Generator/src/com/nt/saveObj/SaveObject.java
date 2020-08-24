package com.nt.saveObj;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.Product;

public class SaveObject {

	public static void main(String[] args){
	Configuration cfg=null;
	SessionFactory factory=null;
	Session ses=null;
	Product prod=null;
	Transaction trans=null;
	boolean flag=false;
	int idval=0;

//Activating the hibernate Framework
	cfg=new Configuration();
//Supply Configuration as Input file	
    cfg.configure("com/nt/cfgs/hibernate.cfg.xml");	
//Create SeessionFactory Object
    factory=cfg.buildSessionFactory();
//open session Object
    ses=factory.openSession();
//Create entity class Object to Store data to database
    prod=new Product();
       
       prod.setPname(" fan");
       prod.setPrice(200);
       prod.setQty(1);
 //Transaction management Code
       try {
    	   trans= ses.beginTransaction();  //internally calls  con.setAutoCommit(false) to begin the Tx
    	   System.out.println("Transaction objecct class name::"+trans.getClass());
    	   //Save the Object  
    	  idval= (int)ses.save(prod);
    	  System.out.println("Generated ideantity values::"+idval);
    	     flag=true;
       }
       catch(HibernateException hbe) {
    	   hbe.printStackTrace();
    	   flag=false;
       }
       finally {
    	   if(flag==true) {
    		   trans.commit();  //internally calls con.commit()
    		   System.out.println("Object is Saved");
    	   }
    		   else {
    			   trans.rollback();  //internally calls  con.rollback()
    			   System.out.println("Object is not Saved");
    			   
    		   }
 //Clean up code
    	   ses.close();
    	   factory.close();
    	   }//finally
       }//main
	}//class


