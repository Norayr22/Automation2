package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void screenshot(WebDriver driver, String screehshotName) {
	
	 TakesScreenshot ts = (TakesScreenshot)driver;
	 
	 File source = ts.getScreenshotAs(OutputType.FILE);
	 
	 try {
		FileUtils.copyFile(source, new File("./Screenshots/"+screehshotName+".png"));
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

}
}