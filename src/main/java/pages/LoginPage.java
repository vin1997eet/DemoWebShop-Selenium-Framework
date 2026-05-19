package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By loginLink=By.className("ico-login");
	By email=By.id("Email");
	By password=By.id("Password");
	By loginbtn=By.xpath("//input[@value=\"Log in\"]");
	
	public void clickLogin()
	{
	   driver.findElement(loginLink).click();
	}
	
	public void enterEmail(String mail)
	{
		driver.findElement(email).sendKeys(mail);
	}
	public void enterPassword(String inputpassword)
	{
		driver.findElement(password).sendKeys(inputpassword);
	}
	
	public void clickLoginBtn()
	{
		driver.findElement(loginbtn).click();
	}

}
