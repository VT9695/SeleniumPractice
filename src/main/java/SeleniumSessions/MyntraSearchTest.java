package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraSearchTest {

	static WebDriver driver;		
	public static void main(String[] args) throws InterruptedException {


			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");		
				driver.findElement(By.id("APjFqb")).sendKeys("book");
				
				Thread.sleep(5000);
				
				
	List<WebElement>suggList =driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//div[@class='wM6W7d']/span"));
	System.out.println(suggList.size());
	
	for(WebElement e :suggList) {
		String text=	e.getText();
		System.out.println(text);
		
			if(text.equals("bookmyshow nagpur")) {
				e.click();
				break;
			}
			
	}
	driver.findElement(By.linkText("Movies")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='sc-jTzLTM sc-jHXLhC jqQqJt']/span[@class='sc-cNQqM jeHgTG']")).click();
		
	}

}
