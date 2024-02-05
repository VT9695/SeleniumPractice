package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//open chrome
		//enter url
		//get the title   >> validation point act vs exp
		//get the url
		//closed the browser
		
		//window machine use backslash \\
		//mac machine one single forward slash / before path 
		
		System.setProperty("webdriver.chrome.driver", "V:\\April2023\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//launch chrome
		driver.get("https://www.google.com/");//launch url //some method not return anything return type void 
		/*
		 * complusary to pas the protocol which is https:
		 *  www. not complusary
		 *  better to right what is the exact url is provided
		 */
		String title=driver.getTitle();//get the title  //this all are the methods
		System.out.println("the page title is :"+ title);//title is coming from server 
				//from line no 21 to 29 are automation steps not automation tests
		
		//validation point or check point(act vs exp)
		
		if(title.equals("Google")) {
			System.out.println("PASS --correct Title");
		}else
			System.out.println("FAIL --incorrect Title");
		
		//Automation steps + validation points = automation testing
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		driver.quit(); //closing browser
		driver.close();
		
		
		
		
		
	}

}
