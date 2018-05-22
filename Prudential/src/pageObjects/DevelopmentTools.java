package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DevelopmentTools {
	
private static  WebElement Element = null;
	

	
	public  static WebElement JmsQueueTool(WebDriver driver){
		Element = driver.findElement(By.linkText("Jms Queue Tool"));		 
			
		return  Element;
	}

}
