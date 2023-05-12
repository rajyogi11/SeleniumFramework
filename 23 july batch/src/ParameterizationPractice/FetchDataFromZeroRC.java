package ParameterizationPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromZeroRC { 
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream File = new FileInputStream("D:\\Book1.xlsx");
	
	String data = WorkbookFactory.create(File).getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
	
	System.out.println(data);

}
}