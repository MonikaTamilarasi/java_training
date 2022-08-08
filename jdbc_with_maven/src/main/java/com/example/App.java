package com.example;

import java.sql.Connection;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import com.example.dao.MemberRepository;
import com.example.demo.services.ProductService;
import com.example.entity.Invoice;
import com.example.entity.Member;
import com.example.entity.Product;
import com.example.util.ConnectionFactory;

public class App 
{

	public static void member() {
		
	}
	
	public static void product() {
    	Connection con;
		con=ConnectionFactory.getPostgresConnection();

		ProductService service=new ProductService(con);
		Product toAdd=new Product(104,"cosmetics",800.00);
		int rowAdded =service.addProduct(toAdd);
		System.out.println("Row Added : "+rowAdded);
		service.findAll().forEach(System.out::println);

	}
	
	
    public static void main( String[] args )
    {
    	Connection con;
		try {
			 //con=DriverManager.
					//getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			 //System.out.println(con);
			con=ConnectionFactory.getOracleConnection();
			ProductService service=new ProductService(con);

//				con=ConnectionFactory.getPostgresConnection();
//				System.out.println(con);

			 //MemberRepository rep=new MemberRepository(con);
			 
			 //Member toadd = new Member(110, "BBB", "CCC",LocalDate.of(2022, 05, 05), "LIFETIME", 600, 3, 400);
             
			 //System.out.println("rowadded:="+toadd);
			 
			//product();
			
//			Product laddu=new Product(19, "laddu", 400);
//			Product badusha=new Product(11, "badhusa ", 300);
//			service.usingTxn(laddu, badusha);
			
			
			Product prod=new Product(12, "toys", 5000);
			Invoice inv=new Invoice(107, "members", 4, 10);
			service.usingTxnWithCatchBlock(prod, inv);
			
			

			 //rep.findAll().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
