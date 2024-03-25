package com.CucumberOpts;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/com/features"
				,glue="com.featurescom.stepDefinitions"
				,monochrome=true
				,dryRun=false
				,tags="@PlaceOrder or @OffersPage"
				,plugin= {
					"html:target/cucumber.html"
					,"json:target/cucumber.json"
					,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
					,"rerun:result/failed_scenarios.txt"
				}
				)
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
