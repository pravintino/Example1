package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LifeInsuranceAndAnnuityPlatformSignIn {

	private static WebElement Element = null;
	
	public static WebElement UserID(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//input[@name='j_username']"));
	}
	
	public static WebElement Password(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//input[@name='j_password']"));
	}
	
	public static WebElement Enter(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//input[@name='B12']"));
	}
}