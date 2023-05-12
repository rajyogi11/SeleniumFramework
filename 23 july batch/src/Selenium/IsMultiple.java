package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {
	
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			
			driver.get("https://www.facebook.com/campaign/landing.php");
			
			WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
			
			Select nn = new Select(year);
			
			boolean aa = nn.isMultiple(); // is list box is multi selectable or not
			System.out.println(aa);
			
			if(aa==true) {
				System.out.println("List box is multiselectable");
			}
			else {
				System.out.println("List box is not multiselectable");
			}
	}

}
