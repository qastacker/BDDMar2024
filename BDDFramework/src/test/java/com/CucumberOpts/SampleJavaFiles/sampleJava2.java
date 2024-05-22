package com.CucumberOpts.SampleJavaFiles;

import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(sdf.format(new java.util.Date()));
		System.out.println(" string: "+sdf.toString());
		System.out.println(" string: "+sdf.toString());
	}

}
