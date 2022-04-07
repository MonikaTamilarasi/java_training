package com.training;

public class BankAccount {
	//static variable
	private static int count;
	
	//instance variable
	private String accountHolderNamw;
	private double balance;
	private int accountNumber;
	
	//static method
	public static int getCount() {
		return ++count;
	
	}
	//instance method
	public double getUpdatedBalance(double amount) {//parameter variable
		//local variable
		double updatedBalance;
		double currentBalance=0;
		//System.out.println(updatedBalance);
		this.balance=this.balance+amount;
		return this.balance;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(String accountHolderNamw, double balance) {
		super();
		this.accountHolderNamw = accountHolderNamw;
		this.balance = balance;
		this.accountNumber=getCount();
	}
	public String getAccountHolderNamw() {
		return accountHolderNamw;
	}
	public void setAccountHolderNamw(String accountHolderNamw) {
		this.accountHolderNamw = accountHolderNamw;
	}
	public double getBalance() {
		return balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static void setCount(int count) {
		BankAccount.count = count;
	}
	
}
