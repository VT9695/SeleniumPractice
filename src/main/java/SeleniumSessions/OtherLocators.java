package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OtherLocators {
	static WebDriver driver;
	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		//driver.get("https://classic.freecrm.com/");
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		//1. 1st preference to the id (its an unique attribute
		
		//between id & name alwasys prefer id
		
		//2. name 
		
		
		//driver.findElement(By.name("username")).sendKeys("vaibhav");
		//driver.findElement(By.name("password")).sendKeys("pass");
		
		
		//we can use by locator startegy 
		
//		By name = By.name("username");
//		By pass = By.name("password");
		
		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendkeys(name, "vaibhav");
//		eleUtil.doSendkeys(pass, "1234555");
		
		//the element Util methods are applicab;e for all locators (id,name,xpath etc);
		
		
		//3rd  className :
		/*
		 * class name ia always an attribute but its not unique 
		 * Its not mandatory & its not  unique
		 * we can have same class for the different elements
		 */
		//driver.findElement(By.className(""))
		//selenium coming inside the DOM and keep checking & the moment its finding the 1st form contorl or any elemnts 
		//Immediately it enter the value there
		//class name can be use with CSS selector ,Xpath as well.
		
		
		//4. xpath:its not an attribute
		
		/*
		 * 
		 * This is the address of the element inside the HTML DOM.
		 * we have to use attributes to create the xpath.
			started form the top node and checking each and every element .
			inspect element on Dom right click and copy xpath
		 */
		
		//*[@id="input-email"]  >>> relative xpath
		
		
		
		//inspect element on Dom right click and copy full xpath
		
		//   /html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input >> absolute xpath
		
		//problem:- if div position is changes  
		//we will never use absolute xpath there are varies ways to create xpath
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("gamil.com");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("2345");
		
		
		//we can use by locator startegy
		
//		By username =By.xpath("//*[@id=\"input-email\"]");
//		By pass = By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input");
//		
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendkeys(username, "vaibhavsykjev jje");
//		eleUtil.doSendkeys(pass, "1234455");
		
		//id,name,className,xpath >> which one prefer 
		//always go for Id we cannot compare id & xpath because xpath is not an atribute
		
		
		//5th   :  cssSelector
		
		/*
		 * cssSlector is also not an attribute
		 * We have to use attribute to create the cssSelector
		 * inspect element >> on DOM right click for the higlight line >>copy>>Copy selector.
		 */
		
		//driver.findElement(By.cssSelector("#input-email")).sendKeys("566777");
		
		//shall i compare xpath with cssSelector... ?
		//..
		
		//here also we can use by locator strategy
		
//		By username =By.cssSelector("#input-email");
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendkeys(username, "vaibhavsykjev jje");
		
		
		
		/*
		 * 6th   linkText : only for the links,but its not an attribute
		 * text of the link
		 * html tag =a
		 * html tag of link i always a 
		 * can we comapre id with linktext ?? >>no most of the time text of link is always unique
		 */
		
		//driver.findElement(By.linkText("Register")).click();//copy the text fo the link for which u have to interact
		
		//what should be prefer id or text >>> ID 
		//most of the links  id is not availble
		
		//generic method for click method
//	By registerLink=	By.linkText("Register");
//		doClick(registerLink);
//		
		
		
		
		/*7th : partialLinkText :
		 * only for links , but not for attribute
		 * partial text of the link
		 * html tag =a;
		 * very very worst case
		 */
		
		//driver.findElement(By.partialLinkText("My Acco")).click();
		
		
		
		
		//8th tagname:html tag of the element
		
		
		//we always having h1 is unique
		//basics of the HTML having h1,h2,h3,h4,h5 h1 having bigger then smaller smaller smaller.
		//first header in h1 tag
//	String header =	driver.findElement(By.tagName("h3")).getText();
//	System.out.println(header);
//			if(header.contains("Featured")) {
//				System.out.println("headeer matched");
//			}else
//			{
//				System.out.println("header not matched");
//			}
		//no need to write 150 to 157 lines direct use generic methood from 172 to 173
		//and called directly by creating by locator
			//we can use getText with links,Headers, any kind of label ,warning message
	By header=	By .tagName("h3");
	if(doGetText(header).contains("Featured")) {
		System.out.println("headeer matched");
	};
	}
	
	//hw >> register form with diff locator startegy click on all tap on continue only use elemnt util class 
	//for the rough work we are using static method bcuse we can called directly 
	// but for realtime we move all the element method to elemntsutil class by removing static keyword
	public static WebElement getElements(By locator) {
		return driver.findElement(locator);
	}
//	
//	public static void doClick(By locator) {
//		getElement(locator).click();
//	}
	
	public static String doGetText(By locator) {
		return getElements(locator).getText();
	}
	
	

}
