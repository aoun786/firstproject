import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class invisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.bestbuy.com/");
	ChromeOptions option=new ChromeOptions();
	option.setHeadless(true);
	System.out.println("Title page: "+driver.getTitle());
	}

}
