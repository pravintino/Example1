package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {
	
	public static void Takescreenshot(WebDriver driver, String ScreenshotName)
	{

		TakesScreenshot ts= ((TakesScreenshot)driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
	try {
		
	FileUtils.copyFile(src, new File("./Screenshots/"+ScreenshotName+".png"));
	
	}
	 
	catch (IOException e)
	 {
	  System.out.println(e.getMessage());
	 
	 }
	 }
}