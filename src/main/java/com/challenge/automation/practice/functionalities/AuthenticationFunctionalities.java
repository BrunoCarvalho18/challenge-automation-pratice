package com.challenge.automation.practice.functionalities;

import com.challenge.automation.pratice.pages.AuthenticationPage;

public class AuthenticationFunctionalities {
	
		
	private AuthenticationPage authentication;
	
	public AuthenticationFunctionalities() {
		authentication = new  AuthenticationPage();
	}
	
	public void fillFieldEmailAddress(String emailAddress) {
		authentication.getFieldEmailAdress().sendKeys(emailAddress);
	}
	
	public void clickButtonCreateAccount() {
		authentication.getButtonCreateAnAccount().click();
	}
	

}
