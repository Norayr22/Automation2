package Listenners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import demo.Constants;

public class MyFisrtTestCase {
	
	@Test
	public void verifyGoogleTitile() {
		
		System.setProperty(Constants.CHROMEDRIVER, Constants.CHROMEDRIVER_EXE);
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
	
	@Test
	public void test2() {
		
		System.out.println("stupid test");
		Assert.assertTrue(false);
		
	}

}
