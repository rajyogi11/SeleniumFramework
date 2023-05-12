package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SizeMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/campaign/landing.php");
		
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		
		Select ele = new Select(year);
		
		List<WebElement> y = ele.getOptions();
		
		//System.out.println(y);
		int uu = y.size();
		System.out.println(uu);
	}
}
