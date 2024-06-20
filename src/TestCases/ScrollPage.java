package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollPage {
   public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver.get("http://booking.com");
      driver.findElement(By.xpath("//button[@aria-label='Dismiss sign-in info.']")).click();
      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(0,1000)", new Object[0]);
      js.executeScript("arguments[0].scrollIntoView()", new Object[]{driver.findElement(By.id("newsletter_button_footer"))});
      js.executeScript("window.scrollBy(0,1000)", new Object[0]);
   }
}
