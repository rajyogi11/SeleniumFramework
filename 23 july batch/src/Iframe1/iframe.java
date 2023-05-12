package Iframe1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	
	public static void main (String [] arg) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rajyogi Gosavi\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		WebElement v = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(v);  // 
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//driver.switchTo().parentFrame();  // we navigate from child frame to immediate parent frame
		
		driver.switchTo().defaultContent(); // we navigate from any child iframe to main page
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		
		
		
	}

}
