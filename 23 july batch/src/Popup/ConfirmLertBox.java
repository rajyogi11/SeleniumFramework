package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmLertBox {
	
	
		

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			Thread.sleep(3000);
			
		driver.get("https://nxtgenaiacademy.com/alertandpopup");
		
		
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		
	
		
	//	driver.switchTo().alert().dismiss();
		
		driver.switchTo().alert().accept();
		
		
	}

}
