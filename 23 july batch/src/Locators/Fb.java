package Locators;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Fb {
	public static void main(String[] args) throws InterruptedException  {
		
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
		driver.get(	"https://www.facebook.com/");  // url of singup page
		
		WebDriverWait ref = new WebDriverWait(driver,Duration.ofSeconds(20));
		
//		ref.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text'])[4]"))).sendKeys("9420662974");
		
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Raj");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Gosavi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9420662974");
		//ref.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text'])[4]"))).sendKeys("9420662974");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Raj$454");
		Thread.sleep(3000);
		WebElement x=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		
		Select ele = new Select(x);
		ele.selectByIndex(14);
		Thread.sleep(3000);
		WebElement y = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select ss = new Select(y);
		ss.selectByVisibleText("Jun");
		//ss.getFirstSelectedOption().getText();
		Thread.sleep(3000);
		WebElement z=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select cc = new Select(z);
		cc.selectByValue("1995");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(3000);
		//driver.quit();		
		
		
		
		
		
		

	}
}
