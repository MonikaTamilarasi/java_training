package com.training;

import java.util.Optional;

import javax.management.RuntimeErrorException;

public class UsingOptional {

	 
		public static Optional<String> getValue(int key){
			Optional<String> response=Optional.empty();
			if(key==1) {
				response=Optional.of("Hi");
			}
			return response;
		}
		
		
		public static Object getString(int key) {
		switch(key) {
		case 1 :
			return  new String ("ChocoBar");
			
		
		case 2:
			return new StringBuffer("Cascutta");
		
		default:
			return null;

	}
		}
	public static void main(String[] args) {
		
		//will throw null pointer exception for values 3 and above
		//System.out.println(getString(3).toString());
		
		//to avoid null pointer exceptional and return a default value
		//new feature of java 8 optional is used
		
		Optional<Object> optional=Optional.ofNullable(getString(2));
		System.out.println(optional.orElse("vannila").toString());
		
		Optional<Object> opt2=Optional.ofNullable(getString(3));
		if(opt2.isPresent()) {
			System.out.println("value is present"+opt2.get());
		}else {
			System.out.println("Value is not present");
		}
		
		//using the lambda expression with optional
		Optional<Object>opt3=Optional.ofNullable(getString(2));
		opt3.orElseThrow(() -> new RuntimeException("No object for value 3 try again"));
		
		Optional<String> resp=getValue(2);
		if(resp.isPresent()) {
		System.out.println(resp.get().toString());
		}else {
			System.out.println ("invalid choice Enter 1");
		}
		
		//use the same method but throw exception
		
		resp.orElseThrow(()-> new RuntimeException("Enter a valid choice"));
	}
}

