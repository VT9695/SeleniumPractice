package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllDropDownValueWithSelectTag {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");
		
	WebElement country=	driver.findElement(By.id("Form_getForm_Country"));
	
	Select select = new Select(country); //in select class constuctor we have pass the webelement
	List<WebElement>countryList=	select.getOptions();
	System.out.println(countryList.size());
	//list is the interface coming from java
	//webelement is coming from selenium
	
	if(countryList.size()-1==232) {
	System.out.println("country count is correct");
	}
	
	
	for(WebElement e :countryList) {
		
	String text=	e.getText();
	if(text.equals("Country")) {
		int count =0;
	System.out.println(count +":::"+ text);
	count++;
		}}
	
	//i have to print their index as well with text
	
//	for(int i=0;i<countryList.size();i++) {
//	String text=	countryList.get(i).getText();
//	System.out.println(i +":::::::::"+text);
//	}
	//both for loop are the same ones but in typical for loop we can print index as well.
	
	
	
	
	
	}

}
