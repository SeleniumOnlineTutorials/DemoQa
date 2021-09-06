package InsurancecPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InsuranceHomePage {

	
	public InsuranceHomePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH, using="//a[text()='Register']")
	WebElement registerButton;
	
	
	public void clickOnRegisterButton(){
		registerButton.click();
	}
	
	
}
