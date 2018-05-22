package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static XSSFSheet ExcelWSheet, ExcelWSheet2;

	private static XSSFWorkbook ExcelWBook, ExcelWBook2;

	private static XSSFCell Cell, Cell2;

	private static XSSFRow Row, Row2;
	
	private static FileInputStream ExcelFile2open, ExcelFile2open2;

//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method

public static void setExcelFile(String Path,String SheetName) throws Exception {

		try {

			// Open the Excel file

			ExcelFile2open = new FileInputStream(Path);
		


		// Access the required test data sheet

		ExcelWBook = new XSSFWorkbook(ExcelFile2open);

		ExcelWSheet = ExcelWBook.getSheet(SheetName);

		} catch (Exception e){

			throw (e);

		}

}


//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

public static String getCellData(int RowNum, int ColNum) throws Exception{

		try{

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();
			

			return CellData;
			
			

			}catch (Exception e){

			return"";

			}

}

public static void setCellData(String path,String SheetName, int RowNum, int ColNum, String value) throws Exception{

	try{
		
        
		ExcelFile2open2 = new FileInputStream(path);
		ExcelWBook2 = new XSSFWorkbook(ExcelFile2open2);
		ExcelWSheet2 = ExcelWBook2.getSheet(SheetName);
        System.out.println("1");
        
        ExcelWSheet2.createRow(RowNum).createCell(ColNum).setCellValue(value);
        
//		Row2  = ExcelWSheet2.getRow(RowNum);
//		System.out.println("2");
//		
//			 
//			Cell2.setCellValue(value);
//			System.out.println("3");
			 
		
//		ExcelFile2open2.close();
		System.out.println("4");
	        
	        FileOutputStream fileOut = new FileOutputStream(path);
	        System.out.println("5");
	        
          	ExcelWBook2.write(fileOut);
          	System.out.println("6");
 
//          	fileOut.flush();
 
       fileOut.close();
//            System.out.println("7");

		}catch (Exception e){

	System.out.println("Exception occured while writing excel "+e.getMessage());
		}

}

}
