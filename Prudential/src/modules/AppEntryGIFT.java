package modules;


import org.testng.annotations.Test;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LifeInsuranceAndAnnuityPlatformSignIn;
import utility.Logging;

public class AppEntryGIFT {
	
	        WebDriver  driver;
	        WebDriverWait wait;
	        Logger log;
	        String AppID;
	        String InputPath = utility.Constant.AppEntryGIFTReadDoc;
	        String OutputPath = utility.Constant.AppEntryGIFTWriteDoc;
	        @BeforeSuite
	        public void beforeSuite() throws Exception {
	        	
	        	
		    String exePath = "C:\\Users\\pravin.xavier.nadar\\Desktop\\Selenium\\Project\\Project\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);	
			
			DesiredCapabilities DC = new DesiredCapabilities();
			DC.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			
		    driver = new ChromeDriver(DC);
		    
		   
//		    log = LogManager.getLogger(AppEntryGIFT.class.getName()).setLevel(logging.INFO);
		    
//		    log.info("Browser opened");
		    
		    wait = new WebDriverWait(driver, 20);
		    
			driver.manage().window().maximize();
			
//			log.info("Browser maximized");
			 
			 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
			 }
	        @AfterSuite
	        public void beforeMethod5() throws Exception {
	        	driver.quit();
	        }
	        
	        //AuthenticationAndAccessControl - Proxy Login Page
	        @Test
		    public void AuthenticationAndAccessControl() throws Exception {
	        	
	        	
	      	utility.ExcelUtils.setExcelFile(InputPath, "AuthenticationAndAccessControl");
		
	      	driver.get("https://alip-proxy.asw.accenture.com/pruat3/en/Login.jsp");
			Thread.sleep(5000);
// 			wait.until(ExpectedConditions.elementToBeClickable(pageObjects.AuthenticationAndAccessControl.Signin(driver)));
			
 			pageObjects.AuthenticationAndAccessControl.Username(driver).sendKeys(utility.ExcelUtils.getCellData(14, 7));
 			
// 			log.info("User Name entered on Authentication And AccessControl page:"+utility.ExcelUtils.getCellData(14, 6));
 			
			pageObjects.AuthenticationAndAccessControl.Password(driver).sendKeys(utility.ExcelUtils.getCellData(14, 8));
			
// 			log.info("Password entered on Authentication And AccessControl page:"+utility.ExcelUtils.getCellData(14, 7));
			
			utility.Screenshots.Takescreenshot(driver, "AuthenticationAndAccessControl");
			
//			log.info("Screenshot taken for the page: Authentication And AccessControl");
			
			pageObjects.AuthenticationAndAccessControl.Signin(driver).click();
			
//			log.info("Clicked the next on page: Authentication And AccessControl");
			
	        }
	        
	        
	        //LifeInsuranceAndAnnuityPlatform - ALIP LOGIN PAGE
	        @Test(dependsOnMethods={"AuthenticationAndAccessControl"})
	        public void LifeInsuranceAndAnnuityPlatform() throws Exception 
	        
	        {
	        	
			utility.ExcelUtils.setExcelFile(InputPath, "LifeInsuranceAndAnnuityPlatform");
//			wait.until(ExpectedConditions.elementToBeClickable(pageObjects.LifeInsuranceAndAnnuityPlatformSignIn.Enter(driver)));
			pageObjects.LifeInsuranceAndAnnuityPlatformSignIn.UserID(driver).sendKeys(utility.ExcelUtils.getCellData(14, 6));
			pageObjects.LifeInsuranceAndAnnuityPlatformSignIn.Password(driver).sendKeys(utility.ExcelUtils.getCellData(14, 7));
			
			utility.Screenshots.Takescreenshot(driver, "LifeInsuranceAndAnnuityPlatform");
			pageObjects.LifeInsuranceAndAnnuityPlatformSignIn.Enter(driver).click();
	        }
	        
	        
	        //AccountWelcome - ALIP HOME PAGE
	        @Test(dependsOnMethods={"LifeInsuranceAndAnnuityPlatform"})
	        public void AccountWelcome() throws Exception {
//	        wait.until(ExpectedConditions.elementToBeClickable(pageObjects.AccountWelcome.Applications(driver)));
			
	        	
	        	pageObjects.AccountWelcome AW = PageFactory.initElements(driver, pageObjects.AccountWelcome.class);
	        		
//	        	pageObjects.AccountWelcome AW = new pageObjects.AccountWelcome(driver);
	        	Actions action = new Actions(driver);
			
			
			WebElement Application = AW.Applications;
			WebElement NewApplication = AW.NewApplication(driver);
			action.moveToElement(Application).perform();
			action.moveToElement(NewApplication);
			action.click();
			action.perform();
	}
	        @Test (dependsOnMethods={"AccountWelcome"})
	        public void ApplicationDefingQuestionnaire() throws Exception {
	        utility.ExcelUtils.setExcelFile(InputPath, "ApplicationDefingQuestionnaire");
        	
	        driver.switchTo().frame(0);
	        
        	AppID = pageObjects.DeferredAnnuityAppSummary.AppID(driver).getAttribute("textContent");
//        	System.out.println("Application Submitted successfully. Your App ID is  "+AppID);
	        
//	        driver.switchTo().frame("containerIframe");

            wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationDefingQuestionnaire.Next(driver)));
//            System.out.println("App ID id  "+AppID);
	        
	        Select oSelect = new Select(pageObjects.ApplicationDefingQuestionnaire.ProductType(driver));
	        oSelect.selectByVisibleText(utility.ExcelUtils.getCellData(14, 6));
	       
	        Select oSelect1 = new Select(pageObjects.ApplicationDefingQuestionnaire.IssuingCarrier(driver));
	        oSelect1.selectByVisibleText(utility.ExcelUtils.getCellData(14, 7));
	        
	        Select oSelect2 = new Select(pageObjects.ApplicationDefingQuestionnaire.ProductbyCarrier(driver));
	        oSelect2.selectByVisibleText(utility.ExcelUtils.getCellData(14, 8));
	       
//	        wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationDefingQuestionnaire.ApplicationState(driver)));
	       
//	        Select oSelect3 = new Select(pageObjects.ApplicationDefingQuestionnaire.ApplicationState(driver));
//	        oSelect3.selectByVisibleText(utility.ExcelUtils.getCellData(14, 9));
	        
	        wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationDefingQuestionnaire.DistributionChannel(driver)));
	        
	        pageObjects.ApplicationDefingQuestionnaire.ApplicationReceivedDateMM(driver).clear();
	        pageObjects.ApplicationDefingQuestionnaire.ApplicationReceivedDateDD(driver).clear();
	        pageObjects.ApplicationDefingQuestionnaire.ApplicationReceivedDateYYYY(driver).clear();
	        
	        
	        pageObjects.ApplicationDefingQuestionnaire.ApplicationReceivedDateMM(driver).sendKeys(utility.ExcelUtils.getCellData(14, 10));
	        pageObjects.ApplicationDefingQuestionnaire.ApplicationReceivedDateDD(driver).sendKeys(utility.ExcelUtils.getCellData(14, 11));
	        pageObjects.ApplicationDefingQuestionnaire.ApplicationReceivedDateYYYY(driver).sendKeys(utility.ExcelUtils.getCellData(14, 12));
	        pageObjects.ApplicationDefingQuestionnaire.ApplicationSignedDateMM(driver).sendKeys(utility.ExcelUtils.getCellData(14, 13));
	        pageObjects.ApplicationDefingQuestionnaire.ApplicationSignedDateDD(driver).sendKeys(utility.ExcelUtils.getCellData(14, 14));
	        pageObjects.ApplicationDefingQuestionnaire.ApplicationSignedDateYYYY(driver).sendKeys(utility.ExcelUtils.getCellData(14, 15));
	        
	        Select oSelect4 = new Select(pageObjects.ApplicationDefingQuestionnaire.DistributionChannel(driver));
	        oSelect4.selectByVisibleText(utility.ExcelUtils.getCellData(14, 16));
	        
	        Thread.sleep(5000);
	        
			utility.Screenshots.Takescreenshot(driver, "ApplicationDefingQuestionnaire");
	        
	        pageObjects.ApplicationDefingQuestionnaire.Next(driver).click();
	        }
	        
	        @Test (dependsOnMethods={"ApplicationDefingQuestionnaire"})
	        public void CLTApplicaionOwnerInformationGIFT() throws Exception{
	        	
	        	
	        	utility.ExcelUtils.setExcelFile(InputPath, "CLTApplicaionOwnerInformationNe");
//	        	System.out.println("Out the frame");	
            	driver.switchTo().frame(0);
//            	System.out.println("Into the frame");
            	Thread.sleep(5000);
	       // 	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.CLTApplicaionOwnerInformationGIFT.Next(driver)));
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.WouldYouLikeToSearchForAnExistingClient(driver).click();
	        	
	        	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.CLTApplicaionOwnerInformationGIFT.FirstName(driver)));
	        	
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.FirstName(driver).sendKeys(utility.ExcelUtils.getCellData(14, 7));
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.LastName(driver).sendKeys(utility.ExcelUtils.getCellData(14, 8));
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.Gender(driver).click();
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.TaxID123(driver).sendKeys(utility.ExcelUtils.getCellData(14, 10));
	        	
	        	Random rnum = new Random();
	        	int TAXID45= 10 +rnum.nextInt(90);
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.TAXID45(driver).sendKeys(String.valueOf(TAXID45));
	        	
	        	int TAXID6789=1000 +rnum.nextInt(9000);
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.TAXID6789(driver).sendKeys(String.valueOf(TAXID6789));
	        	
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.FirstName(driver).click();
	        	
	        	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.CLTApplicaionOwnerInformationGIFT.SSNCertified(driver)));
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.SSNCertified(driver).click();
	        	
	        	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.CLTApplicaionOwnerInformationGIFT.SSNCertifiedDate(driver)));
	        	
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.DOBMM(driver).sendKeys(utility.ExcelUtils.getCellData(14, 13));
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.DOBDD(driver).sendKeys(utility.ExcelUtils.getCellData(14, 14));
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.DOBYYYY(driver).sendKeys(utility.ExcelUtils.getCellData(14, 15));
	        	
				utility.Screenshots.Takescreenshot(driver, "CLTApplicaionOwnerInformationGIFT1");
	        	
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.FirstName(driver).click();
	        
	        	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.CLTApplicaionOwnerInformationGIFT.DOBCertified(driver)));
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.DOBCertified(driver).click();
	        	
	        	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.CLTApplicaionOwnerInformationGIFT.DOBCertifiedDate(driver)));
	        	
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.StreetAddressLine1(driver).sendKeys((utility.ExcelUtils.getCellData(14, 16)));
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.StreetAddressCity(driver).sendKeys((utility.ExcelUtils.getCellData(14, 17)));
	        	
	        	
	        	Select oSelect5 = new Select(pageObjects.CLTApplicaionOwnerInformationGIFT.StreetAddressState(driver));
		        oSelect5.selectByVisibleText(utility.ExcelUtils.getCellData(14, 18));
		        
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.StreetAddressPostalCode(driver).sendKeys((utility.ExcelUtils.getCellData(14, 19)));
	        	
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.HomePhone123(driver).sendKeys(utility.ExcelUtils.getCellData(14, 20));
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.HomePhone456(driver).sendKeys(utility.ExcelUtils.getCellData(14, 21));
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.HomePhone7890(driver).sendKeys(utility.ExcelUtils.getCellData(14, 22));
	        	
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.MobilePhone123(driver).sendKeys(utility.ExcelUtils.getCellData(14, 23));
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.MobilePhone456(driver).sendKeys(utility.ExcelUtils.getCellData(14, 24));
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.MobilePhone7890(driver).sendKeys(utility.ExcelUtils.getCellData(14, 25));
	        	
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.FirstName(driver).click();
	        	
	        	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.CLTApplicaionOwnerInformationGIFT.MobilePhoneDigitalConsent(driver)));
	        	
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.EmailAddress(driver).sendKeys(utility.ExcelUtils.getCellData(14, 26));
	        	
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.FirstName(driver).click();
	        	
	        	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.CLTApplicaionOwnerInformationGIFT.EmailDigitalConsent(driver)));
	        	
	        	driver.switchTo().defaultContent();
	        	driver.switchTo().frame(0);
//	        	System.out.println("Total number of frame is"+driver.findElements(By.tagName("iframe")).size());
	        	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.CLTApplicaionOwnerInformationGIFT.Next(driver)));
	        	
				utility.Screenshots.Takescreenshot(driver, "CLTApplicaionOwnerInformationGIFT2");

	        	pageObjects.CLTApplicaionOwnerInformationGIFT.Next(driver).click();
	        	
	        	Thread.sleep(5000);
	    
	        	driver.switchTo().frame(0);

	        	pageObjects.CLTApplicaionOwnerInformationGIFT.Doyouhaveanyexistinglifeinsurancepoliciesorannuitycontracts(driver).click();
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.Willthisannuityreplaceorchangeanyexistingindividuallifeinsurancepoliciesorannuitycontracts(driver).click();
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.WouldyouliketoaddbeneficiaryinformationNo(driver).click();
//	        	System.out.println("In");
//	        	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.CLTApplicaionOwnerInformationGIFT.Wouldyouliketoaddbeneficiaryinformation(driver)));
	        	Thread.sleep(5000);
//	        	System.out.println("Out");
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.WouldyouliketoaddanInterestedParty(driver).click();
//	        	System.out.println("Interest");
	        	driver.switchTo().defaultContent();
	        	driver.switchTo().frame(0);
//	        	System.out.println("Total number of frame is"+driver.findElements(By.tagName("iframe")).size());
	        	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.CLTApplicaionOwnerInformationGIFT.Next(driver)));

				utility.Screenshots.Takescreenshot(driver, "CLTApplicaionOwnerInformationGIFT3");

	        	pageObjects.CLTApplicaionOwnerInformationGIFT.Next(driver).click();
            }
	        
	        @Test (dependsOnMethods={"CLTApplicaionOwnerInformationGIFT"})
	        public void ApplicationPremiumInformation() throws Exception{
	        	
	        	utility.ExcelUtils.setExcelFile(InputPath, "ApplicationPremiumInformation");
        	   	Thread.sleep(6000);
//	        	System.out.println("Total Frames: "+ driver.findElements(By.tagName("iframe")).size());
	        	
            	driver.switchTo().frame(0);
            	
            	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationPremiumInformation.WillcontractbefundedthroughEFT(driver)));
            	
            	pageObjects.ApplicationPremiumInformation.WillcontractbefundedthroughEFT(driver).click();
	        	
            	Select oSelect5 = new Select(pageObjects.ApplicationPremiumInformation.EFTInOptions(driver));
    	        oSelect5.selectByVisibleText(utility.ExcelUtils.getCellData(14, 6));
    	        
    	    
    	        
    	        wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationPremiumInformation.LumpSumEFTInDraftAmount(driver)));
         
    	        pageObjects.ApplicationPremiumInformation.LumpSumEFTInDraftAmount(driver).sendKeys(utility.ExcelUtils.getCellData(14, 7));
    	        
    	        pageObjects.ApplicationPremiumInformation.IncomeStartDateMM(driver).click();
    	        
    	       
    	        wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationPremiumInformation.LumpSumEFTInDraftDateMM(driver)));
    	        
    	        pageObjects.ApplicationPremiumInformation.LumpSumEFTInDraftDateMM(driver).sendKeys(utility.ExcelUtils.getCellData(14, 8));
    	        pageObjects.ApplicationPremiumInformation.LumpSumEFTInDraftDateDD(driver).sendKeys(utility.ExcelUtils.getCellData(14, 9));
    	        pageObjects.ApplicationPremiumInformation.LumpSumEFTInDraftDateYYYY(driver).sendKeys(utility.ExcelUtils.getCellData(14, 10));
    	        
    	        pageObjects.ApplicationPremiumInformation.IncomeStartDateMM(driver).sendKeys(utility.ExcelUtils.getCellData(14, 11));
    	        pageObjects.ApplicationPremiumInformation.IncomeStartDateDD(driver).sendKeys(utility.ExcelUtils.getCellData(14, 12));
    	        pageObjects.ApplicationPremiumInformation.IncomeStartDateYYYY(driver).sendKeys(utility.ExcelUtils.getCellData(14, 13));
	        	
    	        driver.switchTo().defaultContent();
	        	driver.switchTo().frame(0);
	        	
	        	utility.Screenshots.Takescreenshot(driver, "ApplicationPremiumInformation1");

	        	pageObjects.ApplicationPremiumInformation.Next(driver).click();
	        	
	        	Thread.sleep(5000);
	    
	        	driver.switchTo().frame(0);
	        	
	        	pageObjects.ApplicationPremiumInformation.BankName(driver).sendKeys(utility.ExcelUtils.getCellData(14, 14));
	        	pageObjects.ApplicationPremiumInformation.ABANumber(driver).click();
	        	
	        	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationPremiumInformation.Bank(driver)));
	        	pageObjects.ApplicationPremiumInformation.Bank(driver).click();
	        	
	        	Select oSelect6 = new Select(pageObjects.ApplicationPremiumInformation.TypeofAccount(driver));
    	        oSelect6.selectByVisibleText(utility.ExcelUtils.getCellData(14, 15));
    	        
    	        pageObjects.ApplicationPremiumInformation.AccountNumber(driver).sendKeys(utility.ExcelUtils.getCellData(14, 16));
    	        pageObjects.ApplicationPremiumInformation.NameonBankAccount(driver).sendKeys(utility.ExcelUtils.getCellData(14, 17));
    	        
    	        driver.switchTo().defaultContent();
	        	driver.switchTo().frame(0);
	        	
	        	utility.Screenshots.Takescreenshot(driver, "ApplicationPremiumInformation2");

	        	pageObjects.ApplicationPremiumInformation.Next(driver).click();
	        }
	        
	        @Test (dependsOnMethods={"ApplicationPremiumInformation"})
	        public void NewBusinessApplicationSummary() throws Exception{
	        	
	        	
                driver.switchTo().frame(0);
            	
            	Thread.sleep(8000);
//            	String AppID = pageObjects.DeferredAnnuityAppSummary.AppID(driver).getAttribute("text");
            
            	
            	 driver.switchTo().defaultContent();
 	        	driver.switchTo().frame(0);
            	
            	utility.Screenshots.Takescreenshot(driver, "NewBusinessApplicationSummary");

	        	pageObjects.DeferredAnnuityAppSummary.Submit(driver).click();
	        	
	        	System.out.println("Application Submitted successfully. Your App ID is  "+AppID);
	        	utility.ExcelUtils.setCellData(OutputPath,"Results", 10, 7, AppID);
	        	
	        	
	        }
	        	
	       
	        
	        
	        
}