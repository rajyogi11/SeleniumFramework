package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programme_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://accounts.paytm.com/register#!/signup");  // url of singup page
	Thread.sleep(3000);
	
	driver.getTitle();
	
	String title = driver.getTitle();  // object create
	
	System.out.println(title);  // call
	
	String expTitle ="Paytm";  // url compaire with title // url of create account
	
	if(title.equalsIgnoreCase(expTitle)) {
		System.out.println("Navigate to correct page");
	}
	else {
		System.out.println("Navigate to wrong page");
	}
	}
	
	
	


}
