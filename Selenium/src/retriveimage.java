import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class retriveimage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.jet.com");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
List<WebElement>imageul= driver.findElements(By.tagName("img"));  
System.out.println(imageul.size());
for(int i=0;i<imageul.size(); i++) {
System.out.println(imageul.get(i).getAttribute("src"));
}
}
}
