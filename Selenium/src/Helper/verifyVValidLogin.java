package Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Helper.BrowserFactory;
import pages.LoginAP;
public class verifyVValidLogin{
	@Test
	public void checkUser()
	{
		WebDriver driver=BrowserFactory.startBrowser("Firefox","http://automationpractice.com/index.php?controller=authentication&back=my-account");
	LoginAP login_page=PageFactory.initElements(driver, LoginAP.class)	;
	login_page.login_apsite("test@gmail.com","123");
	}
	
	
}