package com.challenge.automation.pratice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.challenge.automation.pratice.core.BasePage;
import com.challenge.automation.pratice.core.Driver;

public class HomePage extends BasePage  {
	
	@FindBy(xpath = "//div[@class=\"header_user_info\"]")
	WebElement buttonSigIn;
	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	
	public WebElement getButtonSigIn() {
		return buttonSigIn;
	}

	public void setButtonSigIn(WebElement buttonSigIn) {
		this.buttonSigIn = buttonSigIn;
	}

	
}
