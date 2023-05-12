package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByclassMethods {
	
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver= new ChromeDriver(); // up casting
    
    driver.navigate().to("https://www.facebook.com/login.php");
    
   driver.findElement(By.id("email")).sendKeys("2145787212");

}
}