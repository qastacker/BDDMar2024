package com.featurescom.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.Utils.TextContentSetup;

import io.cucumber.java.After;

public class Hooks {
	
	TextContentSetup txtContSetup;
	
	public Hooks(TextContentSetup txtContSetup){
		this.txtContSetup=txtContSetup;
	}
	
	@After
	public void AfterSCenario() throws Exception {
		txtContSetup.testbase.WebDriverManager().quit();
	}

}
