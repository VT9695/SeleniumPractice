package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {

		static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		String browser ="firefox";
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "V:\\April2023\\chromedriver.exe");
			 driver = new ChromeDriver();//launch chrome

		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "V://April2023//geckodriver.exe");
			 driver = new FirefoxDriver();
			Thread.sleep(10000);
		}else {
			System.out.println("browser is not right...... "+ browser);
		}
		
		
		driver.get("https://www.google.com");
		String title =driver.getTitle();
		System.out.println("The title of the page is ....."+title);
		
		if(title.equals("Google")) {
			System.out.println("Title matched........pass");
		}else {
			System.out.println("Title not matched.......failed");
		}
		System.out.println(driver.getCurrentUrl());
		driver.close();
		}
	}


