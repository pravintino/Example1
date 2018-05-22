package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CLTApplicaionOwnerInformationNewFIA {
	
	private static WebElement Element = null;
	
	public static WebElement WouldYouLikeToSearchForAnExistingClient(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//input[@type='radio']"));
	}

}