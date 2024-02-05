package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageCount {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=12169394574577687387&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040245&hvtargid=kwd-10573980&hydadcr=14453_2316415");

		//you have to get the count of all the images on the page.
		//then print the src/alt attribute of each image  on the console
		//html tag of image is img
		//src is the attribute seems where the image is comming actually 
		
	//List<WebElement>imageList =	driver.findElements(By.tagName("img"));
		//no need to write if we have an generic methid
		
		By images = By.tagName("img");
		List<WebElement>imageList =getElements(images);
		
		System.out.println(imageList.size());
	
	
	for(WebElement e :imageList) {
			String altValue=	e.getAttribute("alt");
			String srcValue= 	e.getAttribute("src");
			System.out.println(altValue +" ---------->  "+srcValue);
	}
	//we need to create findElement genric methid
	
		
	}
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
