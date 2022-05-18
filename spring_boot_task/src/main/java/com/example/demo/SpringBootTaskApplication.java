package com.example.demo;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.ifaces.PassengerRepository;
import com.example.demo.services.PassengerService;

	@SpringBootApplication
	public class SpringBootTaskApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTaskApplication.class, args);
		
		
		
	}
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			PassengerRepository repo;
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				Passenger pas = new Passenger();
				pas.setPassengerId(101);
				pas.setPassengerName("moni");
				pas.setEmail("moni110@gmail.com");
				pas.setLocation("pazhani");
				TripHistory trip1= new TripHistory(201, LocalDateTime.of(2000,11,20,5,8), "cuddalore", "ooty", 10000);
				TripHistory trip2=new TripHistory(202, LocalDateTime.of(2003, 11, 20, 12, 30), "pondy", "thirupathi", 20000);
				TripHistory trip3=new TripHistory(203, LocalDateTime.of(2021, 10, 9, 5, 30), "palani", "karur", 500);

				List<TripHistory> list=Arrays.asList(trip1,trip2,trip3);
				
				pas.setTripList(list);
				repo.save(pas);
			}
		};
	}
	}	
		 
	