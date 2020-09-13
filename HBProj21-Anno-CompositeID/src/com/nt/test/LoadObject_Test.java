package com.nt.test;

import org.hibernate.Session;

import com.nt.entity.ProjectInfo;
import com.nt.entity.Projid;
import com.nt.utility.HibernateUtil;

public class LoadObject_Test{
	public static void main(String[] args) {
		//Get Session Object
		Session ses= null;
		ProjectInfo info=null;
		try {
		ses= HibernateUtil.getSession();
		//prepare entity class Object
		Projid id= null;
		id= new Projid();
		id.setPid(101);
		id.setProjid(1001);
		//calling load(-) method
		info=ses.get(ProjectInfo.class,id);
		if(info!=null) {
			   System.out.println(info);
		}//if
		       else {
		    	   System.out.println("record not found");
		}//else
		
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//closing the Object
			HibernateUtil.closeFactory();
			HibernateUtil.closeSession(ses);
		}
		
	}//main
}//class
