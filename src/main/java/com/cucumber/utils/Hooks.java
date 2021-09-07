package com.cucumber.utils;

import org.openqa.selenium.WebDriver;

import com.cucmber.Driver.WebDriverManager;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
	public WebDriverManager webManager=null;
	public WebDriver drivers=null;
	
	@Before
	public void beforeScenario(){
		System.out.println("Before Scenario");
		webManager=new WebDriverManager();
		drivers=webManager.getDriver();
		
	}
	
	@After
	public void afterScenario(){
		webManager.closeDriver();
	}

}
