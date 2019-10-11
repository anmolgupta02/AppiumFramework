package com.atigo.utils;

import org.openqa.selenium.WebElement;

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
	

}
