
package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert { 
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.cookbook.seleniumacademy.com/Alerts.html");
		
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		
		org.openqa.selenium.Alert alt = driver.switchTo().alert();
		
		alt.sendKeys("Raj");
		
		Thread.sleep(3000);
		
		//alt.accept();
		//Thread.sleep(3000);
		alt.dismiss();
		alt.getText();
	
		
	}

}
