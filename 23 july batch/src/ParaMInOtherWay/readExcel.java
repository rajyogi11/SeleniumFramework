package ParaMInOtherWay;
import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {
	
	public static void main(String[] args) throws Exception {
		
		File src = new File("D:\\Book1.xlsx"); 
		
		FileInputStream fis = new FileInputStream(src); 
		
		XSSFWorkbook wb = new XSSFWorkbook(fis); 
		
        XSSFSheet Sheet1=wb.getSheetAt(1);
        
        int rowcount=Sheet1.getLastRowNum();
        
        System.out.println(rowcount);
        
        for(int i=0; i<rowcount; i++) {
        	
        String data1=Sheet1.getRow(i).getCell(0).getStringCellValue();
        
        System.out.println(data1);
        }
		
		wb.close(); 
	}
}
