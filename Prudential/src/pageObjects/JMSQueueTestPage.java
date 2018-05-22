package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JMSQueueTestPage {
	
private static  WebElement Element = null;
	

	
	public  static WebElement QueueName(WebDriver driver){
		Element = driver.findElement(By.name("queueName"));		 
			
		return  Element;
	}
	
	public  static WebElement SiteID(WebDriver driver){
		Element = driver.findElement(By.name("siteId"));		 
			
		return  Element;
	}
	
	public  static WebElement IntegrationPoint(WebDriver driver){
		Element = driver.findElement(By.name("integrationPoint"));		 
			
		return  Element;
	}
	
	public  static WebElement Message(WebDriver driver){
		Element = driver.findElement(By.name("msg"));		 
			
		return  Element;
	}
	
	public  static WebElement Send(WebDriver driver){
		Element = driver.findElement(By.name("send"));		 
			
		return  Element;
	}

}