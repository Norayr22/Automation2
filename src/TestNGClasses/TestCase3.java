package TestNGClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@Test
	public void testWordpress() {
		
		Assert.assertTrue(false);
		System.out.println("Wordpress is opened");
	}
	
	@Test
	public void testWordpress1() {
		
		Assert.assertTrue(true);
		System.out.println("Wordpress is opened");
	}

}
