package com.featurescom.stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.PageObjects.LandingPage;
import com.PageObjects.PageObjManager;
import com.Utils.TextContentSetup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LandingPageStepDef {

	public WebDriver driver;
	String landPagprodName;
	TextContentSetup txtContSetup;
	PageObjManager pom;
	LandingPage lp; 
	
	public LandingPageStepDef(TextContentSetup txtContSetup){
		this.txtContSetup=txtContSetup;
		lp = txtContSetup.pom.getLandingPage();	
	}

	@Given("User is on GreenCartLandingPage")
	public void user_is_on_green_cart_landing_page() {

	}

	@When("user searched shortname {string} and extract actual name of product")
	public void user_searched_shortname_and_extract_actual_name_of_product(String shortName) throws Exception {
		lp.searchItem(shortName);
		Thread.sleep(2000);
		txtContSetup.landPagprodName = lp.getProdName().split("-")[0].trim();
		System.out.println(landPagprodName + "is from Home page");

	}

}
