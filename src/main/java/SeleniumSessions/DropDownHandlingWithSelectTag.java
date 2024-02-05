package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlingWithSelectTag {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");
		
//	WebElement country=	driver.findElement(By.id("Form_getForm_Country"));
//	
//	Select select = new Select(country);
//		select.selectByIndex(7);
//		Thread.sleep(6000);
//		select.selectByVisibleText("India");
//		Thread.sleep(6000);
//		select.selectByValue("Hungary");
//		
		//what if there are 100 drodpwn are availble so we have to create genric method
		
	By country=	By.id("Form_getForm_Country");
	doSelectByIndex(country, 17);
	
	doSelectByValue(country, "India");
	
	doSelectByVisibleText(country, "Algeria");
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void doSelectByVisibleText(By locator,String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	public static void doSelectByValue(By locator,String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue("India");
	}
}
