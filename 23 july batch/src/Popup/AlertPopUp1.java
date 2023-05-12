package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp1 {
	
	public static void  main  (String [] arg) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rajyogi Gosavi\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(3000);
		alt.sendKeys("Raj");
		
		alt.dismiss();
		
		
	}

}
