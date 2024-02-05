package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	public  WebDriver driver ;
	
	
	/**
	 * this method is used to launch the browser on the basis of given browser name
	 * @param browser
	 * @return
	 */
	public WebDriver lauchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "V:\\April2023\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();//launch chrome
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "V://April2023//geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("browser is not right...... "+ browser);
		}
	
	return driver;
   }
	
	/**
	 * This method is used to enter the URL
	 * @param url
	 */
	public void enterUrl(String url) {
		if(url==null) {	
			System.out.println("URL is null");
			return;
		}
		if(url.indexOf("http")== -1){
			System.out.println("http is missing in the URL");
			return;
		}
		driver.get(url);
	}
	
	
	
	/**
	 * This method will return current page url
	 * @return
	 */
	public String getAppCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	
	/**
	 * This method is returning the  page title
	 * @return
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	/**
	 * This method is used to closed the browser
	 */
	public void closedBrowser() {
		
		 driver.close();
	}
	
	/**
	 * This method is used to quit the browser
	 */
	public void quitBrowser() {
	driver.quit();
		}
	
	}
	

