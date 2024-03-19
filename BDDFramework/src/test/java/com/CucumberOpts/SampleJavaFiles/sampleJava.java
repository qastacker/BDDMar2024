package com.CucumberOpts.SampleJavaFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/\r\n"
//				+ "\r\n"
//				+ "");
		
		String input="a1b2c3";
		String op = "";
		StringBuilder st = new StringBuilder();
		for(char c:input.toCharArray()) {
			st.append(c).append(c);
			op = st.toString();
		}
		System.out.println(op);
	}

}
