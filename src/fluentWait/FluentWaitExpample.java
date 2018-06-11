package fluentWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import demo.Constants;

public class FluentWaitExpample {

	public static void main(String[] args) {
		System.setProperty(Constants.CHROMEDRIVER, Constants.CHROMEDRIVER_EXE);
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement((By.xpath("//button[contains(text(),'Click me to star')]"))).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		   .withTimeout(30, TimeUnit.SECONDS)
		   .pollingEvery(1, TimeUnit.SECONDS)
		   .ignoring(NoSuchElementException.class);
		   
		 WebElement element = wait.until(new Function<WebDriver, WebElement>(){
			 public WebElement apply(WebDriver driver) {
				 
				 WebElement ele = driver.findElement(By.xpath("//p[@id = 'demo']"));
				 
				 String value = ele.getAttribute("innerHTML");
				 if(value.equalsIgnoreCase("WebDriver")) {
					 return ele;
					 
				 }
				 else {
					 
					 System.out.println("text is "+value);
					 return null;
				 }
				 
			 }
			 
		 });
		 System.out.println("Element is DIsplayed "+ element.isDisplayed());
	}



}
