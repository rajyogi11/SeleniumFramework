package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionMethod {
	
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/campaign/landing.php");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		String ab = year.getText();
		System.out.println(ab);
		
		
		Select ele = new Select(year);
		
		List<WebElement> a = ele.getOptions(); // which is use to check weather given option contains multiple options or not
		
		System.out.println(a);
	    int x = a.size();
	System.out.println(x);  // size is 118 now we want to find text present in to list box then use for loop
		for(int i=0; i<=a.size()-1;i++) {
			System.out.println(a.get(i).getText());
			//System.out.println(a.get(i).getSize());
			
		}
		
		
		
				
}
}
