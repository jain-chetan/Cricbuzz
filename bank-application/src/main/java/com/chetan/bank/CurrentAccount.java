package com.chetan.bank;

public class CurrentAccount extends BankAccount{
	public void withdraw(double amount) throws BalanceInsufficientException {
		if (amount > accountBalance) {
			throw new BalanceInsufficientException();
		} /*else {
			accountBalance -= amount;
		}*/

	}

}
