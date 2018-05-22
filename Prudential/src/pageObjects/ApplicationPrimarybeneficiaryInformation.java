package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplicationPrimarybeneficiaryInformation {
	
private static WebElement Element = null;
	
	public static WebElement AddaPrimaryBeneficiary(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"pageDiv\"]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/a"));
	}

	
	public static WebElement Clienttype_Individual(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6124_"+j+"_4\"]/table/tbody/tr[1]/td[1]/input"));
	}
	
	public static WebElement Clienttype_Company(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6124_"+j+"_4\"]/table/tbody/tr[2]/td[1]/input"));
	}
	
	public static WebElement Clienttype_Trust(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6124_"+j+"_4\"]/table/tbody/tr[3]/td[1]/input"));
	}
	
	public static WebElement Clienttype_Clause(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6124_1_4\"]/table/tbody/tr[4]/td[1]/input"));
	}
	
	public static WebElement Next(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"next\"]/a"));
	}
	
	public static WebElement primaryBeneInd_GenderMale(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6154_"+j+"_2\"]/table/tbody/tr[2]/td[1]/input"));
	}
	
	public static WebElement primaryBeneInd_GenderFemale(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6154_"+j+"_2\"]/table/tbody/tr[1]/td[1]/input"));
	}
	
	public static WebElement primaryBeneInd_Firstname(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6157_"+j+"_7\"]/input"));
	}
	
	public static WebElement primaryBeneInd_Lastname(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6159_"+j+"_7\"]/input"));
	}
	
	public static WebElement primaryBeneInd_TaxID123(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6162_1_12\"]/input[1]"));
	}
	
	public static WebElement primaryBeneInd_TaxID45(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6162_1_12\"]/input[2]"));
	}
	
	public static WebElement primaryBeneInd_TaxID6789(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6162_1_12\"]/input[3]"));
	}
	
	public static WebElement primaryBeneInd_DOBMM(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6166_1_11\"]/input[2]"));
	}
	
	public static WebElement primaryBeneInd_DOBDD(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6166_1_11\"]/input[3]"));
	}
	
	public static WebElement primaryBeneInd_DOBYYYY(WebDriver driver){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6162_1_12\"]/input[3]"));
	}
	
	public static WebElement primaryBeneInd_Percentage(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6170_"+j+"_7\"]/input"));
	}
	

	
	public static WebElement primaryBeneInd_RelationshiptoOwner(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qvalue_6178_"+j+"_5\"]"));
	}
	
	public static WebElement primaryBeneComp_RelationshiptoOwner(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qvalue_6150_"+j+"_5\"]"));
	}
	
	public static WebElement primaryBeneComp_CompanyName(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6138_"+j+"_7\"]/input"));
	}
	
	public static WebElement primaryBeneTrust_TrustName(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6184_"+j+"_8\"]/textarea"));
	}
	
	public static WebElement primaryBeneTrust_TrustType(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qvalue_6186_"+j+"_5\"]"));
	}
	
	public static WebElement primaryBeneTrust_TrustDateMM(WebDriver driver,int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6185_"+j+"_11\"]/input[2]"));
	}
	
	public static WebElement primaryBeneTrust_TrustDateDD(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6185_"+j+"_11\"]/input[3]"));
	}
	
	public static WebElement primaryBeneTrust_TrustDateYYYY(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6185_"+j+"_11\"]/input[4]"));
	}
	
	public static WebElement primaryBeneComp_Percentage(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6149_"+j+"_7\"]/input"));
	}
	
	public static WebElement primaryBeneTrust_Percentage(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6200_"+j+"_7\"]/input"));
	}
	
	public static WebElement primaryBeneComp_ContactName(WebDriver driver,int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6151_"+j+"_7\"]/input"));
	}
	
	public static WebElement primaryBeneTrust_ContactName(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6203_"+j+"_7\"]/input"));
	}
	
	public static WebElement primaryBeneComp_ContactPhoneNumber123(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6152_"+j+"_13\"]/table/tbody/tr/td/input[1]"));
	}
	
	public static WebElement primaryBeneTrust_ContactPhoneNumber123(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6204_"+j+"_13\"]/table/tbody/tr/td/input[1]"));
	}
	
	public static WebElement primaryBeneComp_ContactPhoneNumber456(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6152_"+j+"_13\"]/table/tbody/tr/td/input[2]"));
	}
	
	public static WebElement primaryBeneTrust_ContactPhoneNumber456(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6204_"+j+"_13\"]/table/tbody/tr/td/input[2]"));
	}
	
	public static WebElement primaryBeneComp_ContactPhoneNumber7890(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6152_"+j+"_13\"]/table/tbody/tr/td/input[3]"));
	}
	
	public static WebElement primaryBeneTrust_ContactPhoneNumber7890(WebDriver driver, int j){
		
		return Element = driver.findElement(By.xpath("//*[@id=\"qcontent_6204_"+j+"_13\"]/table/tbody/tr/td/input[3]"));
	}
}