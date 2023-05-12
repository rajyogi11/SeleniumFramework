package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	
	public static void capturescreenshot(WebDriver driver, String FileName) throws IOException {
		
File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\Rajyogi Gosavi\\OneDrive\\Desktop\\TestCaseScnario\\"+FileName+".jpeg");
		
		FileHandler.copy(source, destination);
		
		
		
	}

}
