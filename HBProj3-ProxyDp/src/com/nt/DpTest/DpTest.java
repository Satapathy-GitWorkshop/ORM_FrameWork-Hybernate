package com.nt.DpTest;

import com.nt.component.EcommerceStore;
import com.nt.factory.ProxyFactory;

public class DpTest {

	public static void main(String[] args) {
	     //calling factory class method for getting the implemented Object
		EcommerceStore store=null;
		store=ProxyFactory.getInstance("sec50");
		double tbill=store.shopping(new String[]{"Rakhi,Sweet,Gift"},new double [] {200,500,1000});
      System.out.println("Total Bill::"+tbill);
	}

}
