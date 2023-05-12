package Iframe1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> web = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		System.out.println("total number of rows "+web.size());
		
		for(int i =1; i<web.size(); i++) {
			
			List<WebElement> noofRows = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
			
			System.out.println(noofRows.size());
		
		
		for(int j=0; j<noofRows.size(); j++) {
			
			System.out.println(noofRows.get(j).getText());
			
		}	
		}
			
		
	}

}
