package com.training;

public class ExceptionHandling {
	public void usingArrayIndexException(String[] args) {
		try {
			System.out.println(args[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Method requires three values to be passed[a,b,c]");
			//e.printStackTrace();
		}
	}
	public void usingNumberFormatException(String value) {
		int age=1;
		try {
			age = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		System.out.println(age);
	}
	
	public String underStandFinallyBlock() throws Exception {
		int denominator=4;
		try {
			System.out.println(4/denominator);
		}catch(ArithmeticException e) {
			System.err.println("Denominator should not be zero");
			//return "Welcome";
			throw new Exception();
			
		}
		finally {
		System.out.println("Inside finally====");
	}
		System.out.println("Thanks,bye bye");
		
		return "Thanks";
	}
}
