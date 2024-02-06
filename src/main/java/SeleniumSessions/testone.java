package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testone {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1. create the webelemets +perform the
		// actions(sendkeys,gettext,idDisplayed,isEnabled

		// 1.id
//		driver.findElement(By.id("input-email")).sendKeys("vaihav@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("vaibhav");
//		
		// 2
//		WebElement emailId=	driver.findElement(By.id("input-email"));
//		WebElement password=	driver.findElement(By.id("input-password"));
//		emailId.sendKeys("test@gmail.com");
//		password.sendKeys("passeod");
//		

		// 3rd By locator

//		By username =By.id("input-email");
//		By password	=By.id("input-password");
//		
//		WebElement emailId=	driver.findElement(username) ;
//		WebElement pwd=	driver.findElement(password) ;
//		
//		emailId.sendKeys("tst@123");
//		pwd.sendKeys("45666");

		// 4th
//		By username =By.id("input-email");
//		By password	=By.id("input-password");
//		getElements(username).sendKeys("tet@gmai;.com");
//		getElements(password).sendKeys("1234");
//		}
//	public static WebElement getElements(By locator) {
//		return driver.findElement(locator);

		// 5th BY locator with generic method (getElement() with action method)

//		By username =By.id("input-email");
//		By pass =    By.id("input-password");
//		doSendkeys(username, " @123");
//		doSendkeys(pass, "345666");
//		
//	}

//		public static WebElement getElements(By locator) {
//			return driver.findElement(locator);
//		}
//			
//		public static void doSendkeys(By locator,String value) {
//			getElements(locator).sendKeys(value);
//			}

		// 6 Generic class ElementUtil class with generic methods so we can use all the
		// method ovr the projects
//		
//		By username =By.id("input-email");
//		By pass =    By.id("input-password");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendkeys(username, "56777");
//		eleUtil.doSendkeys(pass, "EEEEEE");
//		

		// 7Th String locator values

		String userNameId = "input-email";
		String passId = "input-password";

		doSendkeys("id", userNameId, "yetstete@gmail.com");
		doSendkeys("id", passId, "navven2123");

	}

	public static By getBy(String locatorType, String locatorValue) {
		By locator = null;

		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;

		default:
			System.out.println("please pass the right locator type & value ......");
			break;
		}
		return locator;
	}

	public static WebElement getElements(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement getElements(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType, locatorValue));
	}

	public static void doSendkeys(By locator, String value) {
		getElements(locator).sendKeys(value);
	}

	public static void doSendkeys(String locatorType, String locatorValue, String value) {
		getElements(locatorType, locatorValue).sendKeys(value);
	}

}
