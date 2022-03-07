package com.challenge.automation.pratice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.challenge.automation.pratice.core.BasePage;
import com.challenge.automation.pratice.core.Driver;

public class OrderConfirmationPage extends BasePage {
	
	
	public OrderConfirmationPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(xpath = "//*[contains(text(),'Your order on My Store is complete.')]")
	WebElement textProceedCheckout;


	public WebElement getTextProceedCheckout() {
		return textProceedCheckout;
	}


	public void setTextProceedCheckout(WebElement textProceedCheckout) {
		this.textProceedCheckout = textProceedCheckout;
	}

}
