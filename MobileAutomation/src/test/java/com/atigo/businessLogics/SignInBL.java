package com.atigo.businessLogics;


import com.atigo.pages.SignInPage;
import com.atigo.utils.MethodBank;
import com.atigo.utils.startDriver;


public class SignInBL extends startDriver{
	
	SignInPage pageObject =  new SignInPage(adriver);
	MethodBank mb;
	public void SingInWithPhone() {
		mb.clickOnElement(pageObject.getNumberField());
		mb.clickOnElement(pageObject.getNumberField());
		mb.typeOnElement(pageObject.getNumberField(),"8860016031");
		
	}

}
