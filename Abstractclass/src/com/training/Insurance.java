package com.training;

public abstract class Insurance {
	private int PolicyNumber;
	private String policyHolderName;
	
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Insurance(int policyNumber, String policyHolderName) {
		super();
		PolicyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		
	}
	public int getPolicyNumber() {
		return PolicyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		PolicyNumber = policyNumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setpolicyHolderName(String ploicyHolderName) {
		this.policyHolderName = ploicyHolderName;
	}
	
	public abstract double calculatePremium();

}
