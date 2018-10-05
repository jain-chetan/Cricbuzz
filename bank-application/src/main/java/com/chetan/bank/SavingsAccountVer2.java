package com.chetan.bank;

public class SavingsAccountVer2 extends SavingsAccount implements Insurance{
	@Override
	public void getInsuranceId() {
		System.out.println("Savings Account--> Insurance ID number");
		
	}
	@Override
	public void getInsuranceName() {
		System.out.println("Savings Account--> Insurance Name");
		
	}

}
