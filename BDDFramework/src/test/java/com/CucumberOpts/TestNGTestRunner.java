package com.CucumberOpts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/com/features",
				glue="com.featurescom.stepDefinitions",
				monochrome=true)
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
