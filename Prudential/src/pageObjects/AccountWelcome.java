package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountWelcome {
	
	
	private static  WebElement Element = null;
	

	
	public  static WebElement Applications(WebDriver driver){
		 Element = driver.findElement(By.cssSelector("#a_applications"));
		 
			
		return  Element;
	}
	
	public  static WebElement NewApplication(WebDriver driver){
		
		 Element = driver.findElement(By.cssSelector("#a_new_application"));
		 
		
		return  Element;
	}

}