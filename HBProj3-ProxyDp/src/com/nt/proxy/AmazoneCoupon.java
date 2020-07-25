package com.nt.proxy;

import com.nt.component.AmazoneStore;
import com.nt.component.EcommerceStore;

public class AmazoneCoupon implements EcommerceStore {

	private float discount;
	private EcommerceStore real=null;
	double billamt=0.0;
	double netamt=0.0f;
	public AmazoneCoupon(float discount) {
	     this.discount=discount;
	    real= new AmazoneStore()  ;
	}
			
			@Override
			public double shopping(String[] item, double[] price) {
		//calling Concrete class method for billamt
			 billamt=real.shopping(item, price);
		//calculating discount
			 netamt=billamt-(billamt*discount/100);
				return netamt;
			}
		
	}



