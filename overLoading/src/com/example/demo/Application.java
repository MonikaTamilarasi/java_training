package com.example.demo;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the Farenheit temp");
		double farenTemp=sc.nextDouble();
		
		System.out.println("Enter the amount");
		double amount=sc.nextDouble();
		System.out.println("enter the current to convert 1.USD 2.EURO");
		int from=sc.nextInt();
		
		Converter conObj=new Converter();
		System.out.println(conObj.convert(name));
		System.out.println("Celcius Temp:"+conObj.convert(farenTemp));
		System.out.println(conObj.convert(amount, from));
		
		sc.close();
	}

}
