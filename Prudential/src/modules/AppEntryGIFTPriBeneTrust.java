package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppEntryGIFTPriBeneTrust {
	

	
	public static void AddPriBeneTrust(WebDriver driver, int j, int k) throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
    	
    	Thread.sleep(4000);
//    	String PriBeneCount = utility.ExcelUtils.getCellData(14, 6);
		wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneTrust_TrustName(driver, j)));
    	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneTrust_TrustName(driver, j).sendKeys(utility.ExcelUtils.getCellData(15+(9*k), 34));
    	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneTrust_TrustDateMM(driver, j).sendKeys(utility.ExcelUtils.getCellData(15+(9*k), 35));
    	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneTrust_TrustDateDD(driver, j).sendKeys(utility.ExcelUtils.getCellData(15+(9*k), 36));
    	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneTrust_TrustDateYYYY(driver, j).sendKeys(utility.ExcelUtils.getCellData(15+(9*k), 37));
    	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneTrust_ContactName(driver, j).sendKeys(utility.ExcelUtils.getCellData(15+(9*k), 38));
    	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneTrust_ContactPhoneNumber123(driver, j).sendKeys(utility.ExcelUtils.getCellData(15+(9*k), 39));
    	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneTrust_ContactPhoneNumber456(driver, j).sendKeys(utility.ExcelUtils.getCellData(15+(9*k), 40));
    	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneTrust_ContactPhoneNumber7890(driver, j).sendKeys(utility.ExcelUtils.getCellData(15+(9*k), 41));
    	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneTrust_Percentage(driver, j).sendKeys(utility.ExcelUtils.getCellData(15+(9*k), 42));
    	
    	Select select1 = new Select(pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneTrust_TrustType(driver, j));
    	select1.selectByVisibleText(utility.ExcelUtils.getCellData(15+(9*k), 44));
    	
    	driver.switchTo().defaultContent();
    	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
    	
    	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationPrimarybeneficiaryInformation.Next(driver)));
    	pageObjects.ApplicationPrimarybeneficiaryInformation.Next(driver).click();
    	
	}

}