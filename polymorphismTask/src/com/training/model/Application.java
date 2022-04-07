package com.training.model;

import com.training.ifaces.Automobile;
import com.training.utils.ObjectFactory;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectFactory factory=new ObjectFactory();
		
		Automobile marutiObj=factory.getObject(1);
		Automobile toyotaObj=factory.getObject(2);
		factory.printQuote(marutiObj);
		factory.printQuote(toyotaObj);
		
	}

}
