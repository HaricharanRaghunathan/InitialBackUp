package com.attra.TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.id("iframeResult"))); // This is necessary because when an object is inside a frame, it is not accessible generally.. You have to go inside the frame to access the objects inside the frame..
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		ele.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	}

}
