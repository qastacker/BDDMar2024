package com.featurescom.stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.PageObjects.CheckOutPage;
import com.PageObjects.LandingPage;
import com.PageObjects.PageObjManager;
import com.Utils.TextContentSetup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutPageStepDef {

	public WebDriver driver;
	public String landPagprodName;
	public String offerPagprodName;
	public CheckOutPage checkoutPage;;
	TextContentSetup txtContSetup;
	PageObjManager pom;
	LandingPage lp; 
	
	public CheckoutPageStepDef(TextContentSetup txtContSetup){
		this.txtContSetup=txtContSetup;
		this.checkoutPage = txtContSetup.pom.getCheckoutPage();
	}

	@Then("verify user has ability to enter promo code and place the order")
	public void verif_user_has_ability_to_enter_promo_code_and_place_the_order() {
		Assert.assertTrue(checkoutPage.VerifyPromoBtn());
		Assert.assertTrue(checkoutPage.VerifyCheckoutBtn());
	}
	
	@Then("^user proceeds to Checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_Checkout_and_validate_items_in_checkout_page(String name) throws Exception {
		checkoutPage.CheckOutItem(name);
		//Thread.sleep(2000);
	}

}
