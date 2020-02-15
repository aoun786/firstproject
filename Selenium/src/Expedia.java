import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expedia {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.expedia.com/");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"tab-hotel-tab-hp\"]"));
Thread.sleep(5000);
String mon="Mar 2020";
String date="";
driver.findElement(By.xpath("//*[@id=\'hotel-checkin-hp-hotel\']")).click();
while(true)
{
	String text =driver.findElement(By.xpath("///caption")).getText();
	if(text.equals(mon))
	{
	
break;
	}
	else
	{
		////*[@id="hotel-checkin-wrapper-hp-hotel"]/div/div/button[2]
		////*[@id=\"hotel-checkin-wrapper-hp-hotel\"]/div/div/div[3]/table/tbody/tr[3]/td[6]/button
		driver.findElement(By.xpath("//*[@id=\"hotel-checkin-wrapper-hp-hotel\"]/div/div/button[2]")).click();

	}
	
	List<WebElement> allcaldate = driver.findElements(By.xpath("//*[@id=\"hotel-checkin-wrapper-hp-hotel\"]/div/div/div[3]/table/tbody/tr/td/button"));
	
for (WebElement elem:allcaldate)
{
	System.out.println(elem.getText());
	}
}}}