package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageObjects {
	
	private static RegisterPageObjects registerPageObjects;
	
	private RegisterPageObjects(){
		
	}
	
	public static RegisterPageObjects getInstance() {
		if(registerPageObjects==null) {
			registerPageObjects=new RegisterPageObjects();
		}
		return registerPageObjects;
	   }
	
	@FindBy (id="firstname")
	private  WebElement firstName;
	@FindBy(id="lastname")
	private WebElement lastName;
	@FindBy(id="email_address")
	private WebElement email;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="password-confirmation")
	private WebElement confirmPassword;
	@FindBy(xpath="//button[@title='Create an Account']")
	private WebElement createButton;
	
	public void enterFirstName(String name) {
		firstName.sendKeys(name);
		
	}
	public void enterLastName(String secondName) {
		lastName.sendKeys(secondName);
	}
	
	public void enterEmail(String userEmail) {
		email.sendKeys(userEmail);
	}
	public void enterPass(String passWord) {
		password.sendKeys(passWord);
	}
	public void enterConfirmPass(String confirmPass) {
		confirmPassword.sendKeys(confirmPass);
		
	}
	public void clickSubmit() {
		createButton.click();
	}
	
//	public WebElement getFirstName() {
//		return firstName;
//	}
//	public WebElement getLastName() {
//		return lastName;
//	}
//	public WebElement getEmail() {
//		return email;
//	}
//	public WebElement getPassword() {
//		return password;
//	}
//	public WebElement getConfirmPassword() {
//		return confirmPassword;
//	}
//	public WebElement getCreateButton() {
//		return createButton;
//	}
	
	
	

}
