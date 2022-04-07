package com.training.model;

public class Application {

	public static void main(String[] args) {
		
		
		Address address=new Address(234, "weststreet", "palani", "Dindigul");
		MobileBill ram=new MobileBill("RAM", 9876543210l, "prepaid",address);
		MobileBill moni=new MobileBill("RAM", 9876543210l, "postpaid",address);
		

		System.out.println(ram.amountCalculation());
		System.out.println(moni.amountCalculation());
		
		 

	}

}
