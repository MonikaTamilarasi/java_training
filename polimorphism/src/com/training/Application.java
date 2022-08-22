package com.training;

import com.training.ifaces.Conditional;
import com.training.model.NewObjectFactory;
import com.training.utils.ObjectFactory;

public class Application {

	public static void main(String[] args) {
		
		ObjectFactory factory=new NewObjectFactory();
		Conditional profObj=factory.getconditional(1);
		Conditional studObj=factory.getconditional(2);
	
		
		System.out.println("Allowance:="+factory.getValue(profObj, "chennai"));
		System.out.println("Allowance:="+factory.getValue(studObj, "89"));
		
		Conditional prinObj=factory.getconditional(3);
		System.out.println("Allowance:="+factory.getValue(prinObj,"engg"));
		
		
	}

}
