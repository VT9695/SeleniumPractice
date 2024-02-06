package SeleniumSessions;

public class Test {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		br.lauchBrowser("chrome");
		br.enterUrl("https://www.amazon.com");
		String title = br.getPageTitle();
		System.out.println("title is ...." + title);

		if (title.contains("Amazon.com. Spend less. Smile more.")) {
			System.out.println("Matched -----Title");
		} else
			System.out.println("Title is not matched");

		// new line added
	}

}
