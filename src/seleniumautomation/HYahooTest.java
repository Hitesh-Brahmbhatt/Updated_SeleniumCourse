package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class HYahooTest {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		driver.findElementById("login-username").sendKeys("Ankush4u08");
		driver.findElementById("login-signin").click();
		Thread.sleep(2000);
		driver.findElementById("login-passwd").sendKeys("ABC");
		driver.findElementByXPath("//*[@value='Next']").click();
		String ExpectedErrorMsg = "Invalid password. Please try again123";
		String ActualErrorMsg = driver.findElementByXPath("//*[@class='error-msg']").getText();
		System.out.println(ActualErrorMsg);
		if (ExpectedErrorMsg.equals(ActualErrorMsg)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
				
		driver.quit();	
		
	}

}
