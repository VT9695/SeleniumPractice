package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		//you have to get the count of all the link/images on the page.
		//then print the text of each link on the console
		//avoid blank text 
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();	
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=12169394574577687387&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040245&hvtargid=kwd-10573980&hydadcr=14453_2316415");
		
		List<WebElement>linkslist =	driver.findElements(By.tagName("a"));
		
		System.out.println("total links "+ linkslist.size());
		
		//typical for loop
//		for(int i=0;i<linkslist.size();i++) {
//		String text=	linkslist.get(i).getText();
//		
//		if(!text.isEmpty()) {
//			System.out.println(text);
//		}
//		}
		
		
		
		//for each loop 
		for(WebElement e :linkslist) {
		String text =	e.getText();
		if(!text.isEmpty()) {
		System.out.println(text);
		}
		}
	}

}
