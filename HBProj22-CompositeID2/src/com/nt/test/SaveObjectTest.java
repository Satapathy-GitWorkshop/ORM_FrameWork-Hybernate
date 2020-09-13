package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.ProjectInfo;
import com.nt.entity.Projid;
import com.nt.utility.HibernateUtil;

public class SaveObjectTest {
	public static void main(String[] args) {
		Session ses=null;
		Transaction tx=null;
		ProjectInfo info=null;
		boolean flag=false;
		Projid id=null;
	
		//Get Session Object
		ses=HibernateUtil.getSession();
		//create enitity class Object
		info= new ProjectInfo();
		try {
			//begin the transaction
			tx=ses.beginTransaction();
			//Setting value ID to property
			id=new  Projid();
			id.setPid(101);
			id.setProjid(1001);
			//Setting value to ENTITY property
			info.setId(id);
			info.setProjectname("Jenkins");
			info.setDeptno(1);
			//Calling save(-) method
			id= (Projid) ses.save(info)	;
			flag=true;
		}
		catch (HibernateException he) {
			// TODO: handle exception
			he.printStackTrace();
			flag=false;
		}
		catch(Exception e) {
			e.printStackTrace();
			flag=false;
		}
		if(flag!=false) {
			tx.commit();
			System.out.println("Object is Saved");
			System.out.println(id);
		}
		else {
			tx.rollback();
			System.out.println("Object is not Saved");
		}
		//closing The Object
		HibernateUtil.closeFactory();
		HibernateUtil.closeSession(ses);
	}

}
