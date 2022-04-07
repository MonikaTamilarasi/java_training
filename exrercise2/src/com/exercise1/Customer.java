package com.exercise1;

public class Customer {
	private String name;
	private int idNo;
	private Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, int idNo) {
		super();
		this.name = name;
		this.idNo = idNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNo() {
		return idNo;
	}
	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}
	
	
	
}
