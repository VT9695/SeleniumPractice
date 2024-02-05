 package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String title=	driver.getTitle();
		System.out.println("The title of the page is : ---"+title);
		if(title.equals("Google")) {
			System.out.println("PASS --correct Title");
		}else
			System.out.println("FAIL --incorrect Title");
		
		
		driver.close();
		
	}

}
