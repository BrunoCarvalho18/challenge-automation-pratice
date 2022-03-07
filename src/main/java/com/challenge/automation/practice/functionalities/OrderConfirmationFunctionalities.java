package com.challenge.automation.practice.functionalities;

import org.openqa.selenium.By;

import com.challenge.automation.pratice.pages.OrderConfirmationPage;

public class OrderConfirmationFunctionalities {
	
	
	private OrderConfirmationPage orderConfimationPage;
	
	public OrderConfirmationFunctionalities() {
		 orderConfimationPage = new OrderConfirmationPage();
	}
	
	public void waitForElementTextOrderConfirmation() {
		 orderConfimationPage.waitForElementPresent(By.xpath("//*[contains(text(),'Your order on My Store is complete.')]"));
	}
	
	public String returnTextorderConfimationPage() {
		return orderConfimationPage.getTextProceedCheckout().getText();
	}

}
