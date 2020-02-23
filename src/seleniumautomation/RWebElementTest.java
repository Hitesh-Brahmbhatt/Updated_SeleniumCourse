package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RWebElementTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&flowName=GlifWebSignIn&flowEntry=AddSession");
		//driver.findElementByXPath("//*[@id='identifierId']").sendKeys("ankushpatil080486@gmail.com");
		WebElement gmail = driver.findElementByXPath("//*[@id='identifierId']");//Storing data type WebElemtn from the driver.findelement metnod
		gmail.sendKeys("ankushpatil080486@gmail.com");
		
		//Practice::- 1). do it for next button & 2) Then for Password.
		
		WebElement Nextbutton = driver.findElementByXPath("//*[@id='identifierNext']");
		Nextbutton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='password']")));
		WebElement Password = driver.findElementByXPath("//*[@name='password']");
		Password.sendKeys("Ankush@123");
		
	}

}
