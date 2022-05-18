package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Address;
import com.example.demo.entity.City;
import com.example.demo.entity.User;
import com.example.demo.ifaces.AddressRepository;
import com.example.demo.services.AddressService;

@SpringBootApplication
public class SpringJpaEntityGraphApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(SpringJpaEntityGraphApplication.class, args);
		
		AddressService service=ctx.getBean(AddressService.class);
		//service.task1();
		service.task4();
		ctx.close();
	}
	
//	@Bean
//	public CommandLineRunner runner() {
//		return new CommandLineRunner() {
//			@Autowired
//			AddressRepository repo;
//			
//			@Override
//			public void run(String... args) throws Exception {
//
//				City chennai=new City(101, "Chennai");
//				City cuddalore =new City(102, "Cuddalore");
//				
//				User ram=new User(111, "ram", 987654321l);
//				User revathy=new User(222, "Revathy", 67890654l);
//				
//				Address address1=new Address(1, "Mrs.", cuddalore, revathy);
//				Address address2=new Address(2, "Dr.", chennai, ram);
//				
//				this.repo.save(address1);
//				this.repo.save(address2);
//			}
//		};
//		
//	}

}
