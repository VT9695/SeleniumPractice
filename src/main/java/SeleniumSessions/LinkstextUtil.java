package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkstextUtil {

	
static WebDriver driver;
	//you have to get the count of all the links /images on the page
//return a list <string> ---> this will holds the text of each link
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=12169394574577687387&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040245&hvtargid=kwd-10573980&hydadcr=14453_2316415");		
		By links = By.tagName("a");
		//List<WebElement>linksList =getElements(links); no need if generic methid have created
	System.out.println(getElementsCount(links));
	
	List<String> actList=getElementsTextList(links);
//	for(String e:actList) {
//		System.out.println(e);
//	}
	if(getElementsTextList(links).contains("Prime Now")) {
		System.out.println("prime now link is present");
	};
		
	}
	
	public static List<String> getElementsTextList(By locator) {
		List<WebElement>eleList=getElements(locator);
		List<String>eleTextList = new ArrayList<String>();
		for(WebElement e :eleList) {
		String eleText=	e.getText();
			if(!eleText.isEmpty()) {
				eleTextList.add(eleText);
			}
		}
		return eleTextList;
	}
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

}
