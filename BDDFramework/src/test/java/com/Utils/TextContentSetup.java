package com.Utils;

import org.openqa.selenium.WebDriver;

import com.PageObjects.PageObjManager;

public class TextContentSetup {

	public WebDriver driver;
	public String landPagprodName;
	public PageObjManager pom;
	public TestBase testbase;
	public GenericUtils genUtils;

	
	public TextContentSetup() throws Exception {
		testbase = new TestBase();
		pom = new PageObjManager(testbase.WebDriverManager());
		genUtils = new GenericUtils(testbase.WebDriverManager());
	}
}
