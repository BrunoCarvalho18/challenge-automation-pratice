package com.challenge.automation.practice.functionalities;

import org.openqa.selenium.By;
import com.challenge.automation.pratice.pages.CreateAnAccountPage;

public class CreateAnAccountFunctionalities {

	private CreateAnAccountPage account;

	public CreateAnAccountFunctionalities() {
		account = new CreateAnAccountPage();
	}

	public void waitForElementPresentGender() {
		account.waitForElementPresent(By.id("id_gender1"));
	}
	
	public void clickButtonGender() {
		account.getButtonGender().click();
	}

	public void writeFieldFirstName(String fieldFirstName) {
       account.getFieldFirstName().sendKeys(fieldFirstName);
	}

	public void writeFieldLastName(String fieldLastName) {
		account.getFieldLastName().sendKeys(fieldLastName);
	}
	
	public void writeFieldPassword(String fieldPassword) {
		account.getFieldPassword().sendKeys(fieldPassword);
	}
	
	
	public void selectFieldDate(Integer date) {
		account.selectField(By.id("days"), date);
		
	}
	
	public void selectFieldMonth(Integer month) {
		account.selectField(By.id("months"), month);
		
	}
	
	public void selectFieldYears(Integer years) {
		account.selectField(By.id("years"), years);
		
	}
	
	public void selectFieldAddress(String address) {
		account.getFieldAddress().sendKeys(address);
	}

	public void selectFieldCity(String city) {
		account.getFieldCity().sendKeys(city);
	}

	public void selectFieldState(Integer state){
		account.selectField(By.id("id_state"), state);
	}

	public void selectFieldZipCode(String zipCode) {
		account.getFieldZipCode().sendKeys(zipCode);
	}

	public void selectFieldCountry(Integer country) {
		account.selectField(By.id("id_country"), country);
	}

	public void selectFieldPhone(String phone) {
		account.getFieldPhone().sendKeys(phone);
	}

	public void selectFieldMyAddress(String address) {
		account.getFieldMyAddress().sendKeys(address);
	}

	public void selectFieldRegister() {
		account.getFieldRegister().click();
	}

	public void selectFieldWomen() {
		account.getFieldWomen().click();
	}

}
