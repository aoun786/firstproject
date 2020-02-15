import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.name("firstname")).sendKeys("ali123");
Thread.sleep(1000);
driver.findElement(By.name("lastname")).sendKeys("choudhary");
driver.findElement(By.name("reg_email__")).sendKeys("aunmuhammad@gmail.com");
//Select dropdown = new Select  
	}

}

//