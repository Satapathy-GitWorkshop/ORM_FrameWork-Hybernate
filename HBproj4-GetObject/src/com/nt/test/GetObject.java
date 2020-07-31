package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.nt.entity.PatientDeatils;
import com.nt.util.HibernateUtil;

public class GetObject {

	public static void main(String[] args) {
		Session ses=null;
		PatientDeatils pdetails=null;
		//Get Session Objection
		ses=HibernateUtil.getSession();
		//Get Object data from data Base
		try{
			pdetails=ses.get(PatientDeatils.class,1);
			//System.out.println("Get Details:"+pdetails.getPtno()+"  "+pdetails.getPtname()+"  "+pdetails.getPtadds());
			//verify
			if(pdetails==null)
				System.out.println("Record not Found");
			else {
				System.out.println("Record found and displayed");
				System.out.println("Get Details:"+pdetails.getPtno()+"  "+pdetails.getPtname()+"  "+pdetails.getPtadds());
				System.out.println(pdetails);
			}
		}//try
		catch(HibernateException he){
			he.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
