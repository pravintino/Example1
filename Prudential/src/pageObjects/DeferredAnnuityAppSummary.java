package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeferredAnnuityAppSummary {
private static WebElement Element = null;
	
	public static WebElement AppID(WebDriver driver){
		
		return Element = driver.findElement(By.cssSelector("#instanceKey"));
	}
	
	public static WebElement Submit(WebDriver driver){
		
		return Element = driver.findElement(By.linkText("Submit"));
	}

}
