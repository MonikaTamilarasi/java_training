package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class LoanService {
	
	public double getInterestrate(int value) {
		
		System.out.println(value);
		return 4.5;
	}
}
