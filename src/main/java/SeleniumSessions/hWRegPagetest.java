package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class hWRegPagetest {

	public static void main(String[] args) throws InterruptedException {


		BrowserUtil util= new BrowserUtil();
		WebDriver driver=util.lauchBrowser("chrome");
		util.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title=	util.getPageTitle();
		System.out.println(title);
		
		
		
		
			
		By firstname =	By.id("input-firstname");
		By lastName =By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword =By.id("input-confirm");
		
		
		String firstnameId ="input-firstname";
		String lastNameId ="input-lastname";
		String emailId ="input-email";
		String telephoneId ="input-telephone";
		String passwordId ="input-password";
		String confirmpasswordId="input-confirm";
		
		
		ElementUtil elutil= new ElementUtil(driver);
//		elutil.doSendkeys(firstname, "vaibhav");
//		elutil.doSendkeys(lastName, "sumbe");
//		elutil.doSendkeys(email, "vaibhav@gmail.com");
//		elutil.doSendkeys(telephone, "12345666");
//		elutil.doSendkeys(password, "xyz");
//		elutil.doSendkeys(confirmPassword, "xyz");
		
		elutil.doSendkeys("id", firstnameId, "yyyy");
		elutil.doSendkeys("id", lastNameId, "77778887877");
		elutil.doSendkeys("id", emailId, "confirmpasswordId");
		elutil.doSendkeys("id", telephoneId, "6767676767676767");
		elutil.doSendkeys("id", passwordId, "676767673");
		elutil.doSendkeys("id", confirmpasswordId, "7676776676");
		
		Thread.sleep(4000);
		util.quitBrowser();
		
	}

}
