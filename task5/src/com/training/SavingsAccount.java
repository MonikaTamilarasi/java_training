package com.training;

public class SavingsAccount extends ClassBankAccount {
	
	 
	@Override
	public double deposit(double amount) {
		double maxDepositAmount=100000;
		if( amount>maxDepositAmount) {
			System.out.println("Deposit amnt is greater than maximum DepositAmount");;
		}
		else {
			System.out.println("all ok");
		}
		return maxDepositAmount;
	}
	@Override
	public double withdraw(double amount) {
		double minBalance=5000;
		
		if(this.getBalance()<minBalance ) {
			System.out.println("Balance is less then minbalance");;
		}
		else {
			double currentBalance=this.getBalance()-amount;
			System.out.println("The current balance is :"+currentBalance);
		}
		return minBalance;
		
	}
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SavingsAccount(String accountHolderName, double balance) {
		super(accountHolderName, balance);
		// TODO Auto-generated constructor stub
	}
	
}
