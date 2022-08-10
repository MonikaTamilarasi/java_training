package com.training;

public abstract class ClassBankAccount {
	private String AccountHolderName;
	private double Balance;
	
	
	public ClassBankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ClassBankAccount(String accountHolderName, double balance) {
		super();
		AccountHolderName = accountHolderName;
		Balance = balance;
		
	}
	

	public String getAccountHolderName() {
		return AccountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	

	public abstract double deposit(double amount);
	public abstract double withdraw(double amount);
}
