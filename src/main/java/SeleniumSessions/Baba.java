package SeleniumSessions;

public class Baba {

	public static void main(String[] args) {
 
		int i=10;
		System.out.println("i is"+i);
		
		BrowserUtil br = new BrowserUtil();
		br.lauchBrowser("chrome");
		br.enterUrl("https://www.amazon.com");
		String title =	br.getPageTitle();
		System.out.println("title is ...."+title);
		
		if(title.contains("Amazon.com. Spend less. Smile more.")) {
			System.out.println("Matched -----Title");
		}else
			System.out.println("Title is not matched");
		
		String url=	br.getAppCurrentUrl();
		System.out.println("the URL of the page is ----"+url);
		br.quitBrowser();
		//new line added
	}

}
