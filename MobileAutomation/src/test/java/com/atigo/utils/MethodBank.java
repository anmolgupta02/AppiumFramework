package com.atigo.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;

public class MethodBank extends DriverClass {

	public void clickOnElement(WebElement numberField) {
		numberField.click();
	}

	public void typeOnElement(WebElement textField, String text) {
		textField.sendKeys(text);
	}

	public String getText(WebElement elementTobeRead) {
		return elementTobeRead.getText();
	}

	public boolean CompareText(String actual, String expected) {

		if (!expected.equalsIgnoreCase(actual))
			return false;
		else
			return true;
	}

	public void acceptPermission() {
		WebElement allowButton = adriver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
		this.clickOnElement(allowButton);
	}
	
	public void handleClicks(WebElement element) {

		Actions actions = new Actions(adriver);
		actions.moveToElement(element).click().build().perform();
	}
	
	public void pressByElement (WebElement element) {
        
		
    }
	
}
