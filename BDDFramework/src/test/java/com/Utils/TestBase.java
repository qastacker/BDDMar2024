package com.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public WebDriver driver;

	public WebDriver WebDriverManager() throws Exception {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties"); 
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("base_url");
		String browser = prop.getProperty("browser");
		if(driver==null) {
			
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		}
		
		return driver;
	}
}
