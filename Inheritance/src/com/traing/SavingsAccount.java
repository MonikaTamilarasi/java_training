package com.traing;

public class SavingsAccount extends BankAccount {
	private String nominee;
	//whenever sub class constructor is called its super class constructor 
	//also called.Even if super() key wrd is not present
//	public SavingsAccount() {
//		System.out.println("constructor of sub class called");
//		
//	}
//	public SavingsAccount() {
//		super(1021,"ram",5000);
//		System.out.println("constructor of SUB CLASS called");
//	}

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.nominee = nominee;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	
	
}

