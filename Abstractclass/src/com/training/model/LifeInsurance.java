package com.training.model;

import com.training.Insurance;

public class LifeInsurance extends Insurance {
	private int Age;
	
	

	@Override
	public double calculatePremium() {
		double premium=10000;
		if (Age<50) {
			premium=5000;
		}
		return premium;
	}

	public LifeInsurance(int policyNumber, String ploicyHolderName, int age) {
		super(policyNumber, ploicyHolderName);
		Age = age;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	
	

}
