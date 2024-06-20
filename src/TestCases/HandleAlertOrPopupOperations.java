package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAlertOrPopupOperations {
   public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver.get("http://flights.qedgetech.com");
      driver.findElement(By.name("email")).sendKeys(new CharSequence[]{"sureshbabu.qedge@gmail.com"});
      driver.findElement(By.name("password")).sendKeys(new CharSequence[]{"demo"});
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      driver.findElement(By.linkText("Flight Bookings")).click();
      driver.findElement(By.linkText("Delete")).click();
      String alertmsg = driver.switchTo().alert().getText();
      if (alertmsg.contains("Delete")) {
         driver.switchTo().alert().accept();
      } else {
         driver.switchTo().alert().dismiss();
      }

   }
}
