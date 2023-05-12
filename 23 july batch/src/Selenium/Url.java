package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/r.php");
		
		String URL = driver.getCurrentUrl();  // object create
		
		System.out.println(URL);// call 
		
		if(URL.equals("https://www.facebook.com/r.php")) {
		
		System.out.println("Correct");
		}
		else {
			System.out.println("Wrong");
		}
		
		driver.quit();
		
		

}
}