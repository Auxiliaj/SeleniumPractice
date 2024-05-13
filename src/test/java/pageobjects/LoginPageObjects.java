package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

	private static LoginPageObjects loginPageObjects;
	
	private LoginPageObjects(){
		
	}
	
	public static LoginPageObjects getInstance() {
		if(loginPageObjects==null) {
			loginPageObjects=new LoginPageObjects();
		}
			return loginPageObjects;
	}
	
	@FindBy(id="email")
	private WebElement eMail;
	@FindBy(id="pass")
	private WebElement accPassWord;
	@FindBy(id="send2")
	private WebElement signIn;
	@FindBy(partialLinkText = "Forgot Your Password?")
	private WebElement forgotPassWordLink;
	
	public static LoginPageObjects getLoginPageObjects() {
		return loginPageObjects;
	}

	public void userEmail(String userEmail) {
		eMail.sendKeys(userEmail);
	}
	
	public void passWord(String loginpassWord) {
		accPassWord.sendKeys(loginpassWord);
	}
	public void clickSignIn() {
		signIn.click();
	}
//	public WebElement geteMail() {
//		return eMail;
//	}
//
//	public WebElement getAccPassWord() {
//		return accPassWord;
//	}
//
//	public WebElement getSignIn() {
//		return signIn;
//	}
//
//	public WebElement getForgotPassWordLink() {
//		return forgotPassWordLink;
//	}
//	
	
	
}
