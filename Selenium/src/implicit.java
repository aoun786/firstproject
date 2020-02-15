import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait is always applied globally for all webelement
		//present in the script
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement FirstName=driver.findElement(By.name("firstname"));
		WebElement LastName=driver.findElement(By.name("lastname"));
		SendKeys(driver,FirstName,10,"Ali");
		SendKeys(driver,LastName,20,"Muhammad");
	
		WebElement forgotLink =driver.findElement(By.linkText("Fogot account?"));
		clickOn(driver,forgotLink,3);
	}
	
private static void clickOn(WebDriver driver, WebElement forgotLink, int i) {
		// TODO Auto-generated method stub
		
	}

public static void SendKeys(WebDriver driver, WebElement locators,int timeout, String value ) {
//Explicit wait dosen't have any command like implicit wait that indicates
	//its an explicit wait
	//(webDriverwait) is used  for explicit wait
	// waits for particular element or action to take place. its condition base 
	//it must have condition***
	new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(locators));
locators.sendKeys(value);

	}

}
