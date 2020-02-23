package seleniumautomation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class YDragAndDrop {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement Draggable = driver.findElementById("draggable");
		WebElement Droppable = driver.findElementById("droppable");
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(Draggable, Droppable).build().perform();
		
		//driver.close();
	}

}
