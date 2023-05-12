package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled {
	
	
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			Thread.sleep(3000);
			
			driver.get("https://www.mobikwik.com/");
		WebElement a = driver.findElement(By.xpath("//*[@id=\"rechargeForm\"]/div[2]/button"));
		
		boolean v = a.isEnabled();
		System.out.println(v);
	}

}
