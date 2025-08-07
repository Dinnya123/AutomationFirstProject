package seleniumBasics;

public class BrowserCommands extends Base {
	public void handlingbrowsercommands()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String url =driver.getCurrentUrl();
		System.out.println(url);
		String handleId=driver.getWindowHandle();
		System.out.println(handleId);
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
	}
	 public void navigationCommands()
	 {
		 driver.navigate().to("https://www.amazon.in/");
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
	 }
	public static void main(String[] args)
	{
		BrowserCommands browser=new BrowserCommands();
		browser.initializeBrowser();
		//browser.handlingbrowsercommands();
		browser.navigationCommands();
	}

}
