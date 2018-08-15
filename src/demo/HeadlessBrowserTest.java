package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeadlessBrowserTest {
	
	@Test
	public void verifyFacebookTitle() {
		
		WebDriver driver = new HtmlUnitDriver(); // true --- start supporting JavaScript
		driver.get("http://www.facebook.com");
//		String facebook_title = driver.getTitle();
//		System.out.println(facebook_title);
//		
//		Assert.assertTrue(facebook_title.equalsIgnoreCase("Facebook - Log In or Sign Up"));
//		
	}

}
