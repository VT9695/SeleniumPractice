package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("mukesh ambani");
		
		
		Thread.sleep(5000);

	List<WebElement>suggList =	driver.findElements(By.xpath("//div[@class='erkvQe']//ul[@jsname='bw4e9b']/li//div[@class='wM6W7d']//span"));
		
		System.out.println(suggList.size());
		
		for(WebElement e :suggList) {
			String text =e.getText();
			System.out.println(text);
			
			if(text.equals("mukesh ambani children")) {
				e.click();
				break;	
			}
		}
	}

}
