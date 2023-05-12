package Prameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class veryficellType {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Book1.xlsx");
		
		CellType CT = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(8).getCellType();
		
		System.out.println(CT);  // string
	}
	
	
		
	}


