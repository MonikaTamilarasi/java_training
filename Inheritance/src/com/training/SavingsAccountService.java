package com.training;

import com.traing.BankAccount;
import com.traing.BankAccountService;
import com.traing.SavingsAccount;

public class SavingsAccountService extends BankAccountService {
	public String getcustomerInfo(SavingsAccount account) {
		return account.getAccountHolderName();
	}
	
	@Override
	public double calculateInterest(BankAccount account) {
		double simpleInterest =0.5;
		if (account.getAccountNumber()<=5000) {
			simpleInterest=0.20;
		}
		return account.getBalance()*1*simpleInterest;
	}

}
