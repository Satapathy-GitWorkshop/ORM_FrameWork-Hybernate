package com.nt.factory;

import com.nt.component.AmazoneStore;
import com.nt.component.EcommerceStore;
import com.nt.proxy.AmazoneCoupon;

public class ProxyFactory {
 
	public static EcommerceStore getInstance(String coupon) {
		if(coupon.equalsIgnoreCase("FIR20")) {
		return new AmazoneCoupon(20);
		}
		else if (coupon.equalsIgnoreCase("SEC50")) {
			return new AmazoneCoupon(56);
		}
		else
			return new AmazoneStore();//real object
			
}//method
}//class