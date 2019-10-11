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

	}

}
