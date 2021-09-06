package InsurancecPages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InsuranceRegestrationPage {
	Select sel=null;
	Actions act=null;
	JavascriptExecutor js=null;
	
	public InsuranceRegestrationPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		act=new Actions(driver);
		js=(JavascriptExecutor)driver;
		
	}
	
	
	@FindBy(how=How.ID, using="user_title")
	WebElement usertitle;
	
	@FindBy(how=How.ID, using="user_firstname")
	WebElement firstName;
	
	@FindBy(how=How.ID, using="user_surname")
	WebElement surName;
	
	@FindBy(how=How.ID, using="user_phone")
	WebElement phnNumber;
	
	@FindBy(how=How.NAME, using="year")
	WebElement year;
	
	@FindBy(how=How.NAME, using="month")
	WebElement month;
	
	@FindBy(how=How.NAME, using="date")
	WebElement date;
	
	@FindBy(how=How.XPATH, using="//input[@value='Full']")
	WebElement fullRadioButton;
	
	@FindBy(how=How.XPATH, using="//input[@value='Provisional']")
	WebElement provisionalRadioButton;
	
	@FindBy(how=How.ID, using="user_licenceperiod")
	WebElement licensePeriod;
	
	@FindBy(how=How.ID, using="user_occupation_id")
	WebElement occupation;
	
	@FindBy(how=How.ID, using="user_address_attributes_street")
	WebElement address;
	
	@FindBy(how=How.ID, using="user_address_attributes_city")
	WebElement city;
	
	@FindBy(how=How.ID, using="user_address_attributes_county")
	WebElement county;
	
	
	@FindBy(how=How.ID, using="user_address_attributes_postcode")
	WebElement postCode;
    
	@FindBy(how=How.ID, using="user_user_detail_attributes_email")
	WebElement email;
	
	@FindBy(how=How.ID, using="user_user_detail_attributes_password")
	WebElement password;
	
	@FindBy(how=How.ID, using="user_user_detail_attributes_password_confirmation")
	WebElement confirmPassword;
	
	@FindBy(how=How.ID, using="resetform")
	WebElement resetButton;
	
	@FindBy(how=How.XPATH, using="//input[@value='Create']")
	WebElement createButton;
	
	
	public void selectUserTilte(String title){
		sel =new Select(usertitle);
		sel.selectByVisibleText(title);
	}
	
	public void enterFirstName(String fname){
		firstName.sendKeys(fname);
	}
	public void enterSurName(String sname){
		surName.sendKeys(sname);
	}
	public  void enterPhoneNumber(String phnum){
		phnNumber.sendKeys(phnum);
	}
	public void selectDOB(String dob){
		
		String str[]= dob.split("-");
		
		sel=new Select(year);
		sel.selectByValue(str[0]);
		
		sel=new Select(month);
		sel.selectByValue(str[1]);
		
		sel=new Select(date);
		sel.selectByValue(str[2]);
		
	}
	
	public void selectFullProvisionalRadioButton(String fullProv){
		if(fullProv.equalsIgnoreCase("full"))
			fullRadioButton.click();
		else if(fullProv.equalsIgnoreCase("provisional"))
		provisionalRadioButton.click();
		
	}
	
	public void selectLicensePeriod(String lp){
		sel= new Select(licensePeriod);
		sel.selectByVisibleText(lp);
	}
	public void selectOccupation(String occup){
		js.executeScript("arguments[0].scrollIntoView()", occupation);
		sel=new Select(occupation);
		sel.selectByVisibleText(occup);
	}
	
	public void enterAddress(String addr){
		address.sendKeys(addr);
	}
	public void enterCity(String cityName){
		city.sendKeys(cityName);
	}
	public void enterPostalCode(String postalCode){
		postCode.sendKeys(postalCode);
	}
	
	public void enterCounty(String countyValue){
		county.sendKeys(countyValue);
	}
	public void enterEmail(String mailId){
		email.sendKeys(mailId);
	}
	public void enterPassword(String pwd){
		password.sendKeys(pwd);
	}
	public void enterConfirmPassword(String cpwd){
		confirmPassword.sendKeys(cpwd);
	}
	
	public void enterRegisterDetails(Map<String,String> details){
		System.out.println("------->"+details.get("usertitle"));
		selectUserTilte(details.get("usertitle"));
	    enterFirstName(details.get("fname"));
	    enterSurName(details.get("sname"));
	    enterPhoneNumber(details.get("phone"));
	    selectDOB(details.get("dateOfBirth"));
	    selectFullProvisionalRadioButton(details.get("full"));
	    selectLicensePeriod(details.get("licensePeriod"));
	    selectOccupation(details.get("occupation"));
	    enterAddress(details.get("address"));
	    enterCity(details.get("city"));
	    enterPostalCode(details.get("posatlCode"));
	    enterCounty(details.get("county"));
	    enterEmail(details.get("email"));
	    enterPassword(details.get("password"));
	    enterConfirmPassword(details.get("password"));
	}
	
	
}
