package seleniumautomation;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AtoZPractice {

	public static void main(String[] args){
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/ap/signin?_encoding=UTF8&openid.assoc_handle=caflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Faction%3Dsign-out%26ie%3DUTF8%26path%3D%252Fgp%252Fhomepage.html%253F_encoding%253DUTF8%26ref_%3Dnav_em_T1_0_1_0_6_signout%26ref_%3Dnavm_em_signin%26ref_%3Dnavm_em_signin%26signIn%3D1%26useRedirectOnSuccess%3D1");
		
		//Test-1 to check Whether we are on Amazon Login Page::-
		String ExpectedTitle = "Amazon Sign In";
		String ActualTitle = driver.getTitle();
		if (ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Test-1 Pass-We are on Amazon Login Page");
		} else {
			System.out.println("Test-1 Fail-We are not on Amazon Login Page");
		}
		
		//Test-2 Login Page is as per requirement
		driver.findElementByXPath("//*[@id='ap_email']").clear();
		driver.findElementByXPath("//*[@id='ap_email']").sendKeys("ankushpatil080486@gmail.com");
		driver.findElementByXPath("//*[@class='a-button-input']").sendKeys(Keys.ENTER);
		String ExpectedTitle1 = "Amazon Sign In";
		String ActualTitle1 = driver.getTitle();
		if (ActualTitle1.equals(ExpectedTitle1)) {
			System.out.println("Test-2 Pass-We are on Amazon Password Page");
		} else {
			System.out.println("Test-2 Fail-We are not on Amazon Password Page");
		}
		
		//Test-3 Password Page is as per requirement
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='password']")));
		driver.findElementByXPath("//*[@type='password']").sendKeys("Ankush@123");
		driver.findElementByXPath("//*[@id='signInSubmit']").click();
		String ExpectedTitle2 = "Amazon.ca: Low Prices – Fast Shipping – Millions of Items";
		String ActualTitle2 = driver.getTitle();
		if (ActualTitle2.equals(ExpectedTitle2)) {
			System.out.println("Test-3 Pass-We are on Amazon User Home Page");
		} else {
			System.out.println("Test-3 Fail-We are not on Amazon user Home Page");
		}
		
		
		
		//Test-4 Search box
		/*driver.findElementByXPath("//*[@id='twotabsearchtextbox']").sendKeys("Dell laptops");
		driver.findElementByXPath("//*[@type='submit']").click();*/
		
		
		//Test-4 Srolling up and down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,9000)");
		driver.findElementByXPath("//*[@class='navFooterBackToTopText']").click();
		System.out.println("Test-4 Pass- Scrolling up and down performed");
		
		
		//Test-5 Sign-Out from Amazon User Account
		driver.findElementByXPath("//*[@class='hm-icon nav-sprite']").click();
		js.executeScript("window.scrollBy(0,9000)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign Out")));
		driver.findElementByLinkText("Sign Out").click();
		System.out.println("Test-5 Pass- Sign Out from Amazon");
			
		driver.close();
	}

}
