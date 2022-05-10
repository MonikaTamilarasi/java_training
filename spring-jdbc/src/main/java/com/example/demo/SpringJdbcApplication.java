package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringJdbcApplication.class, args);
		ProductRepository repo=ctx.getBean(ProductRepository.class);

//		Product tv=ctx.getBean(Product.class);
//		System.out.println("Row Added :="+repo.add(tv));
		
		//System.out.println(repo.findById(9));
		repo.findAll().forEach(System.out::println);
//		Product update=ctx.getBean(Product.class);
//		System.out.println(repo.update(update));

		//System.out.println(repo.remove(95));
		}
	
	@Bean
	public Product tv() {
		return new Product(22,"sony",34000);
	}
	
	@Primary
	@Bean
	public Product updateProduct(){
		return new Product(91,"amt",777);
	}

}
