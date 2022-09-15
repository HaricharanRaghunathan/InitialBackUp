package com.attra.TestSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDemo1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://intranet.attra.com/intranet/");
		
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	WebElement ele1 = (WebElement) jse.executeScript("return document.getElementById('txtuser');");
	 ele1.sendKeys("haricharan");
	WebElement ele2 = (WebElement) jse.executeScript("return document.getElementById('txtpassword');");
	ele2.sendKeys("Abcdefg");
	WebElement ele3 =(WebElement) jse.executeScript("return document.getElementById('rememberChkBox');"); 
	ele3.click();
	WebElement ele4 =(WebElement) jse.executeScript("return document.getElementById('recaptcha-anchor');"); 
	ele4.click();
	WebElement ele5 = (WebElement) jse.executeScript("return document.getElementById('google-authentic');");
	ele5.click();
	
		
		
		
		
	}
}
