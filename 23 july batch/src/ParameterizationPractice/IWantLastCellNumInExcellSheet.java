package ParameterizationPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class IWantLastCellNumInExcellSheet {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Book1.xlsx");
		
		short data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getLastCellNum();
		
		System.out.println(data);
	}

}
