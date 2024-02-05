package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownvalueWithoutSelectclass {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");
				
		
		/*
		 * Creat Xpath first then + genric method
		 */
		
			By countryOptions=	By.xpath("//select[@id=\"Form_getForm_Country\"]/option");
			
			
			selectDropDownValueWithoutSelect(countryOptions, "India");
		}
	
	public static void selectDropDownValueWithoutSelect(By locator,String value) {
		
			List<WebElement>countryList=driver.findElements(locator);
			System.out.println(countryList.size());
			
			for(WebElement e :countryList) {
				String text=	e.getText();
				if(text.equals(value)) {
				e.click();
				break;}
			}
			
	}

	
	
}
