package drivermanager;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import constants.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
//import stepdefinition.BrowserLaunch;
import stepdefinition.BrowserLaunch;

public class DriverManager {
	
	 private static WebDriver driver=null;
		private static final Logger LOGGER= LogManager.getLogger(BrowserLaunch.class);

	
	public static  void lanchBrowser() {
		try {
			
			switch (Constants.BROWSER) {
			
			case "Chrome":
			WebDriverManager.chromedriver().setup();
			LOGGER.info("Launching"+Constants.BROWSER);
			 driver= new ChromeDriver();
			 break;
			 
			case  "Firefox":
				WebDriverManager.firefoxdriver().setup();
				LOGGER.info("Launching"+Constants.BROWSER);
				driver= new FirefoxDriver();
				break;
				 
			case "IE":
				WebDriverManager.iedriver().setup();
				LOGGER.info("Launching"+Constants.BROWSER);
				driver= new InternetExplorerDriver();
				break;
			case "Edge":
				WebDriverManager.edgedriver().setup();
				LOGGER.info("Launching"+Constants.BROWSER);
				driver= new EdgeDriver();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching"+Constants.BROWSER);
				driver= new ChromeDriver();	
				break;
			}
						
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		}


	public static WebDriver getDriver() {
		return driver;
	}
}
