package com.training.model;

public class Address {
	private int doorNo;
	private String streetName;
	private String city;
	private String district;
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Address(int doorNo, String streetName, String city, String district) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.district = district;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.doorNo+this.streetName+this.getCity()+this.getDistrict();
	}

}
