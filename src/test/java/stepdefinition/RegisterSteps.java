package stepdefinition;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import constants.Constants;
import drivermanager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePageObjects;
import pageobjects.RegisterPageObjects;

public class RegisterSteps {
	
	@Given("I navigated to software testing web application")
	public  void i_navigated_to_para_bank_web_application() {
	   DriverManager.getDriver().get(Constants.APP_URL);
		
	  
	}

	@When("I clicked on create an account link")
	public void i_clicked_on_register_link() {
		HomePageObjects.getInstance().createAccount();
	}

	@When("I have entered new customer information")
	public void i_have_entered_new_customer_information() {
		RegisterPageObjects.getInstance();
		RegisterPageObjects.getInstance().enterFirstName(Constants.FIRSTNAME);
		RegisterPageObjects.getInstance().enterLastName(Constants.LASTNAME);
		RegisterPageObjects.getInstance().enterEmail(Constants.EMAIL);
		RegisterPageObjects.getInstance().enterPass(Constants.PASSWORD);
		RegisterPageObjects.getInstance().enterConfirmPass(Constants.CONFIRMPASSWORD);
		
		
	
	}

	@When("Clicked on Register button")
	public void clicked_on_register_button() {
   
		RegisterPageObjects.getInstance().clickSubmit();
	}

	@Then("I validate customer registration")
	public void i_validate_customer_registration() {
		String url=DriverManager.getDriver().getCurrentUrl();
		//Assert.assertEquals("customer",url);
		
		if(url.contains("customer")) {
			System.out.println("Account created");
		}
	}

	
}
