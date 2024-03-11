package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.TextContentSetup;

public class LandingPage {
	
	public WebDriver driver;
	
	By search = By.xpath("//input[@type='search']");
	By prodName = By.cssSelector("h4.product-name");
	By topDeals = By.linkText("Top Deals");

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
}
