package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.services.DoctorServices;

@SpringBootApplication
public class SpringDataJpaSimpleMappingApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx=SpringApplication.run
				(SpringDataJpaSimpleMappingApplication.class, args);
		
		Doctor moni=ctx.getBean(Doctor.class);
		
		DoctorServices service=ctx.getBean(DoctorServices.class);
		//find all
		//service.findAll().forEach(System.out::println);
		
		//find by...
		//service.findByDept("ent").forEach(System.out::println);
		
		System.out.println(service.findByDoctorName("moni"));
		
		//service.findByDoctorNameAndDepartment("amt", "ent").forEach(System.out::println);
		
		//service.getByNameOrDept("moni", "cardiologist").forEach(System.out::println);;
		
		//adding 
//		Doctor added=service.add(moni);
//		if(added!=null) {
//			System.out.println("one Doctor Added");
//		}
		ctx.close();
			
	}
	@Bean
	public Doctor moni(){
		return new Doctor(101,"moni","cardiologist",9876543210l);
	}
}
