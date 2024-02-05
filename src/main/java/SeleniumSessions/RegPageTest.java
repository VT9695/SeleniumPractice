package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) throws InterruptedException {


		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver =brUtil.lauchBrowser("chrome");
		brUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title=	brUtil.getPageTitle();
		System.out.println(title);
		
		
		
		By firstname =By.id("input-firstname");
		By lastName =By.id("input-lastname");
		By email =By.id("input-email");
		
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendkeys(firstname, "yyy");
		elUtil.doSendkeys(lastName, "zzzzzz");
		elUtil.doSendkeys(email, "Test@gamil.com");
			
			Thread.sleep(5000);
			
		brUtil.closedBrowser();
			
	
	}

}
