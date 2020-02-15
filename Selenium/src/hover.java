import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.mortgagecalculator.org/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
Actions action = new Actions(driver);
action.moveToElement(driver.findElement(By.xpath("/html/body/section/section/div/div/nav/ul/li[1]/a"))).build().perform();
action.moveToElement(driver.findElement(By.xpath("/html/body/section/section/div/div/nav/ul/li[1]/ul/li[4]/a"))).click();
System.out.print(driver.getTitle());
	}

}
