package com.atigo.businessLogics;

import com.atigo.pages.SignInPage;
import com.atigo.utils.ConfigReader;
import com.atigo.utils.DriverClass;
import com.atigo.utils.MethodBank;

public class SignInBL extends DriverClass {

	SignInPage pageObject = new SignInPage(adriver);
	MethodBank mb = new MethodBank();
	ConfigReader reader;
	
	public void SingInWithPhone() throws Exception{
		reader = new ConfigReader();
		mb.clickOnElement(pageObject.getPhoneNumberSignin());
		mb.clickOnElement(pageObject.getNumberField());
		mb.typeOnElement(pageObject.getNumberField(), reader.getMobNum());
		mb.clickOnElement(pageObject.getOtpButton());
		System.out.println("Please Enter the OTP manually");
		Thread.sleep(15000);
		System.out.println("Hope you have entered the OTP by now");
		mb.pressByElement(pageObject.getVerifyOTP());
	}
	
	public boolean verifyLogin() throws Exception {
		reader = new ConfigReader();
		String actual = mb.getText(pageObject.getHeader());
		boolean flag = mb.CompareText(actual, reader.getHeaderText());
		return flag;
	}

}
