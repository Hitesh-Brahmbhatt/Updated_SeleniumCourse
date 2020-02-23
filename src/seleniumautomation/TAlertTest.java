package seleniumautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TAlertTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElementByXPath("//*[@name='enter-name']").sendKeys("Ankush");
		driver.findElementByXPath("//*[@value='Confirm']").click();
		Alert alertmsg = driver.switchTo().alert();
		System.out.println("Alert message is " + alertmsg.getText());
		//alertmsg.accept();//accepts clicks what is selected by default, e.g. OK 
		alertmsg.dismiss();//dismiss method select the non selected value, e.g CancelSS
		
		//driver.close();
	}

}
