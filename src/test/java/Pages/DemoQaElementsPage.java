package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DemoQaElementsPage {
WebDriver driver;
	
	public DemoQaElementsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By textBox=By.xpath("//ul[@class='menu-list']/li[1]");
	private By fullName=By.xpath("//input[@id='userName']");
	private By email=By.xpath("//input[@id='userEmail']");
	private By currentAddress=By.xpath("//textarea[@id='currentAddress']");
	private By permenantAdress=By.xpath("//textarea[@id='permanentAddress']");
	private By submitButton=By.xpath("//button[@id='submit']");
	
	
	public void clickOnTextBox() {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(textBox)).click().build().perform();
	}
	public void enterFullName(String fullname) {
		driver.findElement(fullName).sendKeys(fullname);
	}
	public void enterEmail(String emailId) {
		driver.findElement(email).sendKeys(emailId);
		
	}
	public void enterCurrentAddress(String cAddress) {
		driver.findElement(currentAddress).sendKeys(cAddress);
	}
	
	public void enterPermenantAddress(String pAddress) {
		driver.findElement(permenantAdress).sendKeys(pAddress);
	}
	
	public void clickOnSubmitButton() {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(submitButton));
		driver.findElement(submitButton).click();
	}
	


}
