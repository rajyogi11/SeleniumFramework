package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeInExcel {
	
	public static void main(String[] args) throws Exception {
		
File src = new File("D:\\Book1.xlsx"); 
		
		FileInputStream fis = new FileInputStream(src); 
		
		XSSFWorkbook wb = new XSSFWorkbook(fis); 
		
        XSSFSheet Sheet1=wb.getSheetAt(1);
        FileOutputStream cc = new FileOutputStream(src); // this method is used to write the data
        
	}

}
