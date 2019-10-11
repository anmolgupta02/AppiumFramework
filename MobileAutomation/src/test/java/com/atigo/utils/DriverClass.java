package com.atigo.utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DriverClass {
	
	public static AppiumDriver<WebElement> adriver;
	
	@BeforeSuite
	public void Start() throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("","");
		
		adriver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		
	}
	
	@AfterSuite
	public void Teardown() {
		
		adriver.close();
	}

}
