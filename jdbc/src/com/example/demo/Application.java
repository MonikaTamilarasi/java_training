package com.example.demo;
import java.sql.*;
import java.util.Optional;

import com.example.demo.services.ProductService;
import com.example.entity.Product;
public class Application {

	public static void main(String[] args) {
		Connection con;
		try {
			 con=DriverManager.
					getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			 System.out.println(con);
			///ProductService service=new ProductService(con);
			
//			Product toAdd=new Product(5,"ups",3500.00);
//			int rowAdded =service.addProduct(toAdd);
//			System.out.println("Row Added : "+rowAdded);
//			
//			int toDelete=service.deleteById(5);
//			System.out.println("Row deleted : "+toDelete);
			
//			Optional<Product> findById = service.findById(4);
//			if(findById.isPresent()) {
//				System.out.println(findById.get());
//			}else {
//				System.out.println("Product with given id not found");
//			}
			
			//int update=service.updatePriceByName("sofa", 5666);
			//System.out.println("Rows Updated : "+update);
			
			
			//service.findAll().forEach(System.out::println);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}
