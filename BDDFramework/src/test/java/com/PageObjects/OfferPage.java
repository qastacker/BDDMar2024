package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {

	public WebDriver driver;

	By search = By.xpath("//input[@type='search']");
	By prodName = By.cssSelector("h4.product-name");

	public OfferPage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchItem(String shortName) {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
	}

	public String getProdName() {
		return driver.findElement(prodName).getText();
	}
}
