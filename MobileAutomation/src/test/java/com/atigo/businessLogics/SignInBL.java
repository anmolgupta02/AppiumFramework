package com.atigo.businessLogics;

import com.atigo.pages.SignInPage;
import com.atigo.utils.ConfigReader;
import com.atigo.utils.DriverClass;
import com.atigo.utils.MethodBank;

public class SignInBL extends DriverClass {

	SignInPage pageObject = new SignInPage(adriver);
	MethodBank mb;
	ConfigReader reader;

	public void SingInWithPhone() throws Exception{
		mb = new MethodBank();
		reader = new ConfigReader();
		mb.clickOnElement(pageObject.getPhoneNumberSignin());
		mb.clickOnElement(pageObject.getNumberField());
		mb.typeOnElement(pageObject.getNumberField(), reader.getMobNum());
		mb.clickOnElement(pageObject.getOtpButton());
	}

}
