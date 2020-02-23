package seleniumautomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ENavigateTest {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		//driver.findElementByLinkText("Advertising").click();
		driver.findElementByPartialLinkText("Adv").click();
		Thread.sleep(2000);
		System.out.println("Advertising Page " + driver.getTitle());
		driver.navigate().back();
		System.out.println("Main Page " + driver.getTitle());
		driver.navigate().forward();
		System.out.println("Advertising Page " + driver.getTitle());
		driver.close();
		

	}

}
