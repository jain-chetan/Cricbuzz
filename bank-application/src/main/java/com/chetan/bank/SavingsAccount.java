package com.chetan.bank;

public class SavingsAccount  extends BankAccount {
	public SavingsAccount() {
		
		// TODO Auto-generated constructor stub
	}
	public SavingsAccount(String accountHolderName, double accountBalance) {
		super(accountHolderName,accountBalance);
	}
	public void withdraw(double amount) throws BalanceInsufficientException {
		if (amount > accountBalance) {
			throw new BalanceInsufficientException();
		} else {
			accountBalance -= amount;
		}

	}
	public void isSalaryAccount(){
		System.out.println("Salary Account");
	}
	
	
}