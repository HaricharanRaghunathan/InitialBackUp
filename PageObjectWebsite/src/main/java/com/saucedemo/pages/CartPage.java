package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//button[@class=\"btn btn_action btn_medium checkout_button\"]")
	WebElement checkout;
	
	public InformationPage completeCheckout() {
		checkout.click();
		return new InformationPage(driver);
	}
	

}
