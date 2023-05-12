package ParameterizationPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchBooleanDataFromSingleRow {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream File = new FileInputStream("D:\\Book1.xlsx");
		
		boolean data = WorkbookFactory.create(File).getSheet("Sheet1").getRow(2).getCell(2).getBooleanCellValue();
		//WorkbookFactory.create(File).getSheet("").getRow(0).getCell(0);
		System.out.println(data);
		
	}

}
