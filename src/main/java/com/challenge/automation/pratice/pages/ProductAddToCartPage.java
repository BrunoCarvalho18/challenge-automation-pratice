package com.challenge.automation.pratice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.challenge.automation.pratice.core.BasePage;
import com.challenge.automation.pratice.core.Driver;

public class ProductAddToCartPage extends BasePage {
	
	public ProductAddToCartPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "quantity_wanted")
	WebElement fieldQuantity;

	@FindBy(id = "group_1")
	WebElement fieldSize;

	@FindBy(id = "color_8")
	WebElement fieldColor;

	@FindBy(xpath = "//button[@class='exclusive']")
	WebElement buttonAddToCart;

	@FindBy(xpath = "//*[contains(text(),'Proceed to checkout')]")
	WebElement buttonProceed;

	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
	WebElement buttonProceedFinal;

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	WebElement buttonProceedFinalAddress;

	@FindBy(id = "cgv")
	WebElement checkBoxIAgree;

	@FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']")
	WebElement buttonProceedFinalAgree;

	@FindBy(xpath = "//a[@class='bankwire']")
	WebElement buttonPayment;

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	WebElement buttonConfirmOrder;

	@FindBy(css = "#center_column > div > p > strong")
	WebElement textValidation;
	
	public WebElement getFieldQuantity() {
		return fieldQuantity;
	}

	public void setFieldQuantity(WebElement fieldQuantity) {
		this.fieldQuantity = fieldQuantity;
	}

	public WebElement getFieldSize() {
		return fieldSize;
	}

	public void setFieldSize(WebElement fieldSize) {
		this.fieldSize = fieldSize;
	}

	public WebElement getFieldColor() {
		return fieldColor;
	}

	public void setFieldColor(WebElement fieldColor) {
		this.fieldColor = fieldColor;
	}

	public WebElement getButtonAddToCart() {
		return buttonAddToCart;
	}

	public void setButtonAddToCart(WebElement buttonAddToCart) {
		this.buttonAddToCart = buttonAddToCart;
	}

	public WebElement getButtonProceed() {
		return buttonProceed;
	}

	public void setButtonProceed(WebElement buttonProceed) {
		this.buttonProceed = buttonProceed;
	}

	public WebElement getButtonProceedFinal() {
		return buttonProceedFinal;
	}

	public void setButtonProceedFinal(WebElement buttonProceedFinal) {
		this.buttonProceedFinal = buttonProceedFinal;
	}

	public WebElement getButtonProceedFinalAddress() {
		return buttonProceedFinalAddress;
	}

	public void setButtonProceedFinalAddress(WebElement buttonProceedFinalAddress) {
		this.buttonProceedFinalAddress = buttonProceedFinalAddress;
	}

	public WebElement getCheckBoxIAgree() {
		return checkBoxIAgree;
	}

	public void setCheckBoxIAgree(WebElement checkBoxIAgree) {
		this.checkBoxIAgree = checkBoxIAgree;
	}

	public WebElement getButtonProceedFinalAgree() {
		return buttonProceedFinalAgree;
	}

	public void setButtonProceedFinalAgree(WebElement buttonProceedFinalAgree) {
		this.buttonProceedFinalAgree = buttonProceedFinalAgree;
	}

	public WebElement getButtonPayment() {
		return buttonPayment;
	}

	public void setButtonPayment(WebElement buttonPayment) {
		this.buttonPayment = buttonPayment;
	}

	public WebElement getButtonConfirmOrder() {
		return buttonConfirmOrder;
	}

	public void setButtonConfirmOrder(WebElement buttonConfirmOrder) {
		this.buttonConfirmOrder = buttonConfirmOrder;
	}

	public WebElement getTextValidation() {
		return textValidation;
	}

	public void setTextValidation(WebElement textValidation) {
		this.textValidation = textValidation;
	}

	

}
