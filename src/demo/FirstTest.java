package demo;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import library.Utility;

public class FirstTest {


	public void main(String[] args) throws IOException {

		System.setProperty(Constants.CHROMEDRIVER, Constants.CHROMEDRIVER_EXE);
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(Constants.URL);

		Utility.screenshot(driver, "noro");
		
		driver.quit();



		//		 List<WebElement> udate_button = driver.findElements(By.xpath("//img[@src = '/img/renew.png']"));
		//		 
		//		 for(WebElement refresh:udate_button){
		//			 refresh.click();
		//			 
		//		 }



	}

}


