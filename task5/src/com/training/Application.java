package com.training;

public class Application {
	public static void main(String[] args) {
		SavingsAccount saving=new SavingsAccount("moni", 10000);
		saving.withdraw(50);
		saving.deposit(200000);
		
		BusinessAccount business=new BusinessAccount("angel", 6000);
		business.deposit(2000000);
		business.withdraw(500);
		
	}
}
