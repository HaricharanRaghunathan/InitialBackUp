package com.zoho.testcases;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.zoho.pages.AppPage;
import com.zoho.pages.Excel;
import com.zoho.pages.HomePage;
import com.zoho.pages.LoginPage;

public class TestCase {
	
	public static Logger log = LogManager.getLogger(TestCase.class.getName());
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.zoho.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		log.info("Logger Message");
		log.error("Error Message");
		log.debug("Debug Message");
		log.fatal("Fatal Message");
		
		HomePage hp = new HomePage(driver);
		LoginPage lp = hp.goToSignIn();
		
		Excel e = new Excel();
		
		AppPage ap = lp.login(e.getData().get(1), e.getData().get(2));
		ap.clickCRM();
		log.info("Logger Message");
		log.error("Error Message");
		log.debug("Debug Message");
		log.fatal("Fatal Message");
		
	}

}
