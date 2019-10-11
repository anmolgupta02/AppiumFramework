package com.atigo.utils;

import org.openqa.selenium.WebElement;

public class MethodBank extends startDriver {

	public void clickOnElement(WebElement numberField) {
		numberField.click();
	}

	public void typeOnElement(WebElement textField, String text) {
		textField.sendKeys(text);
	}
	
}
