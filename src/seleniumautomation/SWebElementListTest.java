package seleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SWebElementListTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//Find all elements by tagname a and store in one variable.
		
		/*driver.findElementsByTagName("a");
		List<WebElement> alllinks = driver.findElementsByTagName("a");
		System.out.println("Number of links on page are " + alllinks.size());
		
		//Names of all the 22 links on console::- Use for loop, get text method
		
		for (int i=0; i<alllinks.size(); i++) {
			System.out.println("Name of link is "  + alllinks.get(i).getText());
		}*/
		
		//Footer last three names of footer links::-
		
		/*WebElement Footer = driver.findElementByXPath("//*[@id='fsl']");
		List<WebElement> Links = Footer.findElements(By.tagName("a"));
		System.out.println("Size of Links is " + Links.size());
		
		for (int i=0; i<Links.size(); i++) {
			System.out.println("Name of link is "  + Links.get(i).getText());
		}*/
		
		// Footer Clicking 2nd link for the Footer.
		
		WebElement Footer = driver.findElementByXPath("//*[@id='fsl']");
		List<WebElement> Links = Footer.findElements(By.tagName("a"));
		
		
		driver.close();

	}

}
