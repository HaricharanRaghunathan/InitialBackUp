package com.zoho.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

WebDriver driver;
public static Logger log = LogManager.getLogger(LoginPage.class.getName());
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//input[@id='login_id']")
	WebElement loginid;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement loginpassword;
	
	public AppPage login(String username, String password ) {
		loginid.sendKeys(username+Keys.ENTER);
		loginpassword.sendKeys(password+Keys.ENTER);
		log.info("Logger Message");
		log.error("Error Message");
		log.debug("Debug Message");
		log.fatal("Fatal Message");
		return new AppPage(driver);
	}

}
