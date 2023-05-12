package ParameterizationPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchCompleteExcellSheetWithDifferentData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 FileInputStream file = new FileInputStream("D:\\Book1.xlsx");
		 
		 Sheet diff = WorkbookFactory.create(file).getSheet("Sheet1");
		 
		 for(int i=0; i<=diff.getLastRowNum()-1; i++) {
			 
			 
			 for(int j=0; j<=diff.getRow(i).getLastCellNum()-1; j++) {
				 
				 
				 CellType data = diff.getRow(i).getCell(j).getCellType();
				 
				 
				 if(data==CellType.STRING) {
					 
					 System.out.println(diff.getRow(i).getCell(j).getStringCellValue());
				 }
				 else if(data==CellType.NUMERIC) {
					 
					 System.out.println(diff.getRow(i).getCell(j).getNumericCellValue());
				 }
				 
				 else if(data==CellType.BOOLEAN) {
					 
					 System.out.println(diff.getRow(i).getCell(j).getBooleanCellValue());
				 }
				 

	             
				 

				 
			 }
			 
			
		 }
	}

}
