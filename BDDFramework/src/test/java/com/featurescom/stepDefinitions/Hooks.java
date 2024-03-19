package com.featurescom.stepDefinitions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Utils.TextContentSetup;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	TextContentSetup txtContSetup;
	
	public Hooks(TextContentSetup txtContSetup){
		this.txtContSetup=txtContSetup;
	}
	
	@After
	public void AfterScenario() throws Exception {
		txtContSetup.testbase.WebDriverManager().quit();
	}
	
	@AfterStep
	public void AfterScreenshot(Scenario scenario) throws Exception {
		WebDriver driver = txtContSetup.testbase.WebDriverManager();
		if(scenario.isFailed()) {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(src);
			scenario.attach(fileContent, "image/png", "image");
		}
	}

}
