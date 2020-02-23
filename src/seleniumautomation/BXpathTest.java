package seleniumautomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BXpathTest {

	public static void main(String[] args) throws InterruptedException{
		
		FirefoxDriver driver = new FirefoxDriver();
		/*driver.get("https://www.facebook.com/r.php");
		driver.findElementByName("firstname").clear();
		driver.findElementByName("firstname").sendKeys("Ankush123");
		driver.findElementByName("lastname").sendKeys("Patil08");
		driver.findElementByXPath("(//*[@type='text'])[3]").sendKeys("123456");
		driver.findElementByXPath("//*[@data-type='password']").sendKeys("Ankush001");
		driver.findElementByXPath("(//*[@type='radio'])[2]").click();
		System.out.println(driver.getTitle());
		driver.findElementByXPath("(//*[@type=\"submit\"])[3]").click();
		Thread.sleep(2000);
		System.out.println(driver.findElementByXPath("//*[@id=\"globalContainer\"]/div[6]/div/div").getText());*/
		//PRACTICE ::-
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		driver.findElementById("usernamereg-firstName").sendKeys("Ankush123");
		driver.findElementByClassName("ureg-lname").sendKeys("Pat");
		driver.findElementByName("yid").sendKeys("Ankupat123pat");
		driver.findElementByXPath("//*[@type='password']").sendKeys("Anything@123");
		//System.out.println(driver.findElementByClassName("oneid-error-message"));
		driver.findElementByXPath("//*[@type='select']").equals("India(+91)");
		driver.findElementByXPath("(//*[@type='tel'])[1]").sendKeys("123456");
		
		//Xpath Syntax ::-
		//Syntax :- //TagName OR *[@Attribute Name = 'Attribute Value']
		//Syntax for Multiple values :- (//TagName OR*[@Attribute Name = 'Attribute Value'])[number]
		
		//CSS Syntax ::-
		//Syntax :- //TagName OR *[Attribute Name = 'Attribute Value']
	
		//driver.close();
	}
}
