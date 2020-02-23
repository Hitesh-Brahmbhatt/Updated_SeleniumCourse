package seleniumautomation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VRadioButtonTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		List<WebElement> grp1button = driver.findElementsByName("group1");
		System.out.println("Size of group1 is " + grp1button.size());
		System.out.println(grp1button.get(0).isSelected());//to check the selection of radio button by default.
		
		//Assignment::-
		driver.get("http://echoecho.com/htmlforms10.htm");
		List<WebElement> grp2button = driver.findElementsByName("group2");
		
		/*int i;
		for (i=0; i<grp2button.size(); i++) {
				if (grp2button.get(i).isSelected()) {
				System.out.println((grp2button.get(i).getAttribute("value"))+ ("---" + grp2button.get(i).isSelected()));
				
				}*/
			grp2button.get(1).click();
			
			int i;
			for (i=0; i<grp2button.size(); i++) {
					if (grp2button.get(i).isSelected()) {
					System.out.println((grp2button.get(i).getAttribute("value"))+ ("---" + grp2button.get(i).isSelected()));
					
					}
		//Assignment = Rahul Shetty's URL.
					
		}	
		
		 
		
		driver.close();
	}

}
