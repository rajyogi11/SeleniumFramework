package Prameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetLastCell {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Book1.xlsx");
		
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		 
		 short getLastColumn = sh.getRow(0).getLastCellNum();  // get last column where the value is present
		 
		 System.out.println(getLastColumn );  // column (cell) size in Excell sheet 9 and string last data is smoke in last or 9 no. cell is smoke
		 
		 for(int i=0; i<=getLastColumn -1; i++) {
			 
			 String data = sh.getRow(0).getCell(i).getStringCellValue();  // put row number in get row
			 
			 System.out.println(data);
			 
			 
		 }
		 
		 // quetion is fetch one single row in excell 
		 // question is fetch last cell number in excell using lastcellnum method
		 
	
	}

}
