package demo;



import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestChromeGrid {

	public static void main(String[] args) throws Exception {
	
		
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setPlatform(Platform.WINDOWS);
	
		URL url = new URL("http://localhost:4444/wd/hub");
		
		WebDriver driver = new RemoteWebDriver(url, caps);
		
		driver.get("http://learn-automation.com");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
