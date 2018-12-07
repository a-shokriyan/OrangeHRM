package com.orangehrm.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods extends BaseClass{
	
	
	public static void enterValue (WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	public static void clickLink(String linkText ) {
		driver.findElement(By.linkText(linkText)).click();
		
	}
	public static void doClick(WebElement element) {
		element.click();
	}
	
	public static void selectValue (WebElement element, String value) {
		Select obj = new Select(element);
		obj.selectByVisibleText(value);
	}

}
