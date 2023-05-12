package IFrame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			List<WebElement> noofrow = driver.findElements(By.xpath("//table[@id='product']//tr"));
			
			System.out.println("total of rows "+noofrow.size());
			
		/*	for(int i=1; i<noofrow.size();i++) {
				
				List<WebElement> noofcells = driver.findElements(By.xpath("//table[@id='product']//tr["+(i+1)+"]//td"));
				
				System.out.println("no of cells in table "+noofcells.size());
				
				for(int j=0; j<noofcells.size(); j++) {
					
					System.out.print(noofcells.get(j).getText());
				}
				
				
			}
		*/	System.out.println();
	}

}
