package com.task3;
import java.util.*;

import com.exercise2.Employee;



public class Application {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id : ");
		int id=sc.nextInt();
		System.out.println("Enter Employee name : ");
		String name=sc.next();
		System.out.println("Enter Employee salary : ");
		double sal=sc.nextDouble();
		
		Employee obj=new Employee(name,id,sal);
		EmployeeService service=new EmployeeService();
		System.out.println("Employee's Bonus is : "+service.calculateBonus(obj));
		sc.close();
		
		
		
	}
	
	
	
	
}
