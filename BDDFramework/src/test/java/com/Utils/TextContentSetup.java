package com.Utils;

import org.openqa.selenium.WebDriver;

import com.PageObjects.PageObjManager;

public class TextContentSetup {

	public WebDriver driver;
	public String landPagprodName;
	public PageObjManager pom;

	
	public TextContentSetup() {
		pom = new PageObjManager(driver);
	}
}
