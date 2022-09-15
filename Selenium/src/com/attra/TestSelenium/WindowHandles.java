package com.attra.TestSelenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandles {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='app']//div/a[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='app']//div/a[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='app']//div/a[1]")).click();
		Thread.sleep(1000);
		
		

		Set<String> handles = driver.getWindowHandles();
		List<String> winhand = new ArrayList<String>(handles);
		if(GetRightWindow("Twitter",winhand)) {
			System.out.println("The required URL is: "+ driver.getCurrentUrl());
		}
		
	}

	public static boolean GetRightWindow(String wintitle, List<String> winhand) {
		
		for(String e : winhand) {
			String title = driver.switchTo().window(e).getTitle();
			if(title.contains(wintitle)) {
				System.out.println("Found the Required Window \n");
				return true;
		}		
	}
		return false;

}

}