package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeMyntra {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "V://April2023//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=EAIaIQobChMIqfedgv-v_gIVsJNmAh0CAwumEAAYASAAEgJu3vD_BwE");
		
		String title =driver.getTitle();
		System.out.println("the Title of the page is :" +title);
		
		System.out.println(driver.getCurrentUrl());
		
		if(title.equals("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra")) {
			System.out.println("PASS ---title is matched");
		}else
			System.out.println("FAILED -- TITLE IS not matched");
		
		driver.quit();
		//driver.close();
		
	}
	
	

}
