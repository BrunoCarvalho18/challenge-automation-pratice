package com.challenge.automation.pratice.steps;

import static com.challenge.automation.pratice.core.Driver.getDriver;

import com.challenge.automation.practice.functionalities.AuthenticationFunctionalities;
import com.challenge.automation.practice.functionalities.CatalogProductsFunctionalities;
import com.challenge.automation.practice.functionalities.CreateAnAccountFunctionalities;
import com.challenge.automation.practice.functionalities.HomeFunctionalities;
import com.challenge.automation.practice.functionalities.OrderConfirmationFunctionalities;
import com.challenge.automation.practice.functionalities.ProductAddCartFunctionalities;
import com.challenge.automation.pratice.core.Utils;
import com.github.javafaker.Faker;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProductsOnCartSteps {
	
	String url = "http://automationpractice.com/index.php";
	String orderConfirmationString = "Your order on My Store is complete.";
	Faker faker = new Faker();
	HomeFunctionalities home = new HomeFunctionalities();
	AuthenticationFunctionalities authentication = new AuthenticationFunctionalities();
	CreateAnAccountFunctionalities createAnAccount = new CreateAnAccountFunctionalities();
	CatalogProductsFunctionalities catalogProducts = new CatalogProductsFunctionalities();
	ProductAddCartFunctionalities  productAddCart = new ProductAddCartFunctionalities();
	OrderConfirmationFunctionalities orderConfirmation = new OrderConfirmationFunctionalities();
	private Utils utils = new Utils();
	
	@Given("I am on the home page")
	public void i_am_on_the_home_page() {
		getDriver().get(url);
	}
	@When("I put this on the cart")
	public void i_put_this_on_the_cart() {
		home.clickButtonSignIn();
		authentication.fillFieldEmailAddress(faker.internet().emailAddress());
		authentication.clickButtonCreateAccount();
		createAnAccount.waitForElementPresentGender();
		createAnAccount.clickButtonGender();
		createAnAccount.writeFieldFirstName(faker.name().firstName());
		createAnAccount.writeFieldLastName(faker.name().lastName());
		createAnAccount.writeFieldPassword(faker.internet().password());
		createAnAccount.selectFieldDate(3);
		createAnAccount.selectFieldMonth(3);
		createAnAccount.selectFieldYears(15);
		createAnAccount.selectFieldAddress(faker.address().streetAddress());
		createAnAccount.selectFieldCity(faker.address().city());
		createAnAccount.selectFieldState(5);
		createAnAccount.selectFieldCountry(1);
		createAnAccount.selectFieldPhone(faker.phoneNumber().cellPhone());
		createAnAccount.selectFieldMyAddress(faker.address().streetAddress());
		createAnAccount.selectFieldZipCode(utils.zipCodes());
		createAnAccount.selectFieldRegister();
		createAnAccount.selectFieldWomen();
		catalogProducts.clickButtonBlouse();
		productAddCart.selectFieldColor();
		productAddCart.selectFieldSize(2);
		productAddCart.selectFieldQuantity(faker.number().digit());
		productAddCart.selectButtonAddToCart();
		productAddCart.waitForElementButtonProceed();
		productAddCart.selectButtonProceed();
		productAddCart.selectButtonProceedFinal();
		productAddCart.selectButtonProceedFinalAddress();
		productAddCart.selectCheckBoxIAgree();
		productAddCart.selectButtonProceedFinalAgree();
		productAddCart.selectButtonPayment();
		productAddCart.selectButtonConfirmOreder();
		
		
	}
	@Then("I should see products on the cart")
	public void i_should_see_products_on_the_cart() {
		orderConfirmation.waitForElementTextOrderConfirmation();
		Assert.assertEquals(orderConfirmation.returnTextorderConfimationPage(),orderConfirmationString);
	  
	}

}
