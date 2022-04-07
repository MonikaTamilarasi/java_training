package com.traing;

public class BankAccount {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.accountNumber+","+this.accountHolderName+","+this.balance+","+this.AccountType;
	}
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	private String AccountType;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("ZERO Arg constructor of SUPER CLASS called");
	}
	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		System.out.println("THREE Arg constructor of SUPER CLASS called");
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		this.AccountType = accountType;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAccount(int accountNumber, String accountHolderName, double balance, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.AccountType = accountType;
		System.out.println("FOUR Arg constructor of SUPER CLASS called");
	}
	

}
