package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.TextContentSetup;

public class LandingPage {
	
	public WebDriver driver;
	
	By search = By.xpath("//input[@type='search']");
	By prodName = By.cssSelector("h4.product-name");
	By topDeals = By.linkText("Top Deals");
	By increment = By.cssSelector("a.increment");
	By addToCart = By.cssSelector(".product-action button");

	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void searchItem(String shortName) {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
	}
	
	public String getProdName() {
		return driver.findElement(prodName).getText();
	}

	public void selectTopDealPage() {
		driver.findElement(topDeals).click();
	}
	
	public String getTitleLandingPage() {
		return driver.getTitle();
	}
	
	public void incrQty(int qty) {
		int i=qty-1;
		while(i>0) {
			driver.findElement(increment).click();
			i--;
		}
	}
	
	public void addToCart() {
		driver.findElement(addToCart).click();
	}
}
