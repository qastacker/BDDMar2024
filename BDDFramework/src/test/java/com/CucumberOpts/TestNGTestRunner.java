package com.CucumberOpts;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/com/features"
				,glue="com.featurescom.stepDefinitions"
				,monochrome=true
				,dryRun=false
				//,tags="@PlaceOrder"
				)
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
