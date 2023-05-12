package ParameterizationPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class IwantLastRowInExcellSheet {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Book1.xlsx");
		
		int data = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		
		System.out.println(data);
	}

}
