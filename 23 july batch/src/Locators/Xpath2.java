package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?biz=false&cc=IN&continue=https%3A%2F%2Fmyaccount.google.com%2F&dsh=S-602985313%3A1664963055718982&flowEntry=SignUp&flowName=GlifWebSignIn&service=accountsettings");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Raj");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("gosavi"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("gosaviraj1101");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("Raj#4567");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("Raj#4567");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[3]/div/div[1]/div/div/div[1]/div/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
		Thread.sleep(3000);
		
	
		
	}

}
