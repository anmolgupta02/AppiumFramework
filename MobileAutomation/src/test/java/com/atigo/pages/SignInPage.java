package com.atigo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.atigo.utils.startDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignInPage extends startDriver {
	
	public SignInPage(AppiumDriver<WebElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(adriver), this);
	}
	
	@AndroidFindBy(id = "com.android.atigo:id/SignIn_txt")
	private WebElement phoneNumberSignin;
	
	@AndroidFindBy(id = "com.android.atigo:id/SignIn_Phone")
	private WebElement GoogleSignIn;
	
	@AndroidFindBy(id = "com.android.atigo:id/verify_phone_et")
	private WebElement numberField;
	
	@AndroidFindBy(id = "com.android.atigo:id/verify_phone_next_tv")
	private WebElement otpButton;

	public WebElement getPhoneNumberSignin() {
		return phoneNumberSignin;
	}

	public WebElement getGoogleSignIn() {
		return GoogleSignIn;
	}

	public WebElement getNumberField() {
		return numberField;
	}

	public WebElement getOtpButton() {
		return otpButton;
	}

}
