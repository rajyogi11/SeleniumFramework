package ParameterizationPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class IwantcellwithDifferentTypeData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
        FileInputStream file = new FileInputStream("D:\\Book1.xlsx");
		
		Cell type = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(2);
		
		CellType data = type.getCellType();
		
		if(data==CellType.STRING) {
		
		System.out.println(type.getStringCellValue());
		}
		
		else if(data==CellType.NUMERIC) {
			System.out.println(type.getNumericCellValue());
		}
		
		else if (data==CellType.BOOLEAN) {
			System.out.println(type.getBooleanCellValue());
		}
		
		
	}

}
