package Selenium;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class basic {
		
		
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver(); // up casting
	      
	      driver.navigate().to("https://www.facebook.com/r.php");
	      Thread.sleep(3000);
	     // driver.get("chrome:\\new tab");
	    //    driver.manage().window().maximize();
	    // Thread.sleep(3000);
	       
	    //driver.close();
	    // driver.quit();
	       String Title = driver.getTitle();
	     System.out.println(Title);
	       
	       String exptitle =("sign up for Facebook | Facebook");
	       
	       if (Title.equalsIgnoreCase(exptitle)) {
	    	   System.out.println("Navigated to correct page");
	       }
	      else {
	    	 System.out.println("Navigated to wrong page");
	      }driver.close();
	
}
	}
