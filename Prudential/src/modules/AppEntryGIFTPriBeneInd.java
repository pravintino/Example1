package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppEntryGIFTPriBeneInd {
	

	  
	public static void AddPriBeneInd(WebDriver driver, int j, int k) throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
    	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
//    	Thread.sleep(6000);
    	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneInd_GenderMale(driver, j)));
    	
    	Thread.sleep(4000);
    	String BeneGender = utility.ExcelUtils.getCellData(15+(9*k), 2);

    	if (BeneGender.equalsIgnoreCase("Male"))
		{
        	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneInd_GenderMale(driver, j).click();
		
        }
    	else
       {
        	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneInd_GenderFemale(driver, j).click();
    	}
    	
    	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneInd_Firstname(driver, j).sendKeys(utility.ExcelUtils.getCellData(15+(9*k), 3));
    	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneInd_Lastname(driver, j).sendKeys(utility.ExcelUtils.getCellData(15+(9*k), 4));
    	pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneInd_Percentage(driver, j).sendKeys(utility.ExcelUtils.getCellData(15+(9*k), 26));
    	
    	Select select1 = new Select(pageObjects.ApplicationPrimarybeneficiaryInformation.primaryBeneInd_RelationshiptoOwner(driver, j));
    	select1.selectByVisibleText(utility.ExcelUtils.getCellData(15+(9*k), 25));
    	
    	driver.switchTo().defaultContent();
    	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
    	
    	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationPrimarybeneficiaryInformation.Next(driver)));
    	pageObjects.ApplicationPrimarybeneficiaryInformation.Next(driver).click();
    	
	}

}
