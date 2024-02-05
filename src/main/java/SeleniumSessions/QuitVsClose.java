package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {

		
		//session id 
		

		System.setProperty("webdriver.chrome.driver", "V:\\April2023\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//launch chrome
		driver.get("https://www.google.com/");//launch url //some method not return anything return type void 
		String title=  driver.getTitle();//get the title  //this all are the methods
		System.out.println("the page title is :"+ title);
		
		//driver.close();
		driver.quit();
		System.out.println(driver.getTitle());
		//NoSuchSessionException: invalid session id this exception getting
		//we can avoid this by calling WD driver = new CD() after line no 21
		
		//driver.quit();
		//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	}

}
