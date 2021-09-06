package InsuranceSteps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.cucmber.Driver.DriverCreation;

import InsurancecPages.InsuranceHomePage;
import InsurancecPages.InsuranceRegestrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegestierInsuranceSteps {
	public DriverCreation browser=null;
	public InsuranceHomePage ihpage=null;
	public InsuranceRegestrationPage irpage=null;
	public WebDriver drivers=null;
	@Given("User navigates to Insurance Page")
	public void user_navigates_to_Insurance_Page() {
		browser=new DriverCreation();
		drivers=browser.driverInitialization();
	}

	@Given("User Clicks on Register button")
	public void user_Clicks_on_Register_button() {
	   ihpage=new InsuranceHomePage(drivers);
	   ihpage.clickOnRegisterButton();
	}

	@Then("Verify User is on Regestration page")
	public void verify_User_is_on_Regestration_page() {
	    
	}

	@Then("User enters the required fields")
	public void user_enters_the_required_fields(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String,String>> hmap=dataTable.asMaps(String.class, String.class);
	    irpage=new InsuranceRegestrationPage(drivers);
		   irpage.enterRegisterDetails(hmap.get(0));
	}

}
