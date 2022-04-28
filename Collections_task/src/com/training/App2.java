package com.training;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.training.model.Product;
import com.training.model.ProductService;

public class App2 {
	public static void main(String[] args) {
		
		Product p1=new Product(111, "SOAP", 99);
		Product p2=new Product(222, "RICE", 97);
		Product p3=new Product(333, "COSMETICS", 98);
		Product p4=new Product(444, "BISCUITS", 96);
		Product p5=new Product(555, "others", 90);
		
		TreeSet<Product> products=new TreeSet<>();
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
//		for(Product eachProduct:products) {
//			System.out.println(eachProduct);
//		}
		
		ProductService service=new ProductService(products);
		
	}
}
