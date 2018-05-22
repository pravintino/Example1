package adhoc;

import org.openqa.selenium.By;

public class TotalFrame {
	
    System.out.println("Total no of frames:"+driver.findElements(By.tagName("iframe")).size());

}
