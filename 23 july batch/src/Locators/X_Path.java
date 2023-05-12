package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path {
	
public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();  // up casting
	
	driver.get("https://www.facebook.com/");;  // url of singup page
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1245784569");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("asd@45157");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@value='1']")).click();
	
}
}
