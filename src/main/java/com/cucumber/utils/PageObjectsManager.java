package com.cucumber.utils;

import org.openqa.selenium.WebDriver;

import InsurancecPages.InsuranceHomePage;
import InsurancecPages.InsuranceRegestrationPage;

public class PageObjectsManager {
	
	public WebDriver driver;

	private InsuranceHomePage ihomepage;
	private InsuranceRegestrationPage iregisterpage;
	
	public PageObjectsManager(WebDriver driver){
		this.driver=driver;
	}
	
	
	public InsuranceHomePage getInsuranceHomePage(WebDriver driver){
		
		return (ihomepage==null)? new InsuranceHomePage(driver):ihomepage;
	}
	
	public InsuranceRegestrationPage getInsuranceRegestrationPage(){
		return (iregisterpage==null)? new InsuranceRegestrationPage(driver): iregisterpage;
	}
	
	

}
