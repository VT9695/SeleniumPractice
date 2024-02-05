package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisplayed {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
	
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
		By firstname =By.id("input-firstname");
//		boolean flag =	driver.findElement(firstname).isDisplayed();
//		System.out.println(flag);
		
		//but same thing for isDisplayed method what if i want to verify 100 elements 
		//we need to create an genric method
		
	if(	doIsDisplayed(firstname)) {
		
		System.out.println("Element is displayed");
	};
		
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	//moving this utility to element utils

}
