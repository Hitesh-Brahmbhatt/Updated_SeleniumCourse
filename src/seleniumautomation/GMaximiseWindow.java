package seleniumautomation;


import org.openqa.selenium.firefox.FirefoxDriver;

public class GMaximiseWindow {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

	}

}
