package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQaFormPage {
	
	public WebDriver driver;
	
	public DemoQaFormPage(WebDriver driver){
		this.driver=driver;
	}
	
	private By practiceForm=By.xpath("//span[text()='Practice Form']");
	
	
	
	public void clickOnPracticeForm(){
		driver.findElement(practiceForm).click();
	}

}
