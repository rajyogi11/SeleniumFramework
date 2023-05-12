package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	public static void main (String [] args) throws IOException, InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		
		
		for(int i=0; i<=links.size(); i++) {
			
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			
			URL link = new URL(url);
			//create connection using url object 'link'
			HttpURLConnection httpconn =(HttpURLConnection)link.openConnection();
			
		    Thread.sleep(3000);
		    httpconn.connect(); // establish connection
		    
		    int rescode = httpconn.getResponseCode(); // if its cross 400 then that links are broken links
		    
		    
		    if(rescode>=400) {
		    	System.out.println(url +"  "+ "is broken links");
		    }
		    
		    else {
		    	System.out.println(url +" "+ "is not broken links");
		    }
		}
			
		
	

}
}