import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	WebDriver driver;//Global so each method can access driver

	//pre condition annotation
	@BeforeTest
	public void OpenBrowser() {
		driver.get("https://www.facebook.com/");
			//System.out.println("Browser Opened");
		}
@Test(enabled=false,priority=0,description="This is mandatory step", testName="SMOKE")
public void FirstRegistration() {
	driver.findElement(By.name("firstname")).sendKeys("Ali");
	System.out.println("User Should First Register an account");
}
private Object sendkeys(String string) {
	// TODO Auto-generated method stub
	return null;
}
@Test(priority=1)
public void Login() {
	System.out.println("Login Success");
}
@Test(priority=3)
public void signOff() {
	System.out.println("Logout from app");
}
@AfterTest
public void closeBrowser() {
System.out.println("Browser closed");
}
	}