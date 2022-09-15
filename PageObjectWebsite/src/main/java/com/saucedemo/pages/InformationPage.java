package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationPage {
	
WebDriver driver;
	
	public InformationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//input[@id=\"first-name\"]")
	WebElement FirstName;

	@FindBy(xpath="//input[@id=\"last-name\"]")
	WebElement LastName;

	@FindBy(xpath="//input[@id=\"postal-code\"]")
	WebElement ZIPCode;

	@FindBy(xpath="//input[@id=\"continue\"]")
	WebElement Continue;
	
	public void enterDetails(String fn, String ln, String zip) {
		FirstName.sendKeys(fn);
		LastName.sendKeys(ln);
		ZIPCode.sendKeys(zip);;
	}

	public OverviewPage continuetoNext(){
		Continue.click();
		return new OverviewPage(driver);
	}


}
