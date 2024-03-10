package com.featurescom.stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OfferPageStepDef {

	public WebDriver driver;
	String landPagprodName;
	String offerPageProdName;

	@Given("User is on GreenCartLandingPage")
	public void user_is_on_green_cart_landing_page() {

		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/\r\n"
				+ "\r\n"
				+ "");
	}

	@When("user searched shortname {string} and extract actual name of product")
	public void user_searched_shortname_and_extract_actual_name_of_product(String shortName) throws Exception {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
		Thread.sleep(2000);
		landPagprodName = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
		System.out.println(landPagprodName + "is from Home page");

	}

	@Then("user searched for {string} shortname in offer page")
	public void user_searched_for_same_shortname_in_offer_page(String shortName) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Top Deals")).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String parentWIn = i1.next();
		String childWin = i1.next();
		driver.switchTo().window(childWin);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
		Thread.sleep(2000);
		offerPageProdName = driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
	}

	@Then("validate product name in offer page matches the landing page")
	public void validate_product_name_in_offer_page_matches_the_landing_page() {
		Assert.assertEquals(landPagprodName, offerPageProdName);
	}

}
