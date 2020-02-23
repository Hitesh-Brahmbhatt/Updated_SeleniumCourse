package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FImpliciteWait {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		//driver.findElementByLinkText("Advertising").click();
		driver.findElementByPartialLinkText("Adv").click();
		driver.findElementByLinkText("Start now").click();
		System.out.println("Advertising Page " + driver.getTitle());
		driver.close();
		
		

	}

}
