package com.training;

import com.training.ifaces.Automobile;

public class ToyotaCar implements Automobile {

	@Override
	public String colour() {
		// TODO Auto-generated method stub
		return "Blue";
	}

	@Override
	public String model() {
		// TODO Auto-generated method stub
		return "I09";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 100000;
	}

}
