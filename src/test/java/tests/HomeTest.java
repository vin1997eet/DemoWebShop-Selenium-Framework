package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class HomeTest extends BaseTest

{
	@Test
	public void VerifyRatingButton()
	{
		
		HomePage homePage=new HomePage(driver);
		homePage.verifyExcellentRadio();
		homePage.verifyGoodRadio();
		homePage.verifyPoorRadio();
		homePage.verifyVeryBadRadio();
		
		homePage.clickGoodRadioButton();
		homePage.clickPoorRadioButton();
		homePage.clickVeryBadRadioButton();
		
	}
	
	
}
