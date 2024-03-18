package com.PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjManager {

	public LandingPage landingPage;
	public OfferPage offerPage;
	public WebDriver driver;
	public CheckOutPage checkoutPage;
	
	public PageObjManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LandingPage getLandingPage() {
		landingPage=new LandingPage(driver);
		return landingPage;
	}
	
	public OfferPage getOfferPage() {
		offerPage=new OfferPage(driver);
		return offerPage;
	}
	
	public CheckOutPage getCheckoutPage() {
		checkoutPage=new CheckOutPage(driver);
		return checkoutPage;
	}
}
