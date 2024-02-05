package SeleniumSessions;

public class RediffmailTest {

	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		br.lauchBrowser("chrome");
		br.enterUrl("https://www.rediff.com");
		String title =	br.getPageTitle();
		System.out.println("title is ...."+title);
		
		if(title.contains("Amazon.com. Spend less. Smile more.")) {
			System.out.println("Matched -----Title");
		}else
			System.out.println("Title is not matched");
		
		String url=	br.getAppCurrentUrl();
		System.out.println("the URL of the page is ----"+url);
		br.quitBrowser();
	}
		
	}


