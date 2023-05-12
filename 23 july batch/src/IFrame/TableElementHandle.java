package IFrame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableElementHandle {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			
			List<WebElement> noOfR = driver.findElements(By.xpath("//table[@id='customers']//tr"));
			
			System.out.println("No of rows "+noOfR.size());
			
			for(int i=1; i<noOfR.size(); i++) { // for row in table
				List<WebElement> noofcells = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
				System.out.println("no of cells present in row "+noofcells.size());
			
			
			for(int j =0; j<noofcells.size(); j++) {
				
				
				
				System.out.print(noofcells.get(j).getText());
			}
	}
			System.out.println();

}
}