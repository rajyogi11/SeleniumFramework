package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplyaed {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		Thread.sleep(3000);
		 boolean c = driver.findElement(By.xpath("(//input[@type='text'])[6]")).isDisplayed();
		//boolean tt = c.isDisplayed();
		System.out.println(c);
		
		if(c==true) {
			System.out.println("element is display");
		}
		else {
			System.out.println("element is not display");
		}
		
		
		
		
	}

}
