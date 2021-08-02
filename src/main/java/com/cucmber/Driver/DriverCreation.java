package com.cucmber.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverCreation {
	public static WebDriver driver=null;
	public  static WebDriver driverInitialization(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		return driver;
	}

}
