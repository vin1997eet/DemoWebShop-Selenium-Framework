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
			System.out.println("Excellent Radio Button is Present");
			return true;
		}
		else
		{
			System.out.println("Excellent Radio Button is not Present");
			return false;
		}
	}
	public boolean verifyGoodRadio()
	{
		
		if(driver.findElement(goodRadio).isDisplayed())
		{
			System.out.println("Good Radio Button is Present");
			return true;
		}
		else
		{
			System.out.println("Good Radio Button is not Present");
			return false;
		}
	}
	
	public boolean verifyPoorRadio()
	{
		if(driver.findElement(poorRadio).isDisplayed())
		{
			System.out.println("poor Radio Button is Present");
			return true;
		}
		else
		{
			System.out.println("poor Radio Button is not Present");
			return false;
		}
	}
	
	public boolean verifyVeryBadRadio()
	{
		if(driver.findElement(veryBadRadio).isDisplayed())
		{
			System.out.println("veryBad Radio Button is Present");
			return true;
		}
		else
		{
			System.out.println("veryBad Radio Button is not Present");
			return false;
		}
	}
	
	public void clickVeryExcellentRadioButton()
	{
		driver.findElement(excellentRadio).click();
	}
	
	public void clickGoodRadioButton()
	{
		driver.findElement(goodRadio).click();
	}
	
	public void clickPoorRadioButton()
	{
		driver.findElement(poorRadio).click();
	}
	public void clickVeryBadRadioButton()
	{
		driver.findElement(veryBadRadio).click();
	}
	
	
	
}
