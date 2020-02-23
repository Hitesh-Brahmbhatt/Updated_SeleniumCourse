package seleniumautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OBrowserSelectionTest {

	public static void main(String[] args) {
		
		String browser = "Ankush";
		WebDriver driver;
		
		if(browser=="Chrome") {
			System.setProperty("webdriver.chrome.driver", "C:\\jar files\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
		} else if(browser=="IE") {
			System.setProperty("webdriver.ie.driver", "C:\\jar files\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		} else {
			driver = new FirefoxDriver();
			driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fgp%2Fcss%2Fhomepage.html%3Ffrom%3Dhz%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&ref_=nav_em_hd_clc_signin");
		}
		
	}
		//We can mix match for the browing multiple brower with multiple website while testing.
}


