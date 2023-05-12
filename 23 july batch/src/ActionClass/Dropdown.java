package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		
		WebElement log = driver.findElement(By.xpath("//a[text()='Login']")); // drop down element
		
	      Actions y = new Actions(driver); // type casting
	      
	      y.moveToElement(log).perform();
	      
	      Thread.sleep(3000);
	      
	      WebElement v = driver.findElement(By.xpath("//div[text()='Wishlist']"));
		
	      y.contextClick(v).perform();  // for right click
	      
	   //   y.click(v).perform();
	      //y.doubleClick();
	      
	      

}  
}