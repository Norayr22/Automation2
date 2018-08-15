package demo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import library.Utility;

public class FirstTest {
	WebDriver driver;
    @Test
	public void test() throws IOException {

		System.setProperty(Constants.CHROMEDRIVER, Constants.CHROMEDRIVER_EXE);
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(Constants.URL);
//        driver.findElement(By.xpath("fff")).click();
		
		
	
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(result.getStatus()== ITestResult.FAILURE) {
			Utility.screenshot(driver, result.getName());
			
		}
		driver.quit();
	}
	
	public void test1() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
	}

}


