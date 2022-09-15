package com.loan.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PropertyLoan {

	@Test
	public void webpagepropertyloan() {
		System.out.println("WebPage Property Loan");
		
	}
	
	@Test
	@Parameters("URL")
	public void mobilepagepropertyloan(String URL) {
		System.out.println("MobilePage Property Loan");
		System.out.println(URL);
	}
	
	@Test
	public void apipropertyloan() {
		System.out.println("API Page Property Loan");
	}



}
