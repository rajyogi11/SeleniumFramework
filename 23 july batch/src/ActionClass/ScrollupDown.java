package ActionClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupDown {
	
	
		
		public static void main(String[] args) throws InterruptedException {
			
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.album.alexflueras.ro/index.php");
				
			//	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2000)");
				
				JavascriptExecutor b = (JavascriptExecutor)driver;  // type casting
				
				b.executeScript("window.scrollBy(0,2000)");    // scroll down
				                                  // provide coordinates(0,200)
				                                // x axis constant for scroll up and down
				Thread.sleep(3000);
				
		         b.executeScript("window.scrollBy(0,-2000)");  // scroll up
				
				Thread.sleep(3000);
				
		        b.executeScript("window.scrollBy(1000,0)");   // scroll right
		                                                         // y axis or coordinate is zero for left and right
				
				Thread.sleep(3000);
				
		        b.executeScript("window.scrollBy(-1000,0)");   // scroll left
				
				Thread.sleep(3000);
				

	}

}
