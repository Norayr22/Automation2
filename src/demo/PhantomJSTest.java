package demo;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import library.Utility;

public class PhantomJSTest {

	
	@Test
	public void verifyFacebookTitle() {
		File src = new File("C:\\Users\\User\\Downloads\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		WebDriver driver = new PhantomJSDriver(); 
		driver.get("http://www.facebook.com");
		String facebook_title = driver.getTitle();
		System.out.println(facebook_title);
		Utility.screenshot(driver, "PhantomjsDriverExample");
		Assert.assertTrue(facebook_title.equalsIgnoreCase("Facebook - Log In or Sign Up"));
		
	}
}
