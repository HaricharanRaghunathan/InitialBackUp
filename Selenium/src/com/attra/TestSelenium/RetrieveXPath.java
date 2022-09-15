package com.attra.TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RetrieveXPath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/xpath-selenium.html");
		String title = driver.getTitle();
		String st = driver.findElement(By.xpath("//*[@id=\"post-987\"]/div/div/p[31]/code")).getText(); // here the double slash * represents nothing but a command to search anywhere in the web browser for the particular web element.  
		System.out.println(st+"\n"+ title);
		System.out.println("The following element is displayed or not : " +driver.findElement(By.xpath("//*[@id=\"post-987\"]/div/div/ul[1]/li[11]/a")).isDisplayed() );

		// while writing the xpath, if we want to move to one path prior to the chosen one, use /.. after typing the xpath. 
	}

}
