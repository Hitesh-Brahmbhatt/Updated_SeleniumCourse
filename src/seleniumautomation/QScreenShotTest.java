package seleniumautomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QScreenShotTest {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		File Scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//remove<x>
		FileUtils.copyFile(Scrfile, new File("C:\\ScreenShot\\Ankush.jpeg"));//OR both format
		FileUtils.copyFile(Scrfile, new File("C:\\ScreenShot\\Ankush.png"));
		driver.close();
	}

}
