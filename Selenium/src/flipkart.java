import java.sql.Time;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkart {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

//implicit wait is always applied globally --for all webelements
//present in the script

driver.get("https://www.flipkart.com/");

WebElement xb = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
   xb.click();
   
WebElement search = driver.findElement(By.name("q"));
   SendKeys(driver, search,10, "SONY");
   
  WebElement button = driver .findElement(By.className("vh79eN"));
  button.click();
 
  Thread.sleep(3000);
 
 
  WebElement slider=driver .findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/div/section[2]/div[3]/div[1]"));
  Actions slidebar=new Actions (driver );
  slidebar.clickAndHold(slider).moveByOffset(100 , 200).release().perform();
}


public static void SendKeys(WebDriver driver, WebElement locators, int timeout,String value) {
   


//explicit wait doesn't have any command like implicit wait .
    //(webdriverwait) is useed for explicit wait
    //waits for particular element or action to take place .its condition base
    //it must have a condition ***
    new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(locators));
  locators.sendKeys(value);
    }

//public static void clickon(WebDriver driver,WebElement elements,int timeout) {

// new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(elements));

}
