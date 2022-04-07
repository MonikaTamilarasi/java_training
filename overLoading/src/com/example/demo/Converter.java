package com.example.demo;

public class Converter {
	
	public String convert(String str) {
		return str.toUpperCase();
	}
	
	//overloaded method
	public double convert(double farenTemp) {
		return (farenTemp-32)*5/9;
	}
	
	public double convert(double amt, int frm) {
		double response=amt*100;
		if(frm>1) {
			return amt*120;
		}
		return response;
		
	}	

}
