package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class RandomScreenshot {
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/campaign/landing.php");
		
		for(int i=5; i>1; i--) {
			
			 File ww = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 
			String random = RandomString.make(2);
			
	        File x = new File("C:\\Users\\Rajyogi Gosavi\\OneDrive\\Desktop\\TestCaseScnario\\tet"+random+".jpg");
		
		    FileHandler.copy(ww, x);
		    
		   

		}
}
}