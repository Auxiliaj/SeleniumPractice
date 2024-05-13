package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GeoLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://the-internet.herokuapp.com/geolocation");
		
		WebElement button= driver.findElement(By.xpath("//button[contains(text(),'Where am I?')]"));
		button.click();
		
		Thread.sleep(3000);
		WebElement latValue= driver.findElement(By.id("lat-value"));
		String lat=latValue.getText();
		System.out.println(lat);

		WebElement longValue= driver.findElement(By.id("long-value"));
		String lon=longValue.getText();
		System.out.println(lon);

	
	
	}

}
