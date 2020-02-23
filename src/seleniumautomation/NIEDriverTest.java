package seleniumautomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NIEDriverTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\jar files\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		
	}

}
