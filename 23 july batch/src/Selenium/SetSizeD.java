package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class SetSizeD {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/campaign/landing.php");
		
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		
		Select ele = new Select(year);
		
		List<WebElement> y = ele.getOptions();
		
		int size = y.size();
		
		for(int i=0; i<y.size()-1; i++) {
			System.out.println(y.get(i).getText());
		}
		

}
}