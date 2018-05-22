package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationAndAccessControl {
	
	private static WebElement Element = null;
	
	public static WebElement Username(WebDriver driver){
		
		return Element = driver.findElement(By.cssSelector("#username_entry"));
	}
	
	public static WebElement Password(WebDriver driver){
		
		return Element = driver.findElement(By.cssSelector("#password_entry"));
	}
	
	public static WebElement Signin(WebDriver driver){
		
		return Element = driver.findElement(By.cssSelector("#Submit"));
	}

}
