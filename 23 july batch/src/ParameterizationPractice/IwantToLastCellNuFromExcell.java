package ParameterizationPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class IwantToLastCellNuFromExcell {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Book1.xlsx");
		
		Sheet Lastcellsize = WorkbookFactory.create(file).getSheet("Sheet1");
		
		short data = Lastcellsize.getRow(0).getLastCellNum();
		
		System.out.println(data);
		
		
	}

}
