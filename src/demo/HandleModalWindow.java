package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleModalWindow {
	
	@Test
	private  void start() {
		
		System.setProperty(Constants.CHROMEDRIVER, Constants.CHROMEDRIVER_EXE);
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@id = 'get_sign_up']")).click();
		
		driver.switchTo().frame("authiframe");
		
		driver.findElement(By.xpath("//input[@id = 'authMobile']")).sendKeys("Mukesh_50");
		
		
		
		
	}

}
