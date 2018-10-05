package com.chetan.bank;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class BankAccountTreeSet {
	TreeSet<BankAccount> bankAccountList;

	public BankAccountTreeSet() {
		bankAccountList = new TreeSet<BankAccount>();
	}

	public void addBankAccount(BankAccount acc) {
		bankAccountList.add(acc);
	}

	public TreeSet<BankAccount> getAllBankAccount() {
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

	public TreeSet<BankAccount> DeleteBankAccount(int accountNo) {
		for (BankAccount acc : bankAccountList) {
			if (acc.getAccountNo() == accountNo) {
				bankAccountList.remove(acc);
			}
		}
		// bankAccountList.remove(accountNo);
		return bankAccountList;
	}

	public TreeSet<BankAccount> UpdateBankAccount(int accountNo,
			String accountHolderName) {
		for (BankAccount acc : bankAccountList) {
			if (acc.getAccountNo() == accountNo) {
				acc.setAccountHolderName(accountHolderName);
				return bankAccountList;
			}
		}
		throw new RuntimeException("No account found");

	}

	
	
	
	/*public TreeSet<BankAccount> sortByName() {
		Collections.sort(bankAccountList,(BankAccount acc1, BankAccount acc2) -> acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName()));
		return bankAccountList;
	}

	
	  public TreeSet<BankAccount> sortAccountsByNamev2(){
	  Collections.sort(bankAccountList,new Comparator<BankAccount>(){
	  
	  @Override 
	  public int compare(BankAccount acc1,BankAccount acc2){ 
		  return acc1.getAccountHolderName().compareTo(acc2.accountHolderName); 
		  } 
	  });
	  return bankAccountList; 
	  }*/
	 

	public static void main(String[] args) {
		BankAccountTreeSet list = new BankAccountTreeSet();
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
