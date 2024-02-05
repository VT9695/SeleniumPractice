package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HwOtherLocators {

	 static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		// driver = new ChromeDriver();
		BrowserUtil brUtil = new BrowserUtil();
		
		WebDriver driver =brUtil.lauchBrowser("chrome");
		brUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		By firstName = By.id("input-firstname");
		By lastName = By.xpath("//*[@id=\"input-lastname\"]");
		By Email =By.cssSelector("#input-email");
		By telePhone = By.cssSelector("#input-telephone");
		By passWord = By.xpath("//*[@id=\"input-password\"]");
		By confirmPassword = By.xpath("//*[@id=\"input-confirm\"]");
		By  radioButton = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By checkbox = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		By ContinueButton = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendkeys(firstName, "vaibhav");
		eleUtil.doSendkeys(lastName, "sumbe");
		eleUtil.doSendkeys(Email, "vaibhav123@gmail.com");
		eleUtil.doSendkeys(telePhone, "9909909909");
		eleUtil.doSendkeys(passWord, "1234567890");
		eleUtil.doSendkeys(confirmPassword, "1234567890");
		eleUtil.doClick(radioButton);
		Thread.sleep(2000);
		eleUtil.doClick(checkbox);
		Thread.sleep(6000);
		eleUtil.doClick(ContinueButton);
		
		brUtil.quitBrowser();
		
		
	}

}
