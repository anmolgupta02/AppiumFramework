package com.atigo.tests;

import org.testng.annotations.Test;

import com.atigo.businessLogics.SignInBL;

public class SignInTests {

	SignInBL logic;

	@Test
	public void TestingWithValidCredentials() {

		logic = new SignInBL();

		try {
			logic.SingInWithPhone();
		} catch (Exception e) {
			System.err.print(e);
		}

		if (logic.verifyLogin()) {
			System.out.println("Case Passed");
		} else
			System.out.println("Case Failed");

	}

}
