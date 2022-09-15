package com.loan.testcases;

import org.testng.annotations.Test;

public class CarLoan {

	@Test(groups={"Smoke"})
	public void webpagecarloan() {
		System.out.println("WebPage Car Loan");
		
	}
	
	@Test
	public void mobilepagecarloan() {
		System.out.println("MobilePage Car Loan");
	}
	
	@Test
	public void apicarloan() {
		System.out.println("API Page Car Loan");
	}





}


