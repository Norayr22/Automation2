package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickingElement {
	
	public static void clickById(WebDriver driver, String id) {
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id(id))).click().build().perform();
		
	}

}
