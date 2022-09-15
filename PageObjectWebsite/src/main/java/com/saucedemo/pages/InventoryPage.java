package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

WebDriver driver;
	
	public InventoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement item1;
	
	@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-bike-light\"]")
	WebElement item2;
	
	@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement item3;
	
	@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
	WebElement item4;

	@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-onesie\"]")
	WebElement item5;
	
	@FindBy(xpath="//button[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	WebElement item6;
	
	@FindBy(xpath="//a[@class=\"shopping_cart_link\"]")
	WebElement cart;

	public void checkItems(int i) {
		switch(i) {
		case 1: {
			item1.click();
			break;
		}
		case 2:{ 
			item1.click();
			item2.click();
			break;
		}
		case 3:{
			item1.click();
			item2.click();
			item3.click();
			break;
		}
		case 4:{
			item1.click();
			item2.click();
			item3.click();
			item4.click();
			break;
		}
		case 5:{
			item1.click();
			item2.click();
			item3.click();
			item4.click();
			item5.click();
			break;
		}
		case 6:{
			item1.click();
			item2.click();
			item3.click();
			item4.click();
			item5.click();
			item6.click();
			break;
		}
		default:{
			System.out.println("Please enter the total number of items from 1 to 6");
		}
		}	
		}

	public CartPage goToCheckOut() {
		cart.click();
		return new CartPage(driver);
		
	}





}
