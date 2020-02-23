package seleniumautomation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XFrameTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> resize = driver.findElementsByLinkText("Resizable");
		System.out.println("Resizable is " + resize.size()); //In Frame hence size 1
					
		List<WebElement> drag = driver.findElementsById("draggable");
		System.out.println("Draggable is " + drag.size()); //Out of frame hence size 0
		
		/*WebElement frameTest = driver.findElementByClassName("demo-frame");
		
		driver.switchTo().frame(frameTest);*/
		
		//OR
		
		driver.switchTo().frame(0);
		
		List<WebElement> resize1 = driver.findElementsByLinkText("Resizable");
		System.out.println("Resizable1 is " + resize1.size()); //Out of frame hence size 0
					
		List<WebElement> drag1 = driver.findElementsById("draggable");
		System.out.println("Draggable1 is " + drag1.size()); //In Frame hence size 1
		
		driver.switchTo().defaultContent();
		
		List<WebElement> resize2 = driver.findElementsByLinkText("Resizable");
		System.out.println("Resizable2 is " + resize2.size()); //In Frame hence size 1
					
		List<WebElement> drag2 = driver.findElementsById("draggable");
		System.out.println("Draggable2 is " + drag2.size()); //Out of frame hence size 0
		
		driver.close();

	}

}
