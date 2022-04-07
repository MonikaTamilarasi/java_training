package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
//		int value=Integer.parseInt(args[0]);
//		int value1=Integer.parseInt(args[1]);
//		System.out.println(++value);
//		System.out.println(++value1);
//		
		CurrencyConverter conv =new CurrencyConverter();
		double dblamount=Double.parseDouble(args[0]);
		System.out.println(conv.inrToUsd(dblamount));
		
		Double inrValue=Double.parseDouble(args[1]);
		System.out.println(conv.inrToEuro(inrValue));
		
		double salary =42500;
		int intSal=(int)salary;
		int age=42;
		String strAge = Integer.toString(age);
		int intAge = Integer.valueOf(strAge);
		System.out.println(age);

		
	}

}
