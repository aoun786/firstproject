import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class download {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/FileDownload.html");
	driver.findElement(By.id("textbox")).sendKeys("Muhammad");
	driver.findElement(By.id("creatTxt")).click();
	driver.findElement(By.id("pdfbox")).sendKeys("testing Sel");
	driver.findElement(By.id("creatpdf")).click();
	driver.findElement(By.id("pdf-link-to-download")).click();
	//driver.findElement(By.xpath("//a[@type= 'button']")).click();
	}

}
