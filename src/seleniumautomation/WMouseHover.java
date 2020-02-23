package seleniumautomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WMouseHover {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		WebElement mousehov = driver.findElementById("nav-link-accountList");		
		Actions builder = new Actions(driver);
		builder.moveToElement(mousehov).build().perform();
	}

}
