package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Alert
 * Confirmation pop-up
 * warning//error pop-up
 * Submission pop-up
 * https://mail.rediff.com/cgi-bin/login.cgi URL
 * Model Dialog
 */

public class JsAlertPopUpHandle {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]")).click();
		
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
	String text = 	alert.getText();
	System.out.println(text);
	if(text.equals("Please enter a valid user name")) {
		System.out.println("corect validation message");
	}else
	{
		System.out.println("validation message is not matched");
	}
	
	//alert.accept(); //we are tappping on the accept button   >>>click on ok button
	alert.dismiss();//press esc/click on cancel/dismiss the alert >>
	
	//alert is coming from javascript
	
		
		
	}

}
