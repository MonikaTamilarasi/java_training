package com.training;
import com.traing.BankAccount;
import com.traing.BankAccountService;
import com.traing.SavingsAccount;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BankAccount account=new BankAccount(1010,"Ramesh",50000,"savings");
//		System.out.println(account);
		SavingsAccount account=new SavingsAccount(650, "MONI",1000, "JOINT", "AAAA");
		System.out.println(account.getAccountHolderName());
		System.out.println(account.getNominee());
		
		
		SavingsAccountService service = new SavingsAccountService();
		System.out.println(service.getcustomerInfo(account));
		System.out.println(service.calculateInterest(account));
		
		BankAccountService service2=new SavingsAccountService();
		//cannot access the subclass method with super class reference
		//service2.getCustomerInfo(account);
		SavingsAccountService savingservice2=(SavingsAccountService)service2;
		System.out.println(savingservice2.getcustomerInfo(account));
		
	}

}
