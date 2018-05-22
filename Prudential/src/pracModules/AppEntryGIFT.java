package pracModules;


import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.LifeInsuranceAndAnnuityPlatformSignIn;
import utility.ExcelUtils;
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
	        	
	        	
		    String exePath = "C:\\Users\\pravin.xavier.nadar\\Desktop\\Selenium\\Project\\Project\\Drivers\\2\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);	
			
//			Map capabilitiesMap = new HashMap();
//			capabilitiesMap.put("takesScreenShot", true);
//			capabilitiesMap.put("handlesAlert", true);
//			capabilitiesMap.put("cssSelectorsEnabled", true);
//			capabilitiesMap.put("javascriptEnabled", true);
//			capabilitiesMap.put("acceptSSLCerts", true);
//			capabilitiesMap.put("acceptSSLCerts", true);
//			DesiredCapabilities capabilities	= new DesiredCapabilities(capabilitiesMap);
//			
//			
//		    driver = new ChromeDriver(capabilities);
			
			
			
			
//			
//			
//			ChromeOptions o = new ChromeOptions();
//			o.addArguments("disable-extensions");
//			o.addArguments("--start-maximized");
			 driver = new ChromeDriver();
			 
		      	utility.ExcelUtils.setExcelFile("C:\\Users\\pravin.xavier.nadar\\eclipse-workspace\\Prudential\\DOCS\\App Entry.xlsm", "AuthenticationAndAccessControl");
				
		      	driver.get(utility.ExcelUtils.getCellData(15, 8));
			
			 try{			
			     
			        File file = new File("./Cookies.data");							
			        FileReader fileReader = new FileReader(file);							
			        BufferedReader Buffreader = new BufferedReader(fileReader);							
			        String strline;			
			        while((strline=Buffreader.readLine())!=null){									
			        StringTokenizer token = new StringTokenizer(strline,";");									
			        while(token.hasMoreTokens()){					
			        String name = token.nextToken();					
			        String value = token.nextToken();					
			        String domain = token.nextToken();					
			        String path = token.nextToken();					
			        Date expiry = null;					
			        		
			        String val;			
			        if(!(val=token.nextToken()).equals("null"))
					{		
			        	expiry = new Date(val);					
			        }		
			        Boolean isSecure = new Boolean(token.nextToken()).								
			        booleanValue();		
			        Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);			
			        System.out.println(ck);
			        driver.manage().addCookie(ck); // This will add the stored cookie to your current session					
			        }		
			        }		
			        }catch(Exception ex){					
			        ex.printStackTrace();			
			        }		
			       			
			
//			driver = new ChromeDriver(0);
		    
		   
//		    log = LogManager.getLogger(AppEntryGIFT.class.getName()).setLevel(logging.INFO);
		    
//		    log.info("Browser opened");
		    
		    wait = new WebDriverWait(driver, 30);
		    
			driver.manage().window().maximize();
			
//			log.info("Browser maximized");
			 
			 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
			 }
	        
//	        @Test(dependsOnMethods={"LifeInsuranceAndAnnuityPlatform"})
//	        public void CokieeClass() throws Exception {
//	        	
//	        	File file = new File("./Cookies.data");	
//	        	
//	        	try		
//	            {	  
//	                // Delete old file if exists
//	    			file.delete();		
//	                file.createNewFile();			
//	                FileWriter fileWrite = new FileWriter(file);							
//	                BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
//	                // loop for getting the cookie information 		
//	                	
//	                // loop for getting the cookie information 		
//	                for(Cookie ck : driver.manage().getCookies())							
//	                {			
//	                    Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
//	                    Bwrite.newLine();             
//	                }			
//	                Bwrite.close();			
//	                fileWrite.close();	
//	                
//	            }
//	            catch(Exception ex)					
//	            {		
//	                ex.printStackTrace();			
//	            }		
//	        }		
//	 
//	        	
	        
	     
	        @AfterSuite
	        public void beforeMethod5() throws Exception {
	        	driver.quit();
	        }
	        
	        //AuthenticationAndAccessControl - Proxy Login Page
	        @Parameters({"InputFIlePath"})
	        @Test(enabled = false)
		    public void AuthenticationAndAccessControl(String InputFIlePath) throws Exception {
	        	
	        	
	      	utility.ExcelUtils.setExcelFile(InputFIlePath, "AuthenticationAndAccessControl");
		
	      	driver.get(utility.ExcelUtils.getCellData(15, 8));
	      	
	      	
			
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
	        @Parameters({"InputFIlePath"})
	        @Test(dependsOnMethods={"AuthenticationAndAccessControl"}, enabled = false)
	        public void LifeInsuranceAndAnnuityPlatform(String InputFIlePath) throws Exception {
			utility.ExcelUtils.setExcelFile(InputFIlePath, "LifeInsuranceAndAnnuityPlatform");
//			wait.until(ExpectedConditions.elementToBeClickable(pageObjects.LifeInsuranceAndAnnuityPlatformSignIn.Enter(driver)));
			pageObjects.LifeInsuranceAndAnnuityPlatformSignIn.UserID(driver).sendKeys(utility.ExcelUtils.getCellData(14, 6));
			pageObjects.LifeInsuranceAndAnnuityPlatformSignIn.Password(driver).sendKeys(utility.ExcelUtils.getCellData(14, 7));
			
			utility.Screenshots.Takescreenshot(driver, "LifeInsuranceAndAnnuityPlatform");
			pageObjects.LifeInsuranceAndAnnuityPlatformSignIn.Enter(driver).click();
	        }
	        
	        
	        //AccountWelcome - ALIP HOME PAGE
	        
//	        (dependsOnMethods={"LifeInsuranceAndAnnuityPlatform"})
	        @Parameters({"InputFIlePath"})
	        @Test
	        public void AccountWelcome(String InputFIlePath) throws Exception {
//	        wait.until(ExpectedConditions.elementToBeClickable(pageObjects.AccountWelcome.Applications(driver)));
			Actions action = new Actions(driver);
			
		
			
		
			action.moveToElement(pageObjects.AccountWelcome.Applications(driver)).perform();
			action.moveToElement(pageObjects.AccountWelcome.NewApplication(driver));
			action.click();
			action.perform();
	}
	        @Parameters({"InputFIlePath"})
	        @Test (dependsOnMethods={"AccountWelcome"})
	        public void ApplicationDefingQuestionnaire(String InputFIlePath) throws Exception {
	        utility.ExcelUtils.setExcelFile(InputFIlePath, "ApplicationDefingQuestionnaire");
	        

        
	        
        	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
	        
        	AppID = pageObjects.DeferredAnnuityAppSummary.AppID(driver).getAttribute("textContent");
	        
            wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationDefingQuestionnaire.Next(driver)));

	        
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
	        @Parameters({"InputFIlePath"})
	        @Test (dependsOnMethods={"ApplicationDefingQuestionnaire"})
	        public void CLTApplicaionOwnerInformationGIFT(String InputFIlePath) throws Exception{
	        	
	        	
	        	utility.ExcelUtils.setExcelFile(InputFIlePath, "CLTApplicaionOwnerInformationNe");
	        	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));


	        	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.CLTApplicaionOwnerInformationGIFT.WouldYouLikeToSearchForAnExistingClient(driver)));
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
	        	
	        	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
	    
	        	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.CLTApplicaionOwnerInformationGIFT.Doyouhaveanyexistinglifeinsurancepoliciesorannuitycontracts(driver)));
	        			
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.Doyouhaveanyexistinglifeinsurancepoliciesorannuitycontracts(driver).click();
	        	pageObjects.CLTApplicaionOwnerInformationGIFT.Willthisannuityreplaceorchangeanyexistingindividuallifeinsurancepoliciesorannuitycontracts(driver).click();
	        	
	        	String PriBenePresent = utility.ExcelUtils.getCellData(14, 27);
	        	if (PriBenePresent.equalsIgnoreCase("yes"))
    			{
    	    	pageObjects.CLTApplicaionOwnerInformationGIFT.WouldyouliketoaddbeneficiaryinformationYes(driver).click();
    	    	
    	    	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.CLTApplicaionOwnerInformationGIFT.WouldyouliketoaddaContingentBeneficiaryNo(driver)));
    			
                }
            	else
    	       {
    	    	pageObjects.CLTApplicaionOwnerInformationGIFT.WouldyouliketoaddbeneficiaryinformationNo(driver).click();
	        	Thread.sleep(7000);
            	}
    	
//	        	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.CLTApplicaionOwnerInformationGIFT.Wouldyouliketoaddbeneficiaryinformation(driver)));

	        	pageObjects.CLTApplicaionOwnerInformationGIFT.WouldyouliketoaddanInterestedParty(driver).click();
	        	driver.switchTo().defaultContent();
	        	driver.switchTo().frame(0);
	        	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.CLTApplicaionOwnerInformationGIFT.Next(driver)));

				utility.Screenshots.Takescreenshot(driver, "CLTApplicaionOwnerInformationGIFT3");

	        	pageObjects.CLTApplicaionOwnerInformationGIFT.Next(driver).click();
            }
	           
	        @Parameters({"InputFIlePath"})
	        @Test (dependsOnMethods={"CLTApplicaionOwnerInformationGIFT"})
	        public void ApplicationPrimarybeneficiaryInformation(String InputFIlePath) throws Exception  {
	     

	        	String PriBenePresent = utility.ExcelUtils.getCellData(14, 27);
	        	System.out.println("Total bene "+PriBenePresent);

	        	if (PriBenePresent.equalsIgnoreCase("yes"))
	        			{
	        		
	        		utility.ExcelUtils.setExcelFile(InputFIlePath, "ApplicationPrimarybeneficiary");
	        		int PriBeneCount = Integer.valueOf(utility.ExcelUtils.getCellData(5, 0));
	        	
		        	for(int i=0,j=1,k=0; i<PriBeneCount; i++,j++,k++)
		        		{
		        		
			        	utility.ExcelUtils.setExcelFile(InputFIlePath, "ApplicationPrimarybeneficiary");
			        	
			        		
			        	
			        	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));


			        	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationPrimarybeneficiaryInformation.AddaPrimaryBeneficiary(driver)));
			        	pageObjects.ApplicationPrimarybeneficiaryInformation.AddaPrimaryBeneficiary(driver).click();
			        	
			        	Thread.sleep(5000);
			      
			        	
			        	
			        	System.out.println("Total Pri Bene is "+PriBeneCount);
		        		switch(ExcelUtils.getCellData(15+(9*k),1))
		        		{
		        		
		        		case "Individual":
		        			
		        			Thread.sleep(4000);
				        	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationPrimarybeneficiaryInformation.Clienttype_Individual(driver, j)));

		        			pageObjects.ApplicationPrimarybeneficiaryInformation.Clienttype_Individual(driver, j).click();
		        			Thread.sleep(5000);
		        			
		        			
		        			driver.switchTo().defaultContent();
				        	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		        			
				        	
		        			pageObjects.ApplicationPrimarybeneficiaryInformation.Next(driver).click();
		        			
		        			modules.AppEntryGIFTPriBeneInd.AddPriBeneInd(driver, j, k);
		        			break;
		        			
		        			
                        case "Company":
                        	
		        			Thread.sleep(4000);
		        			
		        			wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationPrimarybeneficiaryInformation.Clienttype_Company(driver, j)));
                        	pageObjects.ApplicationPrimarybeneficiaryInformation.Clienttype_Company(driver, j).click();
		        			Thread.sleep(5000);
		        			
		        			
		        			driver.switchTo().defaultContent();
				        	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
				        	
				        	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationPrimarybeneficiaryInformation.Next(driver)));
		        			pageObjects.ApplicationPrimarybeneficiaryInformation.Next(driver).click();

		        			
		        			modules.AppEntryGIFTPriBeneComp.AddPriBeneComp(driver, j, k);
		        			break;
		        			
                        case "Trust":
                        	
		        			Thread.sleep(4000);
		        			wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationPrimarybeneficiaryInformation.Clienttype_Trust(driver, j)));
                        	pageObjects.ApplicationPrimarybeneficiaryInformation.Clienttype_Trust(driver, j).click();
		        			Thread.sleep(5000);
		        			
		        			
		        			driver.switchTo().defaultContent();
				        	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
				        	
		        			pageObjects.ApplicationPrimarybeneficiaryInformation.Next(driver).click();
		        			System.out.println("994");
		        			
		        			
		        			modules.AppEntryGIFTPriBeneTrust.AddPriBeneTrust(driver, j, k);
		        			break;
		        			
                        case "Clause":
		        			
		        			modules.AppEntryGIFTPriBeneInd.AddPriBeneInd(driver, j, k);
		        			break;
		        			
		        			default:
		        				System.out.println("Error while finding client type in adding pri Bene");
		        				
		        		}
		        
		        		
		        	}
		        	
	        			}
		        	
	        	Thread.sleep(4000);

        			wait.until(ExpectedConditions.elementToBeClickable(pageObjects.ApplicationPrimarybeneficiaryInformation.Next(driver)));
		        	pageObjects.ApplicationPrimarybeneficiaryInformation.Next(driver).click();
	        
	        			

	        			
	        			
	        			
	        			
	        			
	        	
	        }
	        	
	        	
//	        
//	        
//	        
//	        ------------------------------------------------------
	        @Parameters({"InputFIlePath"})
	        @Test (dependsOnMethods={"ApplicationPrimarybeneficiaryInformation"})
	        public void ApplicationPremiumInformation(String InputFIlePath) throws Exception{
	        	
	        	utility.ExcelUtils.setExcelFile(InputFIlePath, "ApplicationPremiumInformation");
        	   	Thread.sleep(6000);
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
	        	

	        	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
            	
	        	driver.switchTo().defaultContent();
	        	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
            	
            	
            	utility.Screenshots.Takescreenshot(driver, "NewBusinessApplicationSummary");
            	wait.until(ExpectedConditions.elementToBeClickable(pageObjects.DeferredAnnuityAppSummary.Submit(driver)));
	        	pageObjects.DeferredAnnuityAppSummary.Submit(driver).click();
	        	
	        	System.out.println("Application Submitted successfully. Your App ID is  "+AppID);
	        	utility.ExcelUtils.setCellData(OutputPath,"Results", 10, 7, AppID);
	        	
	        	Thread.sleep(10000);
	        	
	        	
	        }
	        	
	       
	        
	        
	        
}