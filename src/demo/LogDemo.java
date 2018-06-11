package demo;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogDemo {

	public static void main(String[] args) {
	
		
		Logger logger  = Logger.getLogger("LogDemo");
		PropertyConfigurator.configure("Log4j.properties");
		

		System.setProperty(Constants.CHROMEDRIVER, Constants.CHROMEDRIVER_EXE);
		WebDriver driver = new ChromeDriver();
		logger.info("Chrome opened");

		driver.manage().window().maximize();
		logger.info("Chrome maximized");
		driver.get("http://www.goibibo.com/");
		logger.info("get to current URL");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("driver wait");
		
		driver.findElement(By.xpath("//a[@id = 'get_sign_up']")).click();
		logger.info("click on sign_up");
		
		driver.switchTo().frame("authiframe");
		logger.info("Switch to frame");
		
		driver.findElement(By.xpath("//input[@id = 'authMobile']")).sendKeys("Mukesh_50");
		logger.info("enter username");
		
		
		

	}

}
