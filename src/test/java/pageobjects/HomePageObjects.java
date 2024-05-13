package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {
	

	private static HomePageObjects homePageObjects;
	
	private HomePageObjects(){
		
	}
	
	public static HomePageObjects getInstance() {
		if(homePageObjects==null) {
			homePageObjects=new HomePageObjects();
		}
		return homePageObjects;
	   }
	
	@FindBy(partialLinkText = "Create an Account")
	private WebElement createAccountLink;
	public void createAccount() {
		createAccountLink.click();
	}

//	public WebElement getCreateAccountLink() {
//		return createAccountLink;
//	}
	
	@FindBy(xpath="//html//div[2]//header/div[1]//li[2]/a")
	private WebElement signUpLink;
	public void signUpLink() {
		signUpLink.click();
	}

//	public WebElement getSignUpLink() {
//		return signUpLink;
//	}
//	

}
