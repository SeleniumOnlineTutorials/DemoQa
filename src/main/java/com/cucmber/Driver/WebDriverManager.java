package com.cucmber.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.utils.ConfigFileReader;

public class WebDriverManager {
	
	private WebDriver driver;
	private ConfigFileReader configObj= null;
	private String driverpath;
	private String browserType;
	private String applicaton;
	
	public WebDriverManager(){
		configObj= new ConfigFileReader();	
		driverpath=configObj.getDriverPath();
		browserType=configObj.getBrowserType();
	    applicaton=configObj.getAppliationUrl();
	}
	
	public WebDriver getDriver(){
		
		if(driver==null) driver= createDriver();
				
		return driver;
	}
	
	public WebDriver createDriver(){
		
		if(browserType.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", driverpath);
			driver=new ChromeDriver();
		}
		driver.get(applicaton);
		return driver;
	}
	
	public void closeDriver(){
		driver.close();
		driver.quit();
	}

}
