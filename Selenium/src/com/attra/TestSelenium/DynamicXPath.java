package com.attra.TestSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicXPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Kolkata, India");
		List<WebElement> dynele = driver.findElements(By.xpath("//div[@class='calc60']/p[1]"));

		for (int i = 0; i < dynele.size(); i++) {

			String ele = dynele.get(i).getText();
			if (ele.equalsIgnoreCase("Kolkata, India")) {
				dynele.get(i).click();
			break;
			}
		}

	}

}
