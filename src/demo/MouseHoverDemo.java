package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {

		System.setProperty(Constants.CHROMEDRIVER, Constants.CHROMEDRIVER_EXE);
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
        WebElement element = driver.findElement(By.xpath("//button[@class = 'dropbtn']"));
        Actions act  = new Actions(driver);
        act.moveToElement(element).perform();
        
        List<WebElement> links = driver.findElements(By.xpath("//div[@class = 'dropdown']//a"));
        
        int total_counts = links.size();
        for(int i = 0; i< total_counts; i++) {
        	
        	WebElement ele = links.get(i);
        	String text = ele.getAttribute("innerHTML");
        	boolean status = ele.isEnabled();
        	System.out.println(text + " "+status);
        	
        	 if(text.equalsIgnoreCase("Appium")) {
        		 
        		 ele.click();
        		 break;
             	
             }
        	
        }
       
		

	}

}
