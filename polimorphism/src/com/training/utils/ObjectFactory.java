package com.training.utils;

import com.training.ifaces.Conditional;
import com.training.model.Professor;
import com.training.model.Student;

public class ObjectFactory {
	
	public Conditional getconditional(int key) {
		switch (key) {
		case 1:
			return new Professor("phd");
			
		case 2:
			return new Student(89);
			

		default:
			return null;
		}
	}
	public double getValue(Conditional obj ,Object moni) {
		boolean result=obj.test(moni);
		double travelAllowance=1000;
		if(result) {
			travelAllowance=2000;
			
		}
		return travelAllowance;
	}

}
