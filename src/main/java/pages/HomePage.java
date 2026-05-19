package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{

	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By excellentRadio=By.name("pollanswers-1");
	By goodRadio=By.name("pollanswers-2");
	By poorRadio=By.name("pollanswers-3");
	By veryBadRadio=By.name("pollanswers-4");
	
	public boolean verifyExcellentRadio()
	{
		if(driver.findElement(excellentRadio).isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
}
