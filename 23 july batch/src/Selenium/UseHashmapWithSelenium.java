package Selenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseHashmapWithSelenium {
	
	public static void main(String[] args) throws InterruptedException {
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("Admin", "Admin:Admin123"); // in application there is multiple roles like admin , accountant, employee for check that functionality with multiple role we use hashmap
		map.put("Manager", "Manager:Manager1234");
		map.put("HR", "HR:Hr112");
		
		String[]arr=map.get("Admin").split(":");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.findElement(By.name("username")).sendKeys(arr[0]);
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(arr[1]);
		
	}

}
