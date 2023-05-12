package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragonDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			
			WebElement t = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
			
			Thread.sleep(3000);
			
			
			WebElement o = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
			
			Actions u = new Actions(driver);
			
			Thread.sleep(3000);
			
		//	u.moveToElement(t).clickAndHold().moveToElement(o).release().build().perform();
			
			u.dragAndDrop(t, o).build().perform();
			
			

}
}