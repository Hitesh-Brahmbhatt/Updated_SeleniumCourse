package seleniumautomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PMultipleWindowsTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElementByXPath("//*[@class='btn-style class1']").click();
		
		Set<String> AllWindows = driver.getWindowHandles();
		System.out.println("Number of Windows Open " + AllWindows.size());
		
		Iterator<String> Iter = AllWindows.iterator();
		
		
		String MainWindow = Iter.next();
		String ChildWindow = Iter.next();
		
		driver.switchTo().window(MainWindow);
		System.out.println("First Title is " + driver.getTitle());
		
		driver.switchTo().window(ChildWindow);
		System.out.println("Second Title is " + driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Courses")));
		driver.findElementByLinkText("Courses").click();
	
		
		driver.switchTo().window(MainWindow);
		System.out.println("First Title is " + driver.getTitle());
	}

}
