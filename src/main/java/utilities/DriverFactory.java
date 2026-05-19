package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public static WebDriver initDriver(String browser)
	{
		WebDriver driver = null;
		switch (browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		
		default:
			System.out.println("Invalid browser: " + browser);
			break;
		}
		
		return driver;
		
	}
	

}
