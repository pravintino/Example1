package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplicationPremiumInformation {
	
	private static WebElement Element = null;
	
	public static WebElement WillcontractbefundedthroughEFT(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_3257_-1_10\"]/table/tbody/tr/td[1]/input"));
	}
	
	public static WebElement EFTInOptions(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qvalue_3258_-1_5\"]"));
	}
	
	public static WebElement LumpSumEFTInDraftAmount(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_3259_-1_7\"]/input"));
	}
	
	public static WebElement LumpSumEFTInDraftDateMM(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_3260_-1_11\"]/input[2]"));
	}
	
	public static WebElement LumpSumEFTInDraftDateDD(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_3260_-1_11\"]/input[3]"));
	}
	
	public static WebElement LumpSumEFTInDraftDateYYYY(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_3260_-1_11\"]/input[4]"));
	}
	
	public static WebElement IncomeStartDateDD(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_3263_-1_11\"]/input[2]"));
	}
	
	public static WebElement IncomeStartDateMM(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_3263_-1_11\"]/input[3]"));
	}
	
	public static WebElement IncomeStartDateYYYY(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_3263_-1_11\"]/input[4]"));
	}
	
	public static WebElement BankName(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_3289_1_7\"]/input"));
	}
	
	public static WebElement Bank(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_3291_1_4\"]/table/tbody/tr[1]/td[1]/input"));
	}
	
	public static WebElement TypeofAccount(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qvalue_3294_1_5\"]"));
	}

	
	public static WebElement AccountNumber(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_3295_1_7\"]/input"));
	}
	
	public static WebElement NameonBankAccount(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_3296_1_7\"]/input"));
	}
	
	public static WebElement ABANumber(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_3290_1_7\"]/input"));
	}
	
	public static WebElement Next(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"next\"]/a"));
	}
}