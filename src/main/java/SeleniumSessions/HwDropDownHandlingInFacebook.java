package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HwDropDownHandlingInFacebook {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Cb%7Cfacebook%20create%20account%7C&placement=&creative=589460569870&keyword=facebook%20create%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-12091220328%26loc_physical_ms%3D9040246%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIuMOj7fbI_gIVjYxLBR3E3wRuEAAYASAAEgLrYfD_BwE");
		
		
//		WebElement day = driver.findElement(By.id("day"));
//		WebElement month = driver.findElement(By.id("month"));
//		WebElement year = driver.findElement(By.id("year"));
//		
		
//		Select select = new Select(day);
//		select.selectByIndex(9);
//		Thread.sleep(2000);
//		select.selectByValue("23");
//		
//		
//		Select select1 = new Select(month);
//		Thread.sleep(2000);
//		select1.selectByIndex(8);
//		
//		Select select2 = new Select(year);
//		select2.selectByIndex(6);
//		Thread.sleep(2000);
//		select2.selectByValue("2002");
		
		//see when using utils method
		//creating locators
		By day  = By.id("day");
		By month = By.id("month");
		By year =By.id("year");
		
		doSelectByIndex(day, 5);
		doSelectByIndex(month, 8);
		doSelectByVisibleText(year, "2022");
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void doSelectByVisibleText(By locator,String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	public static void doSelectByValue(By locator,String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue("India");
	}

}
