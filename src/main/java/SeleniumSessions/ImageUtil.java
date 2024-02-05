package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageUtil {

	static WebDriver driver;
	
	/*
	 * you have to get the count of all the images on the page.
	 * then capture the src/alt attributes of each images on the console.
	 */
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=12169394574577687387&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040245&hvtargid=kwd-10573980&hydadcr=14453_2316415");
	
		By images = By.tagName("img");
		By links =By.tagName("a");
		System.out.println(getElementsCount(images));
		List<String>attrList =getAtrributeList(images, "src");
		printElementValues(attrList);
		printElementValues(getAtrributeList(images, "alt"));
		
		printElementValues(getAtrributeList(links, "href"));
		
	}
	
	//utilities
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public  static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<String> getAtrributeList(By locator,String attributeName) {
	List<WebElement>eleList =	getElements(locator);
	List<String>attrList = new ArrayList<String>();


		for(WebElement e :eleList) {
		String attrValue=e.getAttribute(attributeName);
		attrList.add(attrValue);
		}
		return attrList;
	}
	
	public static void printElementValues(List<String>eleList) {
		for(String e :eleList) {
			System.out.println(e);
		}
	}

}
