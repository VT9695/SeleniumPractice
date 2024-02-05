package SeleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverCastings {

	public static void main(String[] args) {

		
		//1. WD -- CD 
		
		
		//WebDriver driver = new ChromeDriver();
				//we can access all the method which are coming from webdriver
		
		
		//2 CD -- CD
		
		//ChromeDriver driver = new ChromeDriver();
		//we can access method from chromdriver only
		
		
		//3. RWD --CD
		
		
		//	RemoteWebDriver driver = new ChromeDriver();
		//child class object can be refer by parent class reference  variable
		//all the methods we can access 
		//according to java standards do top casting with parent interface only
		
		
		
		
		
		
		//4  WD---RWD    remote --machine/server/vm/docker/cloud		
		//	WebDriver driver = new RemoteWebDriver(null, null);
		
		
		
		
		//5.  SC --CD
		
		//SearchContext driver = new ChromeDriver();
		//we can access only 2 methods findElement and findElements
		//Remote refrenece Type check :-
		//Parent interface cannot  access the individual methods of RemoteWebDriver
		
		
		
		//6 SC -- RWD
		
	//	SearchContext driver = new RemoteWebDriver(new RemoteWebDriver(null, null));
		
		//never do this top casting
		
		
		
		
		
		
		
		
	}

}
