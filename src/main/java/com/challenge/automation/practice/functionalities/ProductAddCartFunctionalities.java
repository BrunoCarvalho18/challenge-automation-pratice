package com.challenge.automation.practice.functionalities;

import org.openqa.selenium.By;

import com.challenge.automation.pratice.pages.ProductAddToCartPage;

public class ProductAddCartFunctionalities {
	
	private ProductAddToCartPage productAddCartPage;
	
	public ProductAddCartFunctionalities() {
		productAddCartPage = new ProductAddToCartPage();
	}
	
	public void selectFieldQuantity(String quantity) {
		productAddCartPage.getFieldQuantity().sendKeys(quantity);
	}
	
	public void selectFieldSize(Integer size) {
		productAddCartPage.selectField(By.id("group_1"), size);
	}
	
	public void selectFieldColor() {
		productAddCartPage.getFieldColor().click();
	}
	
	public void selectButtonAddToCart() {
		productAddCartPage.getButtonAddToCart().click();
	}
	
	
	public void waitForElementButtonProceed() {
		productAddCartPage.waitForElementPresent(By.xpath("//*[contains(text(),'Proceed to checkout')]"));
	}
	
	
	public void selectButtonProceed() {
		productAddCartPage.getButtonProceed().click();
	}
	
	public void selectButtonProceedFinal() {
		productAddCartPage.getButtonProceedFinal().click();
	}
	
	public void selectButtonProceedFinalAddress() {
		productAddCartPage.getButtonProceedFinalAddress().click();
	}
	
	public void selectCheckBoxIAgree() {
		productAddCartPage.getCheckBoxIAgree().click();
	}
	
	public void selectButtonProceedFinalAgree() {
		productAddCartPage.getButtonProceedFinalAgree().click();
	}
	
	public void selectButtonPayment() {
		productAddCartPage.getButtonPayment().click();
	}
	
	public void selectButtonConfirmOreder() {
		productAddCartPage.getButtonConfirmOrder().click();
	}
	
}
