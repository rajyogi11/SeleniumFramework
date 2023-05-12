package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v105.css.model.SelectorList;

public class Webdriver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php"); // for facebook
		Thread.sleep(3000);
		driver.getTitle();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.youtube.com/feed/explore"); // for youtube
		
	//  x = new SelectorList ();
		
	}
	
	

}



