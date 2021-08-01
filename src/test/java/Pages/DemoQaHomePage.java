package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQaHomePage {
	public WebDriver driver;
	public JavascriptExecutor js=null;
	public DemoQaHomePage(WebDriver driver) {
		this.driver=driver;
		js= (JavascriptExecutor) driver;
	}
	
	private By elements = (By.xpath("//h5[text()='Elements']"));
	private By forms =By.xpath("//h5[text()='Forms']");
	
	public void clickOnElements() {
		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(elements));
		driver.findElement(elements).click();
	}
	
	public void clickOnForms(){
		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(forms));
		driver.findElement(forms).click();
	}
	
	


}
