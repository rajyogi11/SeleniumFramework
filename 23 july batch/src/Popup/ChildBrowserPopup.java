package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rajyogi Gosavi\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click(); // multiple window
	//	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Set<String> b = driver.getWindowHandles();  // getWindowhandles for multiple window
		 ArrayList<String> c = new 	 ArrayList<String>(b);  // Array allows duplicate value but set do not allow thats why for multiple window pop is handle by using array list object
		    // because of arraylist contain get method which is use to handle multiple window according there index
		String n = c.get(1); ;// for two window
		driver.switchTo().window(n); // focus is on child window
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		 driver.switchTo().window(c.get(0));
		
		
		
		
		 
		 
		
	}

}
