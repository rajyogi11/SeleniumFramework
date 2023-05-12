package Selenium;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DatewithScreenShot extends screenshot {
	
	

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				Thread.sleep(3000);
				
				driver.get("https://www.facebook.com/campaign/landing.php");
				
				  Date d = new Date();
				  String m = d.toString().replace(":", "_").replace("", "_")+"phot.jpeg";
				  screenshot.capturescreenshot(driver, m);
				
				
				  
				  for(int i=5; i<1; i++) {
					  System.out.println(m);
				  }
				  
				  
				  
				
	}
	
}
