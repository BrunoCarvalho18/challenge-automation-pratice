package com.challenge.automation.practice.functionalities;

import com.challenge.automation.pratice.pages.CatalogProductPage;

public class CatalogProductsFunctionalities {
	
	private CatalogProductPage catalogProduct;
	
	public CatalogProductsFunctionalities() {
		catalogProduct = new CatalogProductPage();
	}
	
	public void clickButtonBlouse() {
		catalogProduct.getButtonBlouse().click();
	}

}
