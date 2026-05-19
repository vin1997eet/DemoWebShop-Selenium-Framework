package base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import utilities.ConfigReader;
import utilities.DriverFactory;

import org.openqa.selenium.WebDriver;

public class BaseTest {
	public WebDriver driver;
	ConfigReader config;
	@BeforeMethod
	public void setup()
	{
		
		config=new ConfigReader();
		driver=DriverFactory.initDriver(ConfigReader.get("browser"));
        String url=ConfigReader.get("url");
        driver.get(url);
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
