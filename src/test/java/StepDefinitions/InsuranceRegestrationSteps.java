package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.cucmber.Driver.DriverCreation;
import com.cucumber.utils.PageObjectsManager;

import InsurancecPages.InsuranceHomePage;
import InsurancecPages.InsuranceRegestrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class InsuranceRegestrationSteps {
	
	public WebDriver driver;
//	public DriverCreation browser=null;
//	public PageObjectsManager pageObject=null;
//	
//	@Given("User navigates to Insurance Page")
//	public void user_navigates_to_Insurance_Page() {
//		browser=new DriverCreation();
//		driver=browser.driverInitialization();
//		pageObject = new PageObjectsManager(driver); 
//	}
//	
//	@Given("User Clicks on Register button")
//	public void user_Clicks_on_Register_button() {
//		pageObject.getInsuranceHomePage(driver).clickOnRegisterButton();
//	}
//	@Then("User enters the required fields")
//	public void user_enters_the_required_fields(io.cucumber.datatable.DataTable dataTable) {
//	    List<Map<String,String>> hmap=dataTable.asMaps(String.class, String.class);
//	    pageObject.getInsuranceRegestrationPage().enterRegisterDetails(hmap.get(0));
//	}

}
