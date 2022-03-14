package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonMethods {
	
	WebDriver driver;
	
	
	
public CommonMethods(WebDriver driver) {
		super();
		this.driver = driver;
	}



//	public CommonMethods(WebDriver driver) {
//		this.driver = driver;
//	}
	
	public String getTitle () {
		return driver.getTitle();
	}
	
	public void clickOnButton(By btn) {
		driver.findElement(btn).click();
		
	}
	
	public String getText(By element) {
		return driver.findElement(element).getText();
	}
	public void sendText(By element, String value) {
		driver.findElement(element).sendKeys(value);
	}

}
