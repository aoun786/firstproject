import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deletecookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.expedia.com/");
	//way1
	//driver.manager().deleteAllCookies();
	//way2
	driver.navigate().to("https://www.expedia.com/");
	driver.manage().deleteCookieNamed("test@yahoo.com");
	Set<Cookie>cookiestorage=driver.manage().getCookies();
	for(Cookie cookies:cookiestorage) {
		System.out.println(cookies);
	}
	}

}
