package com.Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void SwitchToChildWindow() {
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String parentWIn = i1.next();
		String childWin = i1.next();
		driver.switchTo().window(childWin);
	}

}
