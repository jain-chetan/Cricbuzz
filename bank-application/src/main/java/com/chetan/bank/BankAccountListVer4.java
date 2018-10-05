package com.chetan.bank;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;


public class BankAccountListVer4 {
	HashSet<BankAccount> bankAccountList;

	public BankAccountListVer4() {
		bankAccountList = new HashSet<BankAccount>();
	}

	public void addBankAccount(BankAccount acc) {
		bankAccountList.add(acc);
	}

	public HashSet<BankAccount> getAllBankAccount() {
		return bankAccountList;
	}

	public BankAccount getBankAccountByAccNum(int accountNo) {
		for (BankAccount acc : bankAccountList) {
			if (acc.getAccountNo() == accountNo) {
				return acc;
			}
		}
		throw new RuntimeException("No account found");
		// return bankAccountList.get(accountNo);

	}

	public HashSet<BankAccount> DeleteBankAccount(int accountNo) {
		for (BankAccount acc : bankAccountList) {
			if (acc.getAccountNo() == accountNo) {
				bankAccountList.remove(acc);
			}
		}
		// bankAccountList.remove(accountNo);
		return bankAccountList;
	}

	public HashSet<BankAccount> UpdateBankAccount(int accountNo,
			String accountHolderName) {
		for (BankAccount acc : bankAccountList) {
			if (acc.getAccountNo() == accountNo) {
				acc.setAccountHolderName(accountHolderName);
				return bankAccountList;
			}
		}
		throw new RuntimeException("No account found");

	}

	
	//HashSet doesnt support sorting technique as it has its own algorithm
	
	/*public HashSet<BankAccount> sortByName() {
		Collections.sort(bankAccountList,(BankAccount acc1, BankAccount acc2) -> acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName()));
		return bankAccountList;
	}

	
	  public HashSet<BankAccount> sortAccountsByNamev2(){
	  Collections.sort(bankAccountList,new Comparator<BankAccount>(){
	  
	  @Override public int compare(BankAccount acc1,BankAccount acc2){ 
		  return acc1.getAccountHolderName().compareTo(acc2.accountHolderName); 
		  } 
	  });
	  return bankAccountList; 
	  }*/
	 

	public static void main(String[] args) {
		BankAccountListVer4 list = new BankAccountListVer4();
		list.addBankAccount(new SavingsAccount("abc", 5000));
		list.addBankAccount(new SavingsAccount("vfd", 5000));
		list.addBankAccount(new SavingsAccount("dabc", 5000));
		list.addBankAccount(new SavingsAccount("avffv", 5000));

		for (BankAccount acc : list.getAllBankAccount()) {
			System.out.println(acc);
		}

		System.out.println("========================");

		System.out.println(list.getBankAccountByAccNum(2));

		System.out.println("========================");

		/*
		  for(BankAccount acc:list.UpdateBankAccount(2, "def")){
		  System.out.println(acc); }
		  
		  System.out.println("========================");
		  
		  for(BankAccount acc:list.DeleteBankAccount(3)){
		  System.out.println(acc); }
		 */

	}


}
