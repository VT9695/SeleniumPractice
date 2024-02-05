package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributeConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
//	String hrefValue=	driver.findElement(By.linkText("Careers")).getAttribute("href");
//		System.out.println(hrefValue);
		//we can create some utilities to avoid the hardcoded values like above 
		
		
		By carreerLink = By.linkText("Careers");
	String hrefVal =	getAttributevalue(carreerLink, "href");
	if(hrefVal.contains("http://www.amazon.jobs")) {
		System.out.println("this is corect href");
	}
		
	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	public static String getAttributevalue(By locator,String attrName) {
		String attrVal =getElement(locator).getAttribute(attrName);
		System.out.println(attrVal);
		return attrVal;
	}
	//move the utilities to the emenet utils

}
