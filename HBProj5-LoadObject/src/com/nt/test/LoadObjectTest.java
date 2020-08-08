package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.nt.entity.patientInfo;
import com.nt.util.HibernateUtil;

public class LoadObjectTest {

	public static void main(String[] args) {
		Session ses=null;
		patientInfo info=null;
		//get Session object
				ses=HibernateUtil.getSession();
		try {
		//calling load method
		info=ses.load(patientInfo.class,1);
		//varify the data
		if(info==null)
			System.out.println("Record not Found");
		else {
			System.out.println("Record found and displayed");
			System.out.println("Get Details:"+info.getPtno()+"  "+info.getPtname()+"  "+info.getPtadds());
		}
			
	}//try
		catch(HibernateException he) {
			he.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}