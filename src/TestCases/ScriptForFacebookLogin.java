package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptForFacebookLogin {
   public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver.get("https://www.facebook.com/");
      driver.findElement(By.id("email")).sendKeys(new CharSequence[]{"7288868731"});
      driver.findElement(By.id("passContainer")).click();
      driver.findElement(By.id("pass")).sendKeys(new CharSequence[]{"Abhintr!9999"});
      driver.findElement(By.name("login")).click();
   }
}
