package seleniumautomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CAssertion {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		/*driver.findElementByXPath("(//*[@type='text'])[1]").sendKeys("Ankush123");
		driver.findElementByXPath("(//*[@data-type='text'])[2]").sendKeys("abcd123");
		driver.findElementByXPath("//*[@id='u_0_s']").sendKeys("123456");
		driver.findElementByXPath("(//*[@type='radio'])[2]").click();
		driver.findElementByXPath("(//*[@type='submit'])[3]").click();
		System.out.println(driver.getTitle());*/
		/*String ExpectedTitle = ("Sign Up for Facebook | Facebook");
		String ActualTitle = driver.getTitle();
		if (ExpectedTitle.equals(ActualTitle)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}*/
		String ExpectedTitle = ("Sign Up for Facebook | Facebook");
		String ActualTitle = driver.getTitle();
		if (ExpectedTitle.equals(ActualTitle)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test fail");
		}
		driver.close();
	}

}
