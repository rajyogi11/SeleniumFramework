package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet Sheet1;
	
	public ExcelDataConfig(String excelPath) {
		
         try {
			File src = new File(excelPath); 
			
			FileInputStream fis = new FileInputStream(src); 
			
			wb = new XSSFWorkbook(fis); 
			
			
			 
		} 
         catch (Exception e) {
        	 
	System.out.println(e.getMessage());// if any exception come it print that
			
		} 
	}
	
	  public String getData(int sheetNumber, int row, int column) { // every time asked the arg thats why we use argument here
		  
		  Sheet1=wb.getSheetAt(sheetNumber);
		String data=Sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

}

