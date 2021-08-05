package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQaFormPage {
	
	public WebDriver driver;
	public WebDriverWait wait=null;
	public JavascriptExecutor js=null;
	public DemoQaFormPage(WebDriver driver){
		this.driver=driver;
		wait=new WebDriverWait(driver,30);
		js=(JavascriptExecutor)driver;
		
	}
	private By firstName=By.xpath("//input[@id='firstName']");
	private By lastName=By.xpath("//input[@id='lastName']");
	private By practiceForm=By.xpath("//span[text()='Practice Form']");
	private By formHeader=By.xpath("//h5[text()='Student Registration Form']");
	private By emailId=By.xpath("//input[@id='userEmail']");
	private By maleGender=By.xpath("//label[text()='Male']");
	private By femaleGender=By.xpath("//label[text()='Female']");
	private By otherGender=By.xpath("//label[text()='Other']");
	private By mobileNumber=By.xpath("//input[@id='userNumber']");
	private By subjectText=By.xpath("//input[@id='subjectsInput']");
	private By subjectDropDown=By.xpath("//div[@id='subjectsContainer']/div[2]");
	private By sportsScheckBox=By.xpath("//label[text()='Sports']");
	private By readingCheckBox=By.xpath("//label[text()='Reading']");
	private By musicCheckBox=By.xpath("//label[text()='Music']");
	
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
	
	public void selectGender(String gender){
		
		if(gender.equalsIgnoreCase("male")){
			driver.findElement(maleGender).click();
		}
		else if(gender.equalsIgnoreCase("female")){
			driver.findElement(femaleGender).click();
		}
		else
			driver.findElement(otherGender).click();
		
	}
	public void enterMobileNumber(String mobNum){
		driver.findElement(mobileNumber).sendKeys(mobNum);
	}
	
	public void selectSubject(String subject){
		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(sportsScheckBox));
		driver.findElement(subjectText).sendKeys(subject);
		
		driver.findElement(subjectDropDown).click();
	}
	
	public void selectHobbies(String hobby){
		
		if(hobby.equalsIgnoreCase("sports")){
			driver.findElement(sportsScheckBox).click();
			
		}
		else if(hobby.equalsIgnoreCase("music"))
			driver.findElement(musicCheckBox).click();
		else
			driver.findElement(readingCheckBox).click();
		
	}

}
