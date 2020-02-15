import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//headling 
String PMS = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
System.out.println(PMS);
	}

}
