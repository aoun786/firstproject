import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.com");
File promart=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

FileHandler.copy(promart, new File("C:\\Users\\Aun Muhammad\\Desktop\\md.png"));
}
}