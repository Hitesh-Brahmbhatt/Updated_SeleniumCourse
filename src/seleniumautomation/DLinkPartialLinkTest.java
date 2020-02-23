package seleniumautomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DLinkPartialLinkTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		//driver.findElementByLinkText("Advertising").click();
		driver.findElementByPartialLinkText("Adv").click();
		//driver.close();

	}

}
