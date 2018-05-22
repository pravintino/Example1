package modules;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class JMS {
	
	WebDriver  driver;
    WebDriverWait wait;
    String GUID;
    String NBSubmitText = "";
	ExtentReports report;
	ExtentTest logger;
    
    @BeforeTest
    public void openBrowser() {
    	String exePath = "C:\\Users\\pravin.xavier.nadar\\Desktop\\Selenium\\Project\\Project\\Drivers\\2\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);	
		
		driver = new ChromeDriver();
		
		 report=new ExtentReports("./Reports/report.html");

		
		 wait = new WebDriverWait(driver, 20);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();


    }
    @Parameters("XML")
    @BeforeTest
    public void setNBSubmitFile(String XML) {
    	
    	try
        {
    		
        File file = new File("./XMLs/"+XML+".txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = "";
        while((line = reader.readLine()) != null)
            {
      
        	NBSubmitText += line + "\r\n";
        }
        reader.close();
    }
    catch (IOException ioe)
        {
        ioe.printStackTrace();
    }
    }

    @Parameters("XML")
    @Test
    public void developmentTools(String XML)
    {
    	
		 logger=report.startTest("NB Submit");
		 logger.log(LogStatus.INFO, "Navigate to JMS Queue");
    	driver.get("https://alip-proxy.asw.accenture.com/pruat3/tools");
    	
    	pageObjects.AuthenticationAndAccessControl.Username(driver).sendKeys("jpmehta");
    	pageObjects.AuthenticationAndAccessControl.Password(driver).sendKeys("NewUser14");
    	
    	utility.Screenshots.Takescreenshot(driver, "JMS-AuthenticationAndAccessControl "+XML);
    	
    	
    	
    	pageObjects.AuthenticationAndAccessControl.Signin(driver).click();
    	
    	pageObjects.DevelopmentTools.JmsQueueTool(driver).click();
    	
    }
    @Parameters("XML")
    @Test
    public void jmsQueueTest(String XML) throws Exception
    
    {
    	 wait.until(ExpectedConditions.elementToBeClickable(pageObjects.JMSQueueTestPage.Send(driver)));
    	 
    	 Select slt = new Select(pageObjects.JMSQueueTestPage.QueueName(driver));
    	 slt.selectByValue("java:comp/env/jms/alipRequestQueue");
    	 
    	 Select slt1 = new Select(pageObjects.JMSQueueTestPage.SiteID(driver));
    	 slt1.selectByVisibleText("pruat3");
    	 
    	 Select slt2 = new Select(pageObjects.JMSQueueTestPage.IntegrationPoint(driver));
    	 slt2.selectByValue("NewBusinessInt");
    	 
    	 pageObjects.JMSQueueTestPage.Message(driver).sendKeys(NBSubmitText);
    	 
    	 pageObjects.JMSQueueTestPage.Send(driver).click();
    	 

    	 
    	 JavascriptExecutor js =  (JavascriptExecutor) driver;
    	 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    	 
    	 Thread.sleep(5000);
    	 
     	utility.Screenshots.Takescreenshot(driver, "jmsQueueTest "+XML);
     	
     	logger.log(LogStatus.PASS, "NB Submit successfully");
		 
		 report.endTest(logger);
		 report.flush();
    			 
    	 
    }
    
    @AfterTest
    public void closeBrowser() 
    
    {
    	driver.quit();
    }
    
    
}
