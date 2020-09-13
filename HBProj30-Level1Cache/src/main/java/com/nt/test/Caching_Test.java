package com.nt.test;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.BankAccount;
import com.nt.utility.HibernateUtil;

public class Caching_Test {
public static void main(String[] args) {
	Session ses=null;
	Boolean flag=null;
	BankAccount acc=null,acc1=null;
//Get Session Object
	ses= HibernateUtil.getSession();
try {
	//load Object
	acc=ses.get(BankAccount.class,2L);//gets from DB and puts in L1 cache
	System.out.println("1"+acc);
	System.out.println("............................");
	acc1=ses.get(BankAccount.class,2L);//Directly get from L1 Cache
	System.out.println("1"+acc1);
	System.out.println("............................");
	ses.evict(acc);   //removes the current object from L1 Cache
	acc1=ses.get(BankAccount.class,2L);//gets from DB and puts in L1 cache
	System.out.println("1"+acc1);
	System.out.println("............................");
	acc1=ses.get(BankAccount.class,2L);//Directly get from L1 Cache
	System.out.println("1"+acc1);
	System.out.println("............................");
	ses.clear();//remove all Object from L1 Cache
	acc=ses.get(BankAccount.class,2L);//gets from DB and puts in L1 cache
	System.out.println("1"+acc);
	System.out.println("............................");
}

catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
finally {
	HibernateUtil.closeFactory();
	HibernateUtil.closeSession(ses);
}

}}