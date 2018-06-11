package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ClickElement;

import library.ClickingElement;

public class YahooMailCheck {

	public static void main(String[] args) {
		System.setProperty(Constants.CHROMEDRIVER, Constants.CHROMEDRIVER_EXE);
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=us&.lang=en-US&.done=https%3A%2F%2Fwww.yahoo.com");
//		driver.findElement(By.xpath("//label[contains(text(),'Stay signed')]")).click();
		
		ClickingElement.clickById(driver, "persistent");


	}

}
