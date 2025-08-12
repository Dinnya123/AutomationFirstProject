package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {
	
	public void handlingDropDown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(dropdown);
		//select.selectByIndex(3);
		//select.selectByValue("sql");
		select.selectByVisibleText("Python");
		
	}
	
	public void handlingCheckBox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox=driver.findElement(By.xpath("//input[@value='option-2']"));
		System.out.println(checkbox.isSelected());
        checkbox.click();
		System.out.println(checkbox.isSelected());
	}
	public void handlingRadiobutton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio=driver.findElement(By.xpath("//input[@value='orange']"));
		radio.click();

		
	}
		
	public static void main(String [] args) {
	HandlingDropDown drop=new HandlingDropDown();
	drop.initializeBrowser();
	drop.handlingDropDown();
	drop.handlingCheckBox();
	drop.handlingRadiobutton();
	
	}
}
