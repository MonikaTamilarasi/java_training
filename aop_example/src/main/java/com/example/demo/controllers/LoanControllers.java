package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.LoanService;

@RestController
@RequestMapping("/api/v1")
public class LoanControllers {
	
	private LoanService service;
	
	@Autowired
	public LoanControllers(LoanService service) {
		super();
		this.service = service;
	}
	
	
	
	@GetMapping(path = "/loans")
	public ResponseEntity<String> getLoanDetails(){
		double val=this.service.getInterestrate(6700);
		return ResponseEntity.ok(val+"Per Annum");
	}
}
