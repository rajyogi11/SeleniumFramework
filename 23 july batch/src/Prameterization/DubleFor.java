package Prameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DubleFor {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		

		FileInputStream file = new FileInputStream("D:\\Book1.xlsx");  // fetching one complete row
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		for(int i=0; i<=sh.getLastRowNum(); i++) {  // fetch one complete row
			
			
			for(int j =0; j<=sh.getRow(i).getLastCellNum()-1; j++) {  
				
				
				 String data = sh.getRow(i).getCell(j).getStringCellValue();
				 
				 System.out.println(data);
				
				
				
			}
		}
	}

}
