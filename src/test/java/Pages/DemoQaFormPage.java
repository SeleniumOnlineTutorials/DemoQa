package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQaFormPage {
	
	public WebDriver driver;
	public WebDriverWait wait=null;
	public DemoQaFormPage(WebDriver driver){
		this.driver=driver;
		wait=new WebDriverWait(driver,30);
	}
	private By firstName=By.xpath("//input[@id='firstName']");
	private By lastName=By.xpath("//input[@id='lastName']");
	private By practiceForm=By.xpath("//span[text()='Practice Form']");
	private By formHeader=By.xpath("//h5[text()='Student Registration Form']");
	private By emailId=By.xpath("//input[@id='userEmail']");
	
	public void verifyFormHeaderDisplayed() throws Exception{
		String header=driver.findElement(formHeader).getText();
		if(header.equalsIgnoreCase("Student Registration Form")){
			System.out.println("Form header displayed");
		}
		else
			throw new Exception("Form is not loaded");
	}
		
	public void clickOnPracticeForm(){
		wait.until(ExpectedConditions.elementToBeClickable(practiceForm));
		driver.findElement(practiceForm).click();
	}
	
	public void enterName(String fname, String lname){
		driver.findElement(firstName).sendKeys(fname);
		driver.findElement(lastName).sendKeys(lname);
				
	}
	
	public void enterEmail(String email){
		driver.findElement(emailId).sendKeys(email);
	}
	

}
