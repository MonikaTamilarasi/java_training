package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.example.demo.services.Services;
import com.example.entity.Customer;
import com.example.entity.LoanApplication;
import com.example.ifaces.CrudRepository;
import com.example.util.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Connection con;
    	con=ConnectionFactory.getOracleConnection();
    	//System.out.println(con);
    	
		Services serv=new Services(con);
//    	serv.findAll(101).forEach(System.out::println);
//		Customer cust2=new Customer(98,"BBB",876543210l,768.8);
//		LoanApplication toAdd=new LoanApplication(78, cust2, 6000);
//		int rowAdded=serv.add(toAdd);
//		System.out.println("row added is : "+rowAdded);
		
		System.out.println(serv.findById(98));
		
		//serv.findAll().forEach(System.out::println);
		
		
	}
    }
