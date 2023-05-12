package Wait;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {
	
public static void main(String[] args)   {
		
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");  // url of singup page
		
		WebDriverWait ref = new WebDriverWait(driver,Duration.ofSeconds(20)); // explicitly wait
		ref.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("9420662974");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // version 3
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // version 4
		
	//	Thread.sleep(3000);
	    
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	//	Thread.sleep(3000);
		ref.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname"))).sendKeys("Raj");
	 
	//	Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Gosavi");
	//	Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9420662974");
	//	Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Raj$454");
	//	Thread.sleep(3000);
		WebElement x=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select ele = new Select(x);
		ele.selectByIndex(14);
	//	Thread.sleep(3000);
		WebElement y = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select ss = new Select(y);
		ss.selectByVisibleText("Jun");
		ss.getFirstSelectedOption();
	//	Thread.sleep(3000);
		WebElement z=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select cc = new Select(z);
		cc.selectByValue("1995");
	//	Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
	//	Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	//	Thread.sleep(3000);
		//driver.quit();		
		
		
		
		
		
		

	}
}



