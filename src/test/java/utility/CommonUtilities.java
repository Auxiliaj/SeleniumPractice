package utility;


import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import drivermanager.DriverManager;
import pageobjects.HomePageObjects;
import pageobjects.LoginPageObjects;
import pageobjects.RegisterPageObjects;

public class CommonUtilities {

	public  void loadProperties() {
		
		
		Properties properties=new Properties();
		
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Constants.APP_URL= properties.getProperty("Url");
		Constants.BROWSER=properties.getProperty("BROWSER");
		Constants.FIRSTNAME=properties.getProperty("FristName");
		Constants.LASTNAME=properties.getProperty("LastName");
		Constants.EMAIL=properties.getProperty("Email");
		Constants.PASSWORD=properties.getProperty("Password");
		Constants.CONFIRMPASSWORD=properties.getProperty("ConfirmPasswword");
}
	public static void initElements() {
		PageFactory.initElements(DriverManager.getDriver(), RegisterPageObjects.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), HomePageObjects.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), LoginPageObjects.getInstance());

		
	}
	
	
}
