package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleListBox {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://www.facebook.com/");
		
		WebElement cr = driver.findElement(By.xpath("//a[text()='Create new account']"));
		
		cr.click();
		
	WebElement month=driver.findElement(By.name("birthday_month"));
		
	Select s = new Select(month);
	s.selectByVisibleText("Feb");
	
	driver.close();
	
	}

}
