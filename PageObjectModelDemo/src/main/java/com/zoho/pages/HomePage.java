package com.zoho.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;
	public static Logger log = LogManager.getLogger(HomePage.class.getName());
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@class='zh-login']")
	WebElement signin;
	
	public LoginPage goToSignIn() {
		signin.click();
		log.info("Logger Message");
		log.error("Error Message");
		log.debug("Debug Message");
		log.fatal("Fatal Message");
		return new LoginPage(driver);
	}
	
}
