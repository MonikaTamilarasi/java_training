package com.training.model;

import com.training.InvalidEmailException;

public class Application {
	public static void main(String[] args) {
		Customer ram=new Customer(1010,"ram",9876543210l,"mmmgmai");
		
		if(ram.getEmail()!=null){
		System.out.println(ram.getCustomerId());
		System.out.println(ram.getEmail());
		}
		
		
	}

}
