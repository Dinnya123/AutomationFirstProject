package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	public void verifyFrames() {
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement>totalframe=driver.findElements(By.tagName("iframe"));
		System.out.println(totalframe.size());
		WebElement samplepage=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(samplepage);
		WebElement frameheading=driver.findElement(By.id("sampleHeading"));
		System.out.println(frameheading.getText());
		driver.switchTo().defaultContent();
	}
public static void main (String[] args) {
	HandlingFrames frames=new HandlingFrames();
	frames.initializeBrowser();
	frames.verifyFrames();
	
}
}
