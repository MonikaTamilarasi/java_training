package com.exercise3;

public class Hotel {
	private int hotelId;
	private String name;
	private double rent;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(int hotelId, String name, double rent) {
		super();
		this.hotelId = hotelId;
		this.name = name;
		this.rent = rent;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	

}
