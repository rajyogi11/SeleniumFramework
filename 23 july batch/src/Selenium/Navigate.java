package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajyogi Gosavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_e&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=623294626545&hvpos=&hvnetw=g&hvrand=16442148030151345631&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9303436&hvtargid=kwd-316976912080&hydadcr=5841_2363976&gclid=EAIaIQobChMIof3cmNfG-gIVAJhmAh1uGAGlEAAYASAAEgJUCPD_BwE");
	Thread.sleep(3000);
	driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");  // url of singup page
	Thread.sleep(3000);
	
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().refresh();
	//driver.close();
	 boolean v=driver.getPageSource().isEmpty(); // to check weather given page contain any element present or not
	
	System.out.println(v);

}
}
