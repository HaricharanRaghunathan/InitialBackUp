package com.saucedemo.testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.ExcelPage;
import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.InformationPage;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.OverviewPage;

public class TestCase {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		Thread.sleep(2000);
		
		ExcelPage e1 =new ExcelPage();
		
		HomePage hp = new HomePage(driver);
		InventoryPage ip = hp.SignIn(e1.getData().get(1),e1.getData().get(2) );
		Thread.sleep(2000);
		ip.checkItems(4);
		Thread.sleep(2000);
		CartPage cp = ip.goToCheckOut();
		Thread.sleep(2000);
		InformationPage ip1 = cp.completeCheckout();
		Thread.sleep(2000);
		ip1.enterDetails(e1.getData().get(4),e1.getData().get(5),e1.getData().get(6));
		Thread.sleep(2000);
		OverviewPage op = ip1.continuetoNext();
		Thread.sleep(2000);
		op.finish();
	}

}
