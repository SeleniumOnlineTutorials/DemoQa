package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.cucmber.Driver.DriverCreation;

import Pages.DemoQaElementsPage;
import Pages.DemoQaFormPage;
import Pages.DemoQaHomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoQaSteps {
	public WebDriver drivers=null;
	public DriverCreation broswer=null;
	public DemoQaHomePage hpage=null;
	public DemoQaElementsPage epage=null;
	public DemoQaFormPage fpage=null;
	
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
	@Given("user Click on Form menu")
	public void user_Click_on_Form_menu() {
		hpage=new DemoQaHomePage(drivers);
		hpage.clickOnForms();
	   
	}
	@Then("Verify User is on Form page")
	public void verify_User_is_on_Form_page() {
		fpage=new DemoQaFormPage(drivers);
		
	}
	
	@Given("User Select {string} radio button")
	public void user_Select_radio_button(String gender) {
		fpage=new DemoQaFormPage(drivers);
		fpage.selectGender(gender);
	}
	@Given("user Enter the mobile number {string}")
	public void user_Enter_the_mobile_number(String mobNum) {
		fpage=new DemoQaFormPage(drivers);
		fpage.enterMobileNumber(mobNum);
	}

	@Given("User enter the subjects {string}")
	public void user_enter_the_subjects(String subject) {
		fpage=new DemoQaFormPage(drivers);
		fpage.selectSubject(subject);
	}

	@Given("User Slect Hobbies {string}")
	public void user_Slect_Hobbies(String hobby) {
		fpage=new DemoQaFormPage(drivers);
		fpage.selectHobbies(hobby);
	}

	
	@When("User Click on Practice Form under Forms")
	public void user_Click_on_Practice_Form_under_Forms() {
		fpage=new DemoQaFormPage(drivers);
		fpage.clickOnPracticeForm();
	}
	@Then("Verify Form is be displayed")
	public void verify_Form_is_be_displayed() throws Exception {
		fpage=new DemoQaFormPage(drivers);
		fpage.verifyFormHeaderDisplayed();
	}
	@Given("User enter name of the student")
	public void user_enter_name_of_the_student(DataTable dataTable) {

		//List<List<String>> li= dataTable.asLists();
		fpage=new DemoQaFormPage(drivers);
		String fname="",lname="";
		//fpage.enterName(li.get(1).get(0), li.get(1).get(1));
		
		List<Map<String, String>> li=dataTable.asMaps();
		fpage.enterName("selenium","tutorial");
		
		
	}

	@Given("User enter name")
	public void user_enter_name(DataTable dataTable) {
	    List<String> data=dataTable.asList();
		fpage=new DemoQaFormPage(drivers);
		fpage.enterName(data.get(0), data.get(1));
		
	}
	
	@Given("User enter EmailId")
	public void user_enter_EmailId(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<String> li=dataTable.asList();
	    fpage=new DemoQaFormPage(drivers);
	    fpage.enterEmail(li.get(0));
	    
	}

}
