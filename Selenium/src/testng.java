import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class testng {
	@BeforeTest
	public void OpenBrowser() {
			System.out.println("Browser Opened");
		}
@Test(priority=0,description="This is mandatory step", testName="SMOKE")
public void FirstRegistration() {
	System.out.println("User Should First Register an account");
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