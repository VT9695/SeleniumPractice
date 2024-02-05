package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {

		/**
		 * Headless
		 * no browser launch(not visible) /hidden browser
		 * testing is happening behind the scene
		 * fatser
		 */
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--headless");
//		co.addArguments("--incognito");
//		WebDriver driver = new ChromeDriver(co);
		
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions fo = new FirefoxOptions();
		//fo.addArguments("--headless");
		fo.addArguments("--incognito");
		WebDriver driver = new FirefoxDriver(fo);
		
		
		
		
		
		
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
	}

}
