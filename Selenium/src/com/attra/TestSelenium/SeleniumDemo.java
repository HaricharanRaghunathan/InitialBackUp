package com.attra.TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");

		// Start Edge Session
		WebDriver driver = new EdgeDriver();

		driver.get("https://intranet.attra.com/intranet");
		driver.findElement(By.xpath("//input[@id=\"txtuser\"]")).sendKeys("haricharan.raghunathan"); // xpath
																										// and
																										// id
																										// are
																										// the
																										// locators
																										// through
																										// which
																										// we
																										// are
																										// trying
																										// to
																										// identify
																										// the
																										// web
																										// element.
		driver.findElement(By.id("txtpassword")).sendKeys("Abcdefg");
		driver.findElement(By.xpath("/html/body/form/div/div/div[2]/div/div[6]/label/span")).click();
		driver.findElement(
				By.className("recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox"))
				.click();
		driver.findElement(By.xpath("//input[@id='google-authentic']")).click();

	}

}
