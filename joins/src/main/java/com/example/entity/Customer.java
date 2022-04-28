package com.example.entity;

public class Customer {
	private int customerId;
	private String customer_name;
	private long phoneNumber;
	private double creditScore;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customer_name, long phoneNumber, double creditScore) {
		super();
		this.customerId = customerId;
		this.customer_name = customer_name;
		this.phoneNumber = phoneNumber;
		this.creditScore = creditScore;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(double creditScore) {
		this.creditScore = creditScore;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customer_name=" + customer_name + ", phoneNumber="
				+ phoneNumber + ", creditScore=" + creditScore + "]";
	}
	
	
}
