package com.chetan.cust;


import com.chetan.bank.BalanceInsufficientException;
import com.chetan.bank.BankAccount;
import com.chetan.bank.BankAccountList;
import com.chetan.bank.CurrentAccountVer2;
import com.chetan.bank.SavingsAccount;
import com.chetan.bank.SavingsAccountVer2;

public class Customer {

	public static void main(String[] args) throws BalanceInsufficientException {
	/*	BankAccount acc1 = new BankAccount();
		acc1.withdraw(5000);
		acc1.deposit(10000);
		BankAccount acc2 = new BankAccount();
		BankAccount acc3 = acc1;

		System.out.println("Bank account 1 " + acc1);
		System.err.println("Bank account 2 " + acc2);
		System.out.println("Bank account 3 " + acc3);*/
		
		/*SavingsAccount acc=new SavingsAccount();
		acc.deposit(1050);
		acc.withdraw(500);
		System.out.println("Bank account 1 " + acc);*/
		
		/*BankAccount acc=null;
		acc=new SavingsAccount();
		acc.deposit(10000);
		acc.withdraw(500);*/
		
		// this doesnt work as this function is available only to class SavingsAccount and not BankAccount..
		
		//acc.isSalaryAccount(); 
		
		
		/*SavingsAccountVer2 acc=new SavingsAccountVer2();
		acc.getInsuranceId();
		acc.getInsuranceName();
		
		CurrentAccountVer2 acc1=new CurrentAccountVer2();
		acc1.getInsuranceId();
		acc1.getInsuranceName();*/
	/*	BankAccount acc1=new SavingsAccount(); 
		BankAccount acc2=new SavingsAccount(); 
		BankAccount acc3=new SavingsAccount(); 
		BankAccountList acc=new BankAccountList();
		acc.AddBankAccount(acc1, 3);
		acc.AddBankAccount(acc2, 2);
		acc.AddBankAccount(acc3, 1);
		*/
	}

}
