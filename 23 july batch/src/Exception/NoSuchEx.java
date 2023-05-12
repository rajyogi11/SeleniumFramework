package Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchEx {
	
	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	
	try {
		driver.findElement(By.xpath("//button[@valu='1']"));
	}
	
	catch(NoSuchElementException m) {
		
		boolean x = driver.findElement(By.xpath("//button[@value='1']")).isEnabled();
		
		System.out.println(x);
		
		System.out.println("Catch block executed");
		
		
		
		if(x==true) {
			System.out.println("element  is enabled");
		}
		else {
			System.out.println("element is disabled");
		}
	
	
	
	
	

	}
}
}


