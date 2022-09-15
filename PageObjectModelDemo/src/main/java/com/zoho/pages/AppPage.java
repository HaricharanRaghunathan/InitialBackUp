package com.zoho.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppPage {

WebDriver driver;
public static Logger log = LogManager.getLogger(AppPage.class.getName());
	
	public AppPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[text() = \"CRM\"]")
	WebElement CRM;
	
	public void clickCRM() {
		CRM.click();
	}
	
	
}
