package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.TextContentSetup;

public class CheckOutPage {
	
	public WebDriver driver;
	
	By cartBag = By.cssSelector("[alt='Cart']");
	By checkOutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promrBtn = By.cssSelector(".promoBtn");
	By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");

	
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void CheckOutItem(String shortName) {
		driver.findElement(cartBag).click();
		driver.findElement(checkOutButton).click();
	}
	
	public Boolean VerifyPromoBtn() {
		return driver.findElement(promrBtn).isDisplayed();
	}
	
	public Boolean VerifyCheckoutBtn() {
		return driver.findElement(placeOrder).isDisplayed();
	}
	
	
}
