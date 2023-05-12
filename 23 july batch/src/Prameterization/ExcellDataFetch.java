package Prameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcellDataFetch {
	public static void main(String[] args) throws EncryptedDocumentException, IOException { 
		
		FileInputStream file = new FileInputStream("D:\\Book1.xlsx");
		
		 String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(5).getCell(3).getStringCellValue();
		// System.out.println(data);
		 
		 
		 
		 
		// double x = WorkbookFactory.create(file).getSheet("Sheet1").getRow(8).getCell(1).getNumericCellValue();
		// System.out.println(x);
		
		//boolean x = WorkbookFactory.create(file).getSheet("Sheet1").getRow(6).getCell(1).getBooleanCellValue();
		//System.out.println(x);
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(data);
			
	}
	
	
	}


