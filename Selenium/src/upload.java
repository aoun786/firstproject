import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/FileUpload.html\r\n" + "  \r\n" + "");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"input-4\"]")).sendKeys("D:\\QA CLASS\\upload\\FACEBOOK.txt");;
	}

}
