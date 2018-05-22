package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplicationDefingQuestionnaire {
	
	private static WebElement Element = null;
	
	public static WebElement ProductType(WebDriver driver){
		
		return Element = driver.findElement(By.cssSelector("#qvalue_17794_-1_5"));
	}
	
	public static WebElement IssuingCarrier(WebDriver driver){
		
		return Element = driver.findElement(By.cssSelector("#qvalue_17795_-1_5"));
	}
	
	public static WebElement ProductbyCarrier(WebDriver driver){
		
		return Element = driver.findElement(By.cssSelector("#qvalue_17796_-1_5"));
	}
	
	public static WebElement ApplicationState(WebDriver driver){
		
		return Element = driver.findElement(By.cssSelector("#qvalue_17798_-1_5"));
	}
	
	public static WebElement ApplicationReceivedDateMM(WebDriver driver){
		
		return Element = driver.findElement(By.name("FormattedDate1:/XML/ApplicationDetail/AppDate"));
	}
	
	public static WebElement ApplicationReceivedDateDD(WebDriver driver){
		
		return Element = driver.findElement(By.name("FormattedDate2:/XML/ApplicationDetail/AppDate"));
	}
	
	public static WebElement ApplicationReceivedDateYYYY(WebDriver driver){
		
		return Element = driver.findElement(By.name("FormattedDate3:/XML/ApplicationDetail/AppDate"));
	}
	
	public static WebElement ApplicationSignedDateMM(WebDriver driver){
		
		return Element = driver.findElement(By.name("FormattedDate1:/XML/ApplicationDetail/SignatureDate"));
	}
	
	public static WebElement ApplicationSignedDateDD(WebDriver driver){
		
		return Element = driver.findElement(By.name("FormattedDate2:/XML/ApplicationDetail/SignatureDate"));
	}
	
	public static WebElement ApplicationSignedDateYYYY(WebDriver driver){
		
		return Element = driver.findElement(By.name("FormattedDate3:/XML/ApplicationDetail/SignatureDate"));
	}
	
	public static WebElement MarketCode(WebDriver driver){
		
		return Element = driver.findElement(By.cssSelector("#qvalue_17817_-1_5"));
	}
	
	public static WebElement Next(WebDriver driver){
		
		return Element = driver.findElement(By.linkText("Next"));
	}
	
	public static WebElement DistributionChannel(WebDriver driver){
		
		return Element = driver.findElement(By.cssSelector("#qvalue_17818_-1_5"));
	}

}
