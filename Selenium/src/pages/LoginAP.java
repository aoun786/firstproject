package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginAP {
	
	WebDriver driver;
	public LoginAP(WebDriver pdriver)
	{
		
		this.driver=pdriver;
	
	}
	@FindBy(id="email") WebElement username;
	@FindBy(how=How.ID,using="password")
	WebElement password;
	@FindBy(how=How.XPATH,using="//*[@id=\"SubmitLogin\"]/span")
	WebElement Signin_butoon;
	@FindBy(how=How.XPATH,using="//*[@id=\"login_form\"]/div/p[1]/a")
	WebElement ForgotPassword;
	public void login_apsite(String uid,String passs)
	{
		username.sendKeys(uid);
		password.sendKeys(passs);
		Signin_butoon.click();
	}
}
