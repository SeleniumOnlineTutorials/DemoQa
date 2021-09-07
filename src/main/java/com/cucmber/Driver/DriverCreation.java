package com.cucmber.Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.utils.ConfigFileReader;

public class DriverCreation {
	public static WebDriver driver=null;
	public  static WebDriver driverInitialization(){ 
		ConfigFileReader configObj= new ConfigFileReader();	
		System.out.println("--------"+configObj.getBrowserType());
		if(configObj.getBrowserType().equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", configObj.getDriverPath());
			driver=new ChromeDriver();
		}
		System.out.println("--------"+configObj.getAppliationUrl());
		driver.get(configObj.getAppliationUrl());
		driver.manage().timeouts().implicitlyWait(configObj.getimplicitlyWait(), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		System.out.println("--driver----"+driver);
		
		return driver;
	}

}
