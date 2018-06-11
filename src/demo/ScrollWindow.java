package demo;


	
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	 
	 
	public class ScrollWindow {
	 
	 public static void main(String[] args) throws Exception {
	  
	 // load browser
	  System.setProperty(Constants.CHROMEDRIVER, Constants.CHROMEDRIVER_EXE);
	  WebDriver driver = new ChromeDriver();

		
	 
	 
	 // maximize browser
	  driver.manage().window().maximize();
	 
	 
	  // Open Application
	  driver.get("http://jqueryui.com");
	  
	 
	  // Wait for 5 second
	  Thread.sleep(5000);
	 
	 // This  will scroll page 400 pixel vertical
	  ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	  
	     
	 
	 
	}
	

}
