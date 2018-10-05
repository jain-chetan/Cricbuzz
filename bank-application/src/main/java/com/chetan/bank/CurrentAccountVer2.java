package com.chetan.bank;

public class CurrentAccountVer2 extends CurrentAccount implements Insurance{
	@Override
	public void getInsuranceId() {
		System.out.println("Current Account --> Insurance ID number");
		
	}
	@Override
	public void getInsuranceName() {
		System.out.println("Current Account --> Insurance Name");
		
	}

}
