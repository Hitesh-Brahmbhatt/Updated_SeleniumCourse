package seleniumautomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class UAttribute {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		System.out.println(driver.findElementByName("group1").getAttribute("value"));
		
		driver.close();
	}

}
