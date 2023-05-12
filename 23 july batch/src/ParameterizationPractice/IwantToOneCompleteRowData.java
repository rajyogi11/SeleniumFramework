package ParameterizationPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class IwantToOneCompleteRowData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Book1.xlsx");
		
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet1");
		
		for(int i=0; i<=data.getLastRowNum()-1; i++) {
			
			String b = data.getRow(0).getCell(i).getStringCellValue();  // it goes up to string value only
			
			System.out.println(b);
		}
		
		
	}

}
