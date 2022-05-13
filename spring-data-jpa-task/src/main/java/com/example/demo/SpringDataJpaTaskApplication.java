package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;
import com.example.demo.services.EmployeeServices;

@SpringBootApplication
public class SpringDataJpaTaskApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.
				run(SpringDataJpaTaskApplication.class, args);
		
		Employee moni=ctx.getBean(Employee.class);
		
		EmployeeServices service=ctx.getBean(EmployeeServices.class);
		
		System.out.println("----Adding----");
		Employee added=service.add(moni);
		if(added!=null) {
		System.out.println("===one employee Added===");
		}
		
		System.out.println("---------Find All Employee Details--------");
		service.findAll().forEach(System.out::println);
		
		System.out.println("-------Find by date of birth----------");
		System.out.println(service.findByDateOfBirth(LocalDate.of(2000, 11, 20)));
		
		System.out.println("----------Find by Location------------");
		service.findByLoc("palani").forEach(System.out::println);
		
		System.out.println("----------Find by SkillSet---------");
		service.findSkillSet("java").forEach(System.out::println);
		
		System.out.println("-----------Find by SkillSet and Location--------");
		service.findBySillSetAndLocation("sql", "palani").forEach(System.out::println);	
		
		System.out.println("---------Find By skillSet Or Location-------");
		service.getBySkillSetOrLocation("java", "palani").forEach(System.out::println);;
		ctx.close();

	}

	@Bean
	public Employee employee() {
		return new Employee(101, "moni",LocalDate.of(2000, 11, 20), "palani", "java", 9876543210l);
	}
}
