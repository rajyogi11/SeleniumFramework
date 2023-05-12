package ParaMInOtherWay;
import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Parameterization2 {
	
	public static void main(String[] args) throws Exception {
		
		File src = new File("D:\\Book1.xlsx"); // keep excell path
		
		FileInputStream fis = new FileInputStream(src); // extends excell path using variable
		
		XSSFWorkbook wb = new XSSFWorkbook(fis); // 1 excell sheet = 1 workbook so this object load complete workbook
	
		//HSSFWorkbook wb = new HSSFWorkboo(); when we have old excell sheet whose extention like .xlx file so we use HSSf file
		// but we have .xlsx so we use XSSF file
		
		//wb.getSheet("sheet1"); // this method is used to read the sheet with its name
		XSSFSheet Sheet1=wb.getSheetAt(1); // this method is used to read the sheet using index number like in one excell
	//	sheet we have lots of data and sheet name like sheet1,sheet2,sheet3,sheet4 
		// so this method load sheet using index number like sheet1=index 0; sheet2= index 1; sheet3= index3;
		String data1=Sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data1);
		
		XSSFSheet Sheet2=wb.getSheetAt(1);
		String data2=Sheet1.getRow(2).getCell(1).getStringCellValue();
		System.out.println(data2);
		wb.close(); // for close the loading workbook it helps to doesn't leak the excel sheet data
	}
}
