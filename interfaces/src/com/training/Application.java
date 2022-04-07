package com.training;

import com.training.ifaces.CheckCondition;
import com.training.ifaces.Conditional;
import com.training.ifaces.DiscountCalculator;
import com.training.ifaces.Function;
import com.training.services.CurrencyConverter;

public class Application {

	public static void main(String[] args) {
		
		//subtype=new subtype
		//CurrencyConverter conv=new CurrencyConverter();
		
		//supertype=subtype
		Function conv=new CurrencyConverter();
		
		
		double response=conv.apply(2000);
		
		System.out.println(Function.COUNTER);
		System.out.println(response);
		//both is same
		System.out.println(conv.apply(3000));
		if(conv instanceof CheckCondition)
		{
			CheckCondition obj=(CheckCondition)conv;
		
		System.out.println("Is Discount Allowed:="+obj.test(300));
		}
		
		Conditional conObj=new DiscountCalculator();
		System.out.println(conObj.test(600));
		System.out.println(conObj.negate(6000));
		}

}
