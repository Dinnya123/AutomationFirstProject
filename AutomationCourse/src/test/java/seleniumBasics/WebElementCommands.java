package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	
	public void handlingElements() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		msgBox.sendKeys("Dinnya");
		WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
		button.click();
		System.out.println(button.isDisplayed());
		System.out.println(button.isEnabled());
		
		
		WebElement message=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(message.getText());
		msgBox.clear();
		
		System.out.println(button.getCssValue("background-color"));
		
		WebElement value=driver.findElement(By.id("value-a"));
		System.out.println(value.getTagName());
	}
	
	public static void main (String[] args) {
		WebElementCommands webElement = new WebElementCommands();
		webElement.initializeBrowser();
		webElement.handlingElements();
	}

}
