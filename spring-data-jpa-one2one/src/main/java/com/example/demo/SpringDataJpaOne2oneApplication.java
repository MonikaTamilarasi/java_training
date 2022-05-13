package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.utils.SeminarUtils;

@SpringBootApplication
public class SpringDataJpaOne2oneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(SpringDataJpaOne2oneApplication.class, args);
		
		SeminarUtils obj=ctx.getBean(SeminarUtils.class);
		//obj.create();
		obj.findAll();
		ctx.close();
	}
	
	
	@Bean
	public Speaker moni() {
		return new Speaker(1, "moni", "BE");
	}
	
	@Bean
	public Seminar java() {
		return new Seminar(101, "java", 908, moni());
	}

}
