package com.training.model;

import com.training.InvalidEmailException;

public class Customer {
	private int customerId;
	private String customerName;
	private long phoneNumber;
	private String email;
	public Customer() {
		super();
		
		
	}
	public Customer(int customerId, String customerName, long phoneNumber, String email) {
		super();
		if(email.contains("@")&&email.contains(".com") || email.contains(".org")||email.contains(".in")) {
			
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		}else{
			try {
			throw new InvalidEmailException("Enter Proper mail id");
		} catch (InvalidEmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.contains("@")&&email.contains(".com") || email.contains(".org")||email.contains(".in")) {
			this.email=email;
		}
		else {
			try {
				throw new InvalidEmailException("Enter Proper mail id");
			} catch (InvalidEmailException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.email = email;
	}
	
	
}
