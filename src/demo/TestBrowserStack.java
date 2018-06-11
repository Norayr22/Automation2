package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBrowserStack {

	public static final String USERNAME = "norayr1";
	public static final String AUTOMATE_KEY = "7cwzF6rQsM9BFHd3Epdn";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static void main(String[] args) throws MalformedURLException {






		DesiredCapabilities caps =  DesiredCapabilities.safari();
		caps.setPlatform(Platform.MAC);
        caps.setCapability("browserstack.debug", true);
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		
		driver.get("http://www.learn-automation.com");
	    driver.getTitle();
		System.out.println(driver.getTitle());
		driver.quit();

	}


}

