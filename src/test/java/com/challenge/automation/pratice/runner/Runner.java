package com.challenge.automation.pratice.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static com.challenge.automation.pratice.core.Driver.getDriver;


@RunWith(Cucumber.class)
@CucumberOptions(glue = { "com.challenge.automation.pratice.steps" }, features = {
		"src/main/resources" },tags =  "@add-products")
public class Runner {
	
	@AfterClass
	public static void encerraDriver() {
		getDriver().close();
	}

}
