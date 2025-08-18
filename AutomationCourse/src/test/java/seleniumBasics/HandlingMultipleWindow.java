package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindow extends Base {
	
	
	public void verifyMutipleWindow() {
		
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstWindowHandle=driver.getWindowHandle();
		System.out.println(firstWindowHandle);
		WebElement clickhere=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhere.click();
		
		Set<String> handleIds=driver.getWindowHandles();
		System.out.println(handleIds);
		
		Iterator<String> it=handleIds.iterator();
		while(it.hasNext())
		{
			String currentId=it.next();
			if(!currentId.equals(firstWindowHandle))
			{
				driver.switchTo().window(currentId);
				WebElement email=driver.findElement(By.name("emailid"));
				email.sendKeys("dinnyamol@gmail.com");
				WebElement submit=driver.findElement(By.name("btnLogin"));
				submit.click();
				
			}
		}
	}
	
	public static void main( String[]args) {
		HandlingMultipleWindow window=new HandlingMultipleWindow();
		window.initializeBrowser();
		window.verifyMutipleWindow();
		
		
	}

}
