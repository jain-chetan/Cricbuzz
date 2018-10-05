package com.chetan.bank;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class BankAccountListVer3 {

	LinkedList<BankAccount> bankAccountList;

	public BankAccountListVer3() {
		bankAccountList = new LinkedList<BankAccount>();
	}

	public void addBankAccount(BankAccount acc) {
		bankAccountList.add(acc);
	}

	public LinkedList<BankAccount> getAllBankAccount() {
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

	public LinkedList<BankAccount> DeleteBankAccount(int accountNo) {
		for (BankAccount acc : bankAccountList) {
			if (acc.getAccountNo() == accountNo) {
				bankAccountList.remove(acc);
			}
		}
		// bankAccountList.remove(accountNo);
		return bankAccountList;
	}

	public LinkedList<BankAccount> UpdateBankAccount(int accountNo,
			String accountHolderName) {
		for (BankAccount acc : bankAccountList) {
			if (acc.getAccountNo() == accountNo) {
				acc.setAccountHolderName(accountHolderName);
				return bankAccountList;
			}
		}
		throw new RuntimeException("No account found");

	}

	public LinkedList<BankAccount> sortByName() {
		Collections.sort(
				bankAccountList,
				(BankAccount acc1, BankAccount acc2) -> acc1
						.getAccountHolderName().compareTo(
								acc2.getAccountHolderName()));
		return bankAccountList;
	}

	
	  public LinkedList<BankAccount> sortAccountsByNamev2(){
	  Collections.sort(bankAccountList,new Comparator<BankAccount>(){
	  
	  @Override public int compare(BankAccount acc1,BankAccount acc2){ 
		  return acc1.getAccountHolderName().compareTo(acc2.accountHolderName); 
		  } 
	  });
	  return bankAccountList; 
	  }
	 

	public static void main(String[] args) {
		BankAccountListVer3 list = new BankAccountListVer3();
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
		 * for(BankAccount acc:list.UpdateBankAccount(2, "def")){
		 * System.out.println(acc); }
		 * 
		 * System.out.println("========================");
		 * 
		 * for(BankAccount acc:list.DeleteBankAccount(3)){
		 * System.out.println(acc); }
		 */

	}
}
