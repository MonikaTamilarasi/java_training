package com.training.services;

import com.training.ifaces.AgeCondition;
import com.training.ifaces.Conditional;

public class StudentresultService implements Conditional<Double> ,AgeCondition<Double>{

	@Override
	public boolean test(Double t) {
		// TODO Auto-generated method stub
		return t>80;
	}

	@Override
	public boolean negate(Double value) {
		//Completely overriding type with custom type
		if(value>100) {
			return true;
		}
		else {
			return false;
		}
		
		//calling one of the super type
		//boolean result1= Conditional.super.negate(value);
		//return result 1;
		
		
		
//		calling both the super type
//		boolean result1= Conditional.super.negate(value);
//		boolean result2= AgeCondition.super.negate(value);
//		if(result1 && result2) {
//			return true;
//		}else {
//			return false;
//		}
//		
	}

}
