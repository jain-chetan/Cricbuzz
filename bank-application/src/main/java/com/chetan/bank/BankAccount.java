package com.chetan.bank;

/**
 * this comment is documentation based comment
 * 
 * @author chetajai
 * @since 03-10-2018
 *
 */

public class BankAccount implements Comparable<BankAccount>{
	int accountNo;
	String accountHolderName;
	double accountBalance;
	static int autoAccountNoGen;
	
	
	/**
	 * Init block --> this block is called even before constructors are called.
	 */
	{
		accountNo = ++autoAccountNoGen;
	}

	public BankAccount() {
		accountHolderName = "Unknown";
		accountBalance = 0;
	}

	public BankAccount(String accountHolderName, double accountBalance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	//public abstract void withdraw(double amount) throws BalanceInsufficientException;


	public void deposit(double amount) {
		accountBalance += amount;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName="
				+ accountHolderName + ", accountBalance=" + accountBalance
				+ "]";
	}

	@Override
	public int compareTo(BankAccount acc) {
		
		return acc.getAccountNo()+getAccountNo();
	}

}
