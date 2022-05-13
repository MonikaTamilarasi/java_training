package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.birectional.Doctor;
import com.example.demo.entity.birectional.Patient;
import com.example.demo.util.bidirection.Utility;


@SpringBootApplication
public class SpringDataJpaOne2manyBidApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
				SpringApplication.run(SpringDataJpaOne2manyBidApplication.class, args);
		Utility util=ctx.getBean(Utility.class);
		//util.create();
		util.findDoctorFromPatient();
		//util.findAll();
		
	}
	
	@Bean
	public Doctor moni() {
		Doctor doc=new Doctor();
		doc.setDoctorId(101);
		doc.setDoctorName("moni");
		doc.setDepartment("ent");
		doc.setPhoneNumber(987654321);
		return doc;
	}
	
	@Bean
	public Patient rev() {
		return new Patient(1, "rev", 8765432198l);
	}
	
	@Bean
	public Patient viji() {
		return new Patient(2, "viji", 876232198l);
	}
	
	@Bean
	public Patient pero() {
		return new Patient(3, "pero", 898432198l);
	}

}
