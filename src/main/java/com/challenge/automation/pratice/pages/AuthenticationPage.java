package com.challenge.automation.pratice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.challenge.automation.pratice.core.BasePage;
import com.challenge.automation.pratice.core.Driver;

public class AuthenticationPage extends BasePage{
	
	@FindBy(css = "#email_create")
	WebElement fieldEmailAdress;

	@FindBy(id = "SubmitCreate")
	WebElement buttonCreateAnAccount;
	
	public AuthenticationPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	public WebElement getFieldEmailAdress() {
		return fieldEmailAdress;
	}

	public void setFieldEmailAdress(WebElement fieldEmailAdress) {
		this.fieldEmailAdress = fieldEmailAdress;
	}

	public WebElement getButtonCreateAnAccount() {
		return buttonCreateAnAccount;
	}

	public void setButtonCreateAnAccount(WebElement buttonCreateAnAccount) {
		this.buttonCreateAnAccount = buttonCreateAnAccount;
	}

	

}
