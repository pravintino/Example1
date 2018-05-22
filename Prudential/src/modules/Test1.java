package modules;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Test1 {
	


	@Test 
      public void NewBusinessApplicationSummary() throws Exception{
      	
		FileInputStream	fis = new FileInputStream("C:\\Users\\pravin.xavier.nadar\\eclipse-workspace\\Prudential\\DOCS\\Results.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		sheet.createRow(10).createCell(7).setCellValue(15);
		FileOutputStream fout= new FileOutputStream("C:\\\\Users\\\\pravin.xavier.nadar\\\\eclipse-workspace\\\\Prudential\\\\DOCS\\\\Results.xlsx");
		wb.write(fout);
	wb.close();
	

	  }

}
