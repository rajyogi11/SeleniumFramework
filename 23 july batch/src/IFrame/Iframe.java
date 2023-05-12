package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rajyogi Gosavi\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		WebElement v = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
		
		driver.switchTo().frame(v); // changes focus from main page to iframe
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	
	}

}
