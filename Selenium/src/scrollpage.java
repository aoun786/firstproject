import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.bestbuy.com/");
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//1.pixel
	//js.executeScript("window.scrollby(0,1000)","");
	//2.using element
	//WebElement social = driver.findElement(By.xpath("//*[@id=\"jp_interface_6\"]/div/div[1]/h2/a"));
			//js.executeAsyncScript("arguments[0].scrollintoView();",social);
			
	//3-bottom of the page
			js.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
