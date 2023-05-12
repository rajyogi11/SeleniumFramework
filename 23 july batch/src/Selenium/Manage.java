package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {
	
		
		public static void main(String[] args) throws InterruptedException{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		      WebDriver driver= new ChromeDriver();
		      
		      driver.navigate().to("https://www.facebook.com/r.php");
		      Thread.sleep(3000);
		      
		      driver.manage().window().maximize();
		     // driver.quit();
		      Thread.sleep(3000);
		     driver.manage().window().minimize(); // we were not used in our project 
		     driver.quit();
		    
	}

}
