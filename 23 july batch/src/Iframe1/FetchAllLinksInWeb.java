package Iframe1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAllLinksInWeb {
	
	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rajyogi Gosavi\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.instagram.com/");
			
			 List<WebElement> x = driver.findElements(By.xpath("//a"));
			
			System.out.println(x.size());
			
			for(int i =0; i<=x.size(); i++) {
				
				System.out.println(x.get(i).getText()+" : "+ x.get(i).getAttribute("href"));
			}
	}

}
