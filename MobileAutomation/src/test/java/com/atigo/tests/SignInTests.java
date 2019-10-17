package com.atigo.tests;

import org.testng.annotations.Test;

import com.atigo.businessLogics.SignInBL;
import com.atigo.utils.DriverClass;

public class SignInTests extends DriverClass {

	SignInBL logic;

	@Test
	public void TestingWithValidCredentials() throws Exception {

		logic = new SignInBL();
		
		logic.AcceptPermission();
		logic.AcceptPermission();
		
		Thread.sleep(5000);
		logic.SingInWithPhone();

		if (logic.verifyLogin()) {
			System.out.println("Case Passed");
		} else
			System.out.println("Case Failed");

	}

}
