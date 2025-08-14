package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base {
	public void verifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealert=driver.findElement(By.id("alertButton"));
		simplealert.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
public void verifyConfirmAlert() {
	driver.navigate().to("https://demoqa.com/alerts");
	WebElement confirmbutton=driver.findElement(By.id("confirmButton"));
	confirmbutton.click();
	Alert alert=driver.switchTo().alert();
	//alert.accept();
	alert.dismiss();
	
}


public static void main(String[] args) {
	HandlingAlerts handlingalerts=new HandlingAlerts();
	handlingalerts.initializeBrowser();
	handlingalerts.verifySimpleAlert();
	handlingalerts.verifyConfirmAlert();
}
}