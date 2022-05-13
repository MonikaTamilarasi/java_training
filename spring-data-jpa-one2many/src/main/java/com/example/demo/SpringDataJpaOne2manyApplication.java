package com.example.demo;

import javax.swing.text.Utilities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.util.bidirection.Utility;
import com.example.demo.utils.DoctorUtils;

@SpringBootApplication
public class SpringDataJpaOne2manyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(SpringDataJpaOne2manyApplication.class, args);
		
		DoctorUtils obj=ctx.getBean(DoctorUtils.class);
		obj.create();
		obj.findAll();
		
		Utility util=ctx.getBean(Utility.class);
		util.findDoctorFromPatient();
		ctx.close();
	}

	
	@Bean
	public Doctor moni() {
		Doctor doc=new Doctor();
		doc.setDoctorId(101);
		doc.setDoctorName("moni");
		doc.setPhoneNumber(987654321);
		doc.setDepartment("ent");
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
