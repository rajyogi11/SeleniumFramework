package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/r.php");
	Thread.sleep(3000);
	
	 WebElement c = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	 
	 c.click();
	 
	 boolean tt = c.isSelected();
	 
	 if(tt==true) {
		 
		 System.out.println("element is selected");
	 }
	 else {
		 System.out.println("element is not selected");
	 }
	 


}
}