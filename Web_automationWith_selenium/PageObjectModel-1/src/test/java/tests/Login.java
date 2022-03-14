package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import model.CommonMethods;
import model.Locators;
import model.Timeout;
import pages.HomePage;

	public class Login{
		Base base = new Base();
		WebDriver driver = base.setup();
		CommonMethods commonMethods= new CommonMethods (driver);
		HomePage homePage = new HomePage(driver);
		Timeout time = new Timeout();

		@BeforeClass
		public void start(){
		driver.get(homePage.homePageUrl());
		driver.manage().window().maximize();
		}
	
	@Test
	public void loginTest(){
	assertEquals(commonMethods.getTitle(),Locators.pageTitile);
	time.timeout();
	commonMethods.clickOnButton(Locators.loginClick);
	commonMethods.sendText(Locators.enterUserName, "0170000000");
	commonMethods.sendText(Locators.enterPassword, "0170000000");
	commonMethods.clickOnButton(Locators.LoginButtonClick);
	time.timeout();
	base.tearDown();


	}
////private String getTitle() {
////	// TODO Auto-generated method stub
////	return null;
//}
}