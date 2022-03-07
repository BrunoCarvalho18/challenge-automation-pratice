package com.challenge.automation.practice.functionalities;

import com.challenge.automation.pratice.pages.HomePage;

public class HomeFunctionalities {
	
	private HomePage home;
	
	
	public HomeFunctionalities() {
		home = new HomePage();
	}

	public void clickButtonSignIn() {
		home.getButtonSigIn().click();

	}

}
