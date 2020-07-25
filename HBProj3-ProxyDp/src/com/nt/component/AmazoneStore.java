package com.nt.component;

public class AmazoneStore implements EcommerceStore {

	@Override
	public double shopping(String[] item, double[] price) {
		//Generating bill amount
		double billamt=0.0;
		for(double p:price) {
			billamt=p;
		}
		/*
		 * double billAmt=0.0;
		     billAmt=DoubleStream.of(prices).sum();
		     return billAmt
		 */
		return billamt;
	}//method
}//class
