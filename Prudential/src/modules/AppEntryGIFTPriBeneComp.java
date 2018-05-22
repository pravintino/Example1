package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppEntryGIFTPriBeneComp {
	

	
	public static void AddPriBeneComp(WebDriver driver, int j, int k) throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
    	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
//		Thread.sleep(6000);
//    	driver.switchTo().frame(0);
    	
    	Thread.sleep(4000);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneComp_CompanyName(driver, j)));
    	
    	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneComp_CompanyName(driver, j).sendKeys(utility.ExcelUtils.getCellData(15+(9*k), 27));
    	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneComp_ContactName(driver, j).sendKeys(utility.ExcelUtils.getCellData(15+(9*k), 28));
    	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneComp_ContactPhoneNumber123(driver, j).sendKeys(utility.ExcelUtils.getCellData(15+(9*k), 29));
    	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneComp_ContactPhoneNumber456(driver, j).sendKeys(utility.ExcelUtils.getCellData(15+(9*k), 30));
    	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneComp_ContactPhoneNumber7890(driver, j).sendKeys(utility.ExcelUtils.getCellData(15+(9*k), 31));
    	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneComp_Percentage(driver, j).sendKeys(utility.ExcelUtils.getCellData(15+(9*k), 32));
    	
    	Select select1 = new Select(pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneComp_RelationshiptoOwner(driver, j));
    	select1.selectByVisibleText(utility.ExcelUtils.getCellData(15+(9*k), 33));
    	
    	driver.switchTo().defaultContent();
    	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
    	
    	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationPrimarybeneficiaryInformation.Next(driver)));
    	
    	
    	pageObjects.ApplicationPrimarybeneficiaryInformation.Next(driver).click();
    	
	}

}
