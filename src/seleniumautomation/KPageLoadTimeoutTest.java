package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class KPageLoadTimeoutTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Drm%26ogbl&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//Its for page to load on the heavy web application. 
		//It can be use in addition with explicitewait
		//to wait for both page and then elements also to become visible.
		//In Industry while working this two are very useful.
	}

}
