package seleniumautomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class MChromeDriverTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\jar files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}

}
