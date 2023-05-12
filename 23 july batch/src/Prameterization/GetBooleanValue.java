package Prameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetBooleanValue {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream war = new FileInputStream("D:\\Book1.xlsx");
		
		boolean data = WorkbookFactory.create(war).getSheet("Sheet1").getRow(6).getCell(0).getBooleanCellValue();
		
		System.out.println(data);
		
		
	}

}
