package com.chetan.bank;

public class BankAccountList {
	int index = -1;
	BankAccount[] bankAccountList = new BankAccount[10];

	public void addBankAccount(BankAccount acc) {
		bankAccountList[++index] = acc;
	}

	public BankAccount[] getAllBankAccount() {
		return bankAccountList;

	}

	public BankAccount getBankAccountByAccNum(int accountNo) {
		for (BankAccount acc : bankAccountList) {
			if (acc.getAccountNo() == accountNo) {
				return acc;
			}
		}
		throw new RuntimeException("Account doesn't exist");
	}

	public BankAccount[] DeleteBankAccount(int accountNo) {
		for (int internalIndex = 0; internalIndex <= index; internalIndex++) {
			if (bankAccountList[internalIndex].getAccountNo() == accountNo) {
				for (int insideInternal = internalIndex; insideInternal < bankAccountList.length - 1; insideInternal++) {
					bankAccountList[insideInternal] = bankAccountList[insideInternal + 1];
				}
				index--;
			}
		}
		return bankAccountList;
	}

	public BankAccount[] UpdateBankAccount(int accountNo,
			String accountHolderName) {
		for (int internalIndex = 0; internalIndex < bankAccountList.length; internalIndex++) {
			if (bankAccountList[internalIndex].getAccountNo() == accountNo) {
				bankAccountList[internalIndex]
						.setAccountHolderName(accountHolderName);
				return bankAccountList;
			}
		}
		throw new RuntimeException("Account doesn't exist");
	}

	public static void main(String[] args) {
		BankAccountList list = new BankAccountList();
		list.addBankAccount(new SavingsAccount("Shweta", 5000.0));
		list.addBankAccount(new SavingsAccount("Dhanya", 4000.0));
		list.addBankAccount(new SavingsAccount("Khushboo", 4500.0));

		/*
		 * for(BankAccount acc:list.getAllBankAccount()) {
		 * System.out.println(acc); }
		 * 
		 * System.out.println(list.getBankAccountByAccNum(3));
		 */

		/*
		 * for(BankAccount acc:list.UpdateBankAccount(3,"Neha")) {
		 * System.out.println(acc); }
		 */

		for (BankAccount acc : list.DeleteBankAccount(3)) {
			System.out.println(acc);

		}
	}
}