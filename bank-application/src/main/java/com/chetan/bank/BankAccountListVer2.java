package com.chetan.bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BankAccountListVer2 {
	ArrayList<BankAccount> bankAccountList;
	
	
	public BankAccountListVer2() {
		bankAccountList=new ArrayList<BankAccount>();
	}
	
	public void addBankAccount(BankAccount acc) {
		bankAccountList.add(acc);
	}
	
	public ArrayList<BankAccount> getAllBankAccount() {
		return bankAccountList;
	}
	
	public BankAccount getBankAccountByAccNum(int accountNo) {
		for(BankAccount acc:bankAccountList){
			if(acc.getAccountNo()==accountNo){
				return acc;
			}
		}
		throw new RuntimeException("No account found");
		//return bankAccountList.get(accountNo);
		 
	}
	
	public ArrayList<BankAccount> DeleteBankAccount(int accountNo) {
		for(BankAccount acc:bankAccountList){
			if(acc.getAccountNo()==accountNo){
				bankAccountList.remove(acc);
			}
		}
		//bankAccountList.remove(accountNo);
		return bankAccountList;
	}
	
	public ArrayList<BankAccount> UpdateBankAccount(int accountNo,String accountHolderName) {
		for(BankAccount acc:bankAccountList){
			if(acc.getAccountNo()==accountNo){
				acc.setAccountHolderName(accountHolderName);
				return bankAccountList;
			}
		}
		throw new RuntimeException("No account found");
		
	}
	
	
	public ArrayList<BankAccount> sortByName() {
		Collections.sort(bankAccountList,(BankAccount acc1,BankAccount acc2)->acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName()));
		return bankAccountList;
	}
	
	  public ArrayList<BankAccount> sortAccountsByNamev2(){
          Collections.sort(bankAccountList,new Comparator<BankAccount>(){
                 @Override
                 public int compare(BankAccount acc1,BankAccount acc2){
                       return acc1.getAccountHolderName().compareTo(acc2.accountHolderName);
                 }
          });
          return bankAccountList;
  }

	

	
	public static void main(String[] args) {
		BankAccountListVer2 list=new BankAccountListVer2();
		list.addBankAccount(new SavingsAccount("abc",5000));
		list.addBankAccount(new SavingsAccount("vfd",5000));
		list.addBankAccount(new SavingsAccount("dabc",5000));
		list.addBankAccount(new SavingsAccount("avffv",5000));
		
		for(BankAccount acc:list.getAllBankAccount()){
			System.out.println(acc);
		}
		
		System.out.println("========================");
		
		System.out.println(list.getBankAccountByAccNum(2));
		
		System.out.println("========================");
		
		/*for(BankAccount acc:list.UpdateBankAccount(2, "def")){
			System.out.println(acc);
		}
		
		System.out.println("========================");
		
		for(BankAccount acc:list.DeleteBankAccount(3)){
			System.out.println(acc);
		}*/
		
		
	}
}
