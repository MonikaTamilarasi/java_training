package com.training.utils;

import com.training.MarutiCar;
import com.training.ToyotaCar;
import com.training.ifaces.Automobile;

public class ObjectFactory {
	public Automobile getObject(int key) {
		switch (key) {
		case 1:
			return new MarutiCar();
		case 2:
			return new ToyotaCar();

		default:
			return null;
		}
		
	}
	public void printQuote(Automobile poly) {
		System.out.println("colour : "+poly.colour());
		System.out.println("Model : "+poly.model());
		System.out.println("price : "+poly.price());
		
	}
}
