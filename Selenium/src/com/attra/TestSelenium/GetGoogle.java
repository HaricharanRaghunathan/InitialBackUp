package com.attra.TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetGoogle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Selenium" + Keys.ENTER);//Here the class, id, path are the attributes of the Web Elements..
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).clear();
		Thread.sleep(2000);		
		driver.quit();
		
		
	}

}
