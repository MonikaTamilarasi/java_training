package com.training.model;

import com.training.Insurance;
import com.training.VehicleInsurance;

public class Application {

	public static void printPremium(Insurance object) {
		System.out.println("Premium is "+object.calculatePremium());
		
	}
	public static void main(String[] args) {
		VehicleInsurance car = new VehicleInsurance(1010, "MONI", "car", 2019);
		printPremium(car);
		LifeInsurance life=new LifeInsurance(111, "aaa", 50);
		printPremium(life);
		String[] illness = {"bp","sugar","thyroid"};
		HealthInsurance health = new HealthInsurance(30,"MMMM",illness);
		printPremium(health);
	}

}

