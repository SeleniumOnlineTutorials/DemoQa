package StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.cucmber.Driver.DriverCreation;

import Pages.DemoQaElementsPage;
import Pages.DemoQaHomePage;
import io.cucumber.java.en.Given;

public class DemoQaSteps {
	public WebDriver drivers=null;
	public DriverCreation broswer=null;
	public DemoQaHomePage hpage=null;
	public DemoQaElementsPage epage=null;
	@Given("User launches DemoQA application")
	public void user_launches_DemoQA_application() {
		broswer=new DriverCreation();
		drivers=broswer.driverInitialization();
	}

	@Given("User selects Elements in the home page")
	public void user_selects_Elements_in_the_home_page() {
		System.out.println("drivers------->"+ drivers);
		hpage=new DemoQaHomePage(drivers);
		hpage.clickOnElements();  
	}

	@Given("User clicks Text box option in Elements page")
	public void user_clicks_Text_box_option_in_Elements_page() {
		epage=new DemoQaElementsPage(drivers);
		epage.clickOnTextBox();
		
	}

	@Given("User enters Fullname as {string}")
	public void user_enters_Fullname_as(String fullname) {
		epage=new DemoQaElementsPage(drivers);
		epage.enterFullName(fullname);
	}

	@Given("User enters Email as {string}")
	public void user_enters_Email_as(String emailId) {
		epage=new DemoQaElementsPage(drivers);
		epage.enterEmail(emailId);
	}

	@Given("User enters Current Address as {string}")
	public void user_enters_Current_Address_as(String cAddress) {
		epage=new DemoQaElementsPage(drivers);
		epage.enterCurrentAddress(cAddress);
	}

	@Given("User enters Permenant Address as {string}")
	public void user_enters_Permenant_Address_as(String pAddress) {
		epage=new DemoQaElementsPage(drivers);
		epage.enterPermenantAddress(pAddress);
	}

	@Given("User clicks on Submit button")
	public void user_clicks_on_Submit_button() {
		epage=new DemoQaElementsPage(drivers);
		epage.clickOnSubmitButton();
	}
}
