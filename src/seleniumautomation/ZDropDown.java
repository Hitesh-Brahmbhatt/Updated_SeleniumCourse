package seleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ZDropDown {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		WebElement All = driver.findElementById("searchDropdownBox");
		/*List<WebElement> Alldept = All.findElements(By.tagName("option"));
		System.out.println("No. of Dept. " + Alldept.size());
		All.sendKeys("Baby");*/
		
		Select sel = new Select(All);
		sel.selectByIndex(2);
		sel.selectByValue("search-alias=stripbooks-intl-ship");
		
		//driver.close();
	}

}
