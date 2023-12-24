package Handler;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	private static WebDriver driver;

	public static  WebDriver getDriver() {
		
		if(driver == null) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--no-sandbox");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			
			
		}
		
		return driver;
	}
	
	
	public static void quitDriver() {
		if (driver!=null) {
			
			driver.close();
			driver.quit();
			driver = null;
			
		}
		
		
	}
	

}
