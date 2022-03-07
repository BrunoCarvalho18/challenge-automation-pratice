package com.challenge.automation.pratice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.challenge.automation.pratice.core.BasePage;
import com.challenge.automation.pratice.core.Driver;

public class CreateAnAccountPage  extends BasePage{
	
	public CreateAnAccountPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(css = "#id_gender1")
	WebElement buttonGender;

	@FindBy(css = "#customer_firstname")
	WebElement fieldFirstName;

	@FindBy(id = "customer_lastname")
	WebElement fieldLastName;

	@FindBy(id = "passwd")
	WebElement fieldPassword;

	@FindBy(id = "days")
	WebElement fieldDate;

	@FindBy(id = "months")
	WebElement fieldMonths;

	@FindBy(id = "years")
	WebElement fieldYears;

	@FindBy(id = "firstname")
	WebElement fieldFirtsNameAddress;

	@FindBy(id = "lastname")
	WebElement fieldLastNameAddress;

	@FindBy(id = "address1")
	WebElement fieldAddress;

	@FindBy(id = "city")
	WebElement fieldCity;

	@FindBy(id = "id_state")
	WebElement fieldState;

	@FindBy(id = "postcode")
	WebElement fieldZipCode;

	@FindBy(id = "id_country")
	WebElement fieldCountry;

	@FindBy(id = "phone_mobile")
	WebElement fieldPhone;

	@FindBy(id = "alias")
	WebElement fieldMyAddress;

	@FindBy(id = "submitAccount") 
	WebElement fieldRegister;
	
	@FindBy(className = "sf-with-ul")
	WebElement fieldWomen;
	
	
	public WebElement getButtonGender() {
		return buttonGender;
	}

	public void setButtonGender(WebElement buttonGender) {
		this.buttonGender = buttonGender;
	}

	public WebElement getFieldFirstName() {
		return fieldFirstName;
	}

	public void setFieldFirstName(WebElement fieldFirstName) {
		this.fieldFirstName = fieldFirstName;
	}

	public WebElement getFieldLastName() {
		return fieldLastName;
	}

	public void setFieldLastName(WebElement fieldLastName) {
		this.fieldLastName = fieldLastName;
	}

	public WebElement getFieldPassword() {
		return fieldPassword;
	}

	public void setFieldPassword(WebElement fieldPassword) {
		this.fieldPassword = fieldPassword;
	}

	public WebElement getFieldDate() {
		return fieldDate;
	}

	public void setFieldDate(WebElement fieldDate) {
		this.fieldDate = fieldDate;
	}

	public WebElement getFieldMonths() {
		return fieldMonths;
	}

	public void setFieldMonths(WebElement fieldMonths) {
		this.fieldMonths = fieldMonths;
	}

	public WebElement getFieldYears() {
		return fieldYears;
	}

	public void setFieldYears(WebElement fieldYears) {
		this.fieldYears = fieldYears;
	}

	public WebElement getFieldFirtsNameAddress() {
		return fieldFirtsNameAddress;
	}

	public void setFieldFirtsNameAddress(WebElement fieldFirtsNameAddress) {
		this.fieldFirtsNameAddress = fieldFirtsNameAddress;
	}

	public WebElement getFieldLastNameAddress() {
		return fieldLastNameAddress;
	}

	public void setFieldLastNameAddress(WebElement fieldLastNameAddress) {
		this.fieldLastNameAddress = fieldLastNameAddress;
	}

	public WebElement getFieldAddress() {
		return fieldAddress;
	}

	public void setFieldAddress(WebElement fieldAddress) {
		this.fieldAddress = fieldAddress;
	}

	public WebElement getFieldCity() {
		return fieldCity;
	}

	public void setFieldCity(WebElement fieldCity) {
		this.fieldCity = fieldCity;
	}

	public WebElement getFieldState() {
		return fieldState;
	}

	public void setFieldState(WebElement fieldState) {
		this.fieldState = fieldState;
	}

	public WebElement getFieldZipCode() {
		return fieldZipCode;
	}

	public void setFieldZipCode(WebElement fieldZipCode) {
		this.fieldZipCode = fieldZipCode;
	}

	public WebElement getFieldCountry() {
		return fieldCountry;
	}

	public void setFieldCountry(WebElement fieldCountry) {
		this.fieldCountry = fieldCountry;
	}

	public WebElement getFieldPhone() {
		return fieldPhone;
	}

	public void setFieldPhone(WebElement fieldPhone) {
		this.fieldPhone = fieldPhone;
	}

	public WebElement getFieldMyAddress() {
		return fieldMyAddress;
	}

	public void setFieldMyAddress(WebElement fieldMyAddress) {
		this.fieldMyAddress = fieldMyAddress;
	}

	public WebElement getFieldRegister() {
		return fieldRegister;
	}

	public void setFieldRegister(WebElement fieldRegister) {
		this.fieldRegister = fieldRegister;
	}

	public WebElement getFieldWomen() {
		return fieldWomen;
	}

	public void setFieldWomen(WebElement fieldWomen) {
		this.fieldWomen = fieldWomen;
	}

}
