package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest 
{
	@Test
	public void verifyLogin()
	{
		LoginPage loginPage=new LoginPage(driver);
		loginPage.clickLogin();
		loginPage.enterEmail("test123@gmail.com");
		loginPage.enterPassword("423123");
		loginPage.clickLoginBtn();
		
	}

}
