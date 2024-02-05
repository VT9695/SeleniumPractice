package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.gecko.driver", "V://April2023//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String title=	driver.getTitle();
		System.out.println("The title is :"+title);
		
		
		if(title.equals("Google")) {
			System.out.println("PASS ____title matched");
		}else
			System.out.println("FAILED______TITLE not matched");
		
		Thread.sleep(5000);
		
		driver.quit();
			
	}

}
