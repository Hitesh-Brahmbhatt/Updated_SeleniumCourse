package seleniumautomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AElementLocators {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.findElementByName("firstname").sendKeys("Ankush123");
		//driver.findElementById("u_0_p").sendKeys("Patil08");
		//driver.findElementByClassName("inputtext").sendKeys("Patil08");
		driver.findElementByName("lastname").sendKeys("Patil08");
		//Thread.sleep(2000);
		//driver.close();
	}

}
