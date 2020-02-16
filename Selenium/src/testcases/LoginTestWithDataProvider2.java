package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.Baseclass;
import pages.Logout;
import pages.LoginAP;

public class LoginTestWithDataProvider2 extends Baseclass {

	LoginAP login;
	Logout logOut;

	@Test(dataProvider="LoginData",dataProviderClass=TestNGDataProviders.class)
	public void loginToHRM(String uname,String pass) {

		login = PageFactory.initElements(driver, LoginAP.class);

		logOut = PageFactory.initElements(driver, Logout.class);

		logger = report.createTest("Login Test for OrangeHRM");

		login.validateHomePage();

		logger.pass("Home Page Validated");

		login.enterUserName(uname);

		logger.info("Username entered");

		login.enterPassword(pass);

		logger.info("Password entered");

		login.clickLoginButton();

		logger.info("Clicked on Login button ");

		logOut.logoutFromApplication();

		logger.pass("User is able to logout");
	}

}
