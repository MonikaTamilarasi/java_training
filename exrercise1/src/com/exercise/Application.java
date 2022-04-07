package com.exercise;
import java.util.*;
import com.exercise1.Customer;
import com.exercise2.Employee;
import com.exercise3.Hotel;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer abc = new Customer("ABC",34);
		System.out.println("Customer name : "+abc.getName());
		System.out.println("Customer ID : "+abc.getIdNo());
		
		
		
		Employee amt=new Employee("AMT",21,40000);
		System.out.println("Employee Name : "+amt.getName());
		System.out.println("Employee id : "+amt.getIdNo());
		System.out.println("Employee salary : "+amt.getSal());
		
		
		Hotel am=new Hotel(04,"AM",400);
		System.out.println("Hotel ID : "+am.getHotelId());
		System.out.println("Hotel Name : "+am.getName());
		System.out.println("Hotel Rent : "+am.getRent());
		
	}

}
