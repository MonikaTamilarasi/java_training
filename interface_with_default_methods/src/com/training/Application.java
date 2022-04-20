package com.training;

import com.training.ifaces.Conditional;
import com.training.services.StudentresultService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentresultService service=new StudentresultService();
		System.out.println("Is pass : ="+service.test(90.00));
		System.out.println("is Fail :="+service.negate(90.00));
		System.out.println(Conditional.getMessage());
	}

}
