package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CLTApplicaionOwnerInformationGIFT {
	
	private static WebElement Element = null;
	
	public static WebElement WouldYouLikeToSearchForAnExistingClient(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_5960_1_10\"]/table/tbody/tr[2]/td[1]/input"));
	}
	
	public static WebElement FirstName(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_5977_1_7\"]/input"));
	}
	
	public static WebElement LastName(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_5979_1_7\"]/input"));
	}
	
	public static WebElement Gender(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_5981_1_2\"]/table/tbody/tr[2]/td[1]/input"));
	}

	public static WebElement TaxID123(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_5984_1_12\"]/input[1]"));
	}
	
	public static WebElement TAXID45(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_5984_1_12\"]/input[2]"));
	}
	
	public static WebElement TAXID6789(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_5984_1_12\"]/input[3]"));
	}
	
	public static WebElement SSNCertified(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_5985_1_10\"]/table/tbody/tr[1]/td[1]/input"));
	}
	
	public static WebElement DOBCertified(WebDriver driver){
		
		return Element = driver.findElement(By.name("10:5989~1:null:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Owner' and AppDetails/Sequence='1']/CRMDetails/DOBCertifiedInd"));
	}
	
	public static WebElement SSNCertifiedDate(WebDriver driver){
		
		return Element = driver.findElement(By.name("FormattedDate1:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Owner' and AppDetails/Sequence='1']/CRMDetails/SSNCertifiedDate"));
	}
	
	public static WebElement DOBCertifiedDate(WebDriver driver){
		
		return Element = driver.findElement(By.name("FormattedDate1:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Owner' and AppDetails/Sequence='1']/CRMDetails/DOBCertifiedDate"));
	}
	
	public static WebElement DOBMM(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_5988_1_11\"]/input[2]"));
	}
	
	public static WebElement DOBDD(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_5988_1_11\"]/input[3]"));
	}
	
	public static WebElement DOBYYYY(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_5988_1_11\"]/input[4]"));
	}
	
	public static WebElement StreetAddressLine1(WebDriver driver){
		
		return Element = driver.findElement(By.name("18:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Owner' and AppDetails/Sequence='1']/CRMDetails/Address/Address1"));
	}

	public static WebElement StreetAddressCity(WebDriver driver){
		
		return Element = driver.findElement(By.name("18:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Owner' and AppDetails/Sequence='1']/CRMDetails/Address/City"));
	}
	
	public static WebElement StreetAddressState(WebDriver driver){
		
		return Element = driver.findElement(By.name("18:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Owner' and AppDetails/Sequence='1']/CRMDetails/Address/State"));
	}
	
	public static WebElement StreetAddressPostalCode(WebDriver driver){
		
		return Element = driver.findElement(By.name("ZIP1:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Owner' and AppDetails/Sequence='1']/CRMDetails/Address/PostalCode"));
	}
	
	public static WebElement HomePhone123(WebDriver driver){
		
		return Element = driver.findElement(By.name("PHONE1:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Owner' and AppDetails/Sequence='1']/CRMDetails/HomePhone"));
	}
	
	public static WebElement HomePhone456(WebDriver driver){
		
		return Element = driver.findElement(By.name("PHONE2:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Owner' and AppDetails/Sequence='1']/CRMDetails/HomePhone"));
	}
	
	public static WebElement HomePhone7890(WebDriver driver){
		
		return Element = driver.findElement(By.name("PHONE3:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Owner' and AppDetails/Sequence='1']/CRMDetails/HomePhone"));
	}
	
	public static WebElement MobilePhone123(WebDriver driver){
		
		return Element = driver.findElement(By.name("PHONE1:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Owner' and AppDetails/Sequence='1']/CRMDetails/CellPhone"));
	}
	
	public static WebElement MobilePhone456(WebDriver driver){
		
		return Element = driver.findElement(By.name("PHONE2:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Owner' and AppDetails/Sequence='1']/CRMDetails/CellPhone"));
	}
	
	public static WebElement MobilePhone7890(WebDriver driver){
		
		return Element = driver.findElement(By.name("PHONE3:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Owner' and AppDetails/Sequence='1']/CRMDetails/CellPhone"));
	}
	
	public static WebElement MobilePhoneDigitalConsent(WebDriver driver){
		
		return Element = driver.findElement(By.name("10:6000~1:null:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Owner' and AppDetails/Sequence='1']/CRMDetails/PhoneDigitalConsentMobile"));
	}
	
	public static WebElement EmailAddress(WebDriver driver){
		
		return Element = driver.findElement(By.name("30:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Owner' and AppDetails/Sequence='1']/CRMDetails/EmailAddress"));
	}
	
	
	public static WebElement EmailDigitalConsent(WebDriver driver){
		
		return Element = driver.findElement(By.name("10:6003~1:null:/XML/Client[AppDetails/Search/AllClientsInd='Yes' and Relation/@code ='Owner' and AppDetails/Sequence='1']/CRMDetails/EmailDigitalConsent"));
	}
	
	public static WebElement Next(WebDriver driver){
		
		return Element = driver.findElement(By.linkText("Next"));
	}
	
	
	public static WebElement Doyouhaveanyexistinglifeinsurancepoliciesorannuitycontracts(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6037_-1_10\"]/table/tbody/tr[2]/td[1]/input"));
	}
	
	public static WebElement Willthisannuityreplaceorchangeanyexistingindividuallifeinsurancepoliciesorannuitycontracts(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6038_-1_10\"]/table/tbody/tr[2]/td[1]/input"));
	}
	
	public static WebElement WouldyouliketoaddbeneficiaryinformationYes(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6042_-1_10\"]/table/tbody/tr[1]/td[1]/input"));
	}

	public static WebElement WouldyouliketoaddbeneficiaryinformationNo(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6042_-1_10\"]/table/tbody/tr[2]/td[1]/input"));
	}
	
	public static WebElement WouldyouliketoaddaContingentBeneficiaryYes(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6043_-1_10\"]/table/tbody/tr[1]/td[1]/input"));
	}
	
	public static WebElement WouldyouliketoaddaContingentBeneficiaryNo(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6043_-1_10\"]/table/tbody/tr[2]/td[1]/input"));
	}
	
	public static WebElement WouldyouliketoaddanInterestedParty(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6045_-1_10\"]/table/tbody/tr[2]/td[1]/input"));
	}
}