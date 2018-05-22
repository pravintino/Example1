package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Propfile {
	
	public static String getprop(String getvaluewithID) throws Exception{
		
	
	
//	File file = new File("./prop.properties");
	
	String path ="C:\\Users\\pravin.xavier.nadar\\eclipse-workspace\\Prudential\\prop.properties";
	
	FileInputStream fis = new FileInputStream(path);

	Properties prop = new Properties();
	
	prop.load(fis);
	
	String value = prop.getProperty(getvaluewithID);
			
	return value;
	
	
	
	}

}
