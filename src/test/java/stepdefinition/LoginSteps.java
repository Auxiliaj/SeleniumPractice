package stepdefinition;

import constants.Constants;
import drivermanager.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePageObjects;
import pageobjects.LoginPageObjects;

public class LoginSteps {

	 @When("I clicked on signup link")
	 public void iClickedOnSignupLink() {
		 
		 HomePageObjects.getInstance().signUpLink();
	 }
	 @When("I have entered user name as {string} and password as {string}")
	 public void iHaveEnteredUserNameAsAndPasswordAs(String userId, String password) {
		 LoginPageObjects.getInstance().userEmail(Constants.EMAIL);
		 LoginPageObjects.getInstance().passWord(Constants.PASSWORD);
	    
	 }
	 @When("Clicked on signIn button")
	 public void clickedOnSignInButton() {
		 LoginPageObjects.getInstance().clickSignIn();
	    
	 }
	 @Then("I validate customer login")
	 public void iValidateCustomerLogin() {
		 String url;
		try {
			url = DriverManager.getDriver().getCurrentUrl();
			 System.out.println(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	     
	 }



	 
}
