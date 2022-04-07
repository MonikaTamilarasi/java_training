package com.training;
import com.traing.BankAccount;
import com.traing.services.BankAccountService;
import java.util.*;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountService service=new BankAccountService();
		BankAccount[] list=new BankAccount[1];
		Scanner sc=new Scanner(System.in);
		
		int i=0;
		
		int choice=0;
		
		do{
			BankAccount account=new BankAccount();
					System.out.println("ENTER ACCOUNT NUMBER");
					int accountNumber=sc.nextInt();
					
					System.out.println("ENTER ACCOUNT HOLDER NAME");
					String accountHolderName=sc.next();
					System.out.println("ENTER BALANCE");
					double balance=sc.nextDouble();
					System.out.println("ENTER ACCOUNT TYPE[savings,fixed,recurring]");
					String accountType=sc.next();
					System.out.println("ENTER THE CHOICE 0 OR 1");
					choice=sc.nextInt();
					
					
					BankAccount account2=new BankAccount(accountNumber, accountHolderName, balance, accountType);
					list[i]=account2;
					i++;
					
		}while(choice==1);
			double[] values=service.findInterest(list);
			for(double eachvalue:values) {
				System.out.println(eachvalue);
			}
			
		
	
	sc.close();

}
}