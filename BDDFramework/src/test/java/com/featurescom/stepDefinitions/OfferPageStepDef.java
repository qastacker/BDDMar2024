package com.featurescom.stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.PageObjects.LandingPage;
import com.PageObjects.OfferPage;
import com.PageObjects.PageObjManager;
import com.Utils.TextContentSetup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OfferPageStepDef {

	public WebDriver driver;
	String offerPageProdName;
	TextContentSetup txtContSetup;
	PageObjManager pom;
	OfferPage op;
	LandingPage lp; 


	public OfferPageStepDef(TextContentSetup txtContSetup){
		this.txtContSetup=txtContSetup;
		op = txtContSetup.pom.getOfferPage();
		lp = txtContSetup.pom.getLandingPage();
	}

	@Then("user searched for {string} shortname in offer page")
	public void user_searched_for_same_shortname_in_offer_page(String shortName) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		switchToOfferPage();
		op.searchItem(shortName);
		Thread.sleep(3000);
		offerPageProdName = op.getProdName();
	}
	
	public void switchToOfferPage() {
		lp.selectTopDealPage();
		txtContSetup.genUtils.SwitchToChildWindow();
	}

	@Then("validate product name in offer page matches the landing page")
	public void validate_product_name_in_offer_page_matches_the_landing_page() {
		System.out.println("one--"+offerPageProdName);
		System.out.println("two--"+txtContSetup.landPagprodName);

		Assert.assertEquals(offerPageProdName, txtContSetup.landPagprodName);
	}

}
