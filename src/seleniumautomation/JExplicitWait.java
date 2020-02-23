package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JExplicitWait {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Drm%26ogbl&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElementByXPath("//*[@id='identifierId']").sendKeys("ankushpatil080486");
		driver.findElementByXPath("//*[@id='identifierNext']").click();
		
		//Following is Syntax for Explicite wait::-
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElementByName("password").sendKeys("ÄBCDDDD");
		//When we can't locate the element with the help of Thread OR Implicite wait due to page shift,
		//like gmail password page after id page.
		//This method, that is Eplicite wait is the only way to get the same. 
				
		//driver.findElementByXPath("//*[@type='password']").sendKeys("123");
		
		//driver.close();


	}

}
