package seleniumautomation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IKeysTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		driver.findElementById("login-username").sendKeys("Ankush4u08");
		driver.findElementById("login-signin").sendKeys(Keys.ENTER);
		
		driver.close();

	}

}
