package Wait;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Flip {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		
		
		driver.get("https://www.flipkart.com");
		
	//	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebDriverWait ref = new WebDriverWait(driver,Duration.ofSeconds(5)); // explicitly wait
		ref.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text'])[2]"))).sendKeys("9420662974");
		
		WebDriverWait re = new WebDriverWait(driver,Duration.ofSeconds(3));
		
		
		//driver.findElement(By.xpath("//input[@type='text'])[2]")).sendKeys("9420662974");
		
		driver.findElement(By.xpath("//input[@autocomplete='off'])[3]")).sendKeys("Raj@889849");
		
	}

}
