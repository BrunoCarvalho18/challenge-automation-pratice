package com.challenge.automation.pratice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.challenge.automation.pratice.core.BasePage;
import com.challenge.automation.pratice.core.Driver;

public class CatalogProductPage extends BasePage {
	
	public CatalogProductPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//div[@class='right-block']//a[@class='product-name'][contains(text(),'Blouse')]") 
	WebElement buttonBlouse;
	
	public WebElement getButtonBlouse() {
		return buttonBlouse;
	}

	public void setButtonBlouse(WebElement buttonBlouse) {
		this.buttonBlouse = buttonBlouse;
	}

	

}
