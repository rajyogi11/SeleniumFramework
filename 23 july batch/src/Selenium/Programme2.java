package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programme2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String exptitle = "Facebook-log in or sign up";
		
		//System.out.println(expurl);
		
		if(title.equalsIgnoreCase(exptitle)) {
			System.out.println("correct page");
		}
		else {
			System.out.println("wrong page");
		}
	}

}
