package stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import drivermanager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.CommonUtilities;

public class BrowserLaunch {

	public static WebDriver driver;
	private static final Logger LOGGER= LogManager.getLogger(BrowserLaunch.class);
//	private static String scenarioName=null;
//
//	public static String getScenarioName() {
//		return scenarioName;
//	}
	
	@Before
	public void beforeSenario() {
		LOGGER.info("Execution Started");
		try{
		CommonUtilities commonUtilities=new CommonUtilities();
			LOGGER.info("Instantiation");


			commonUtilities.loadProperties();
			LOGGER.info("Loading Property file");

			if(driver==null)
				LOGGER.info("Checking driver Status");
			{
				LOGGER.info("Launching Browser");

				DriverManager.lanchBrowser();
				CommonUtilities.initElements();
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
	}
	
	@After
	public void afterSenario() {
		LOGGER.info("Execution Started");
		try{
//		CommonUtilities commonUtilities=new CommonUtilities();
//			LOGGER.info("Instantiation");
//			commonUtilities.loadProperties();
//			LOGGER.info("Loading Property file");

			

				driver.quit();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
	}}





