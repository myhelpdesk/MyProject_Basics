package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptForGmailLogin {
   public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver.get("https://www.gmail.com/");
      driver.findElement(By.id("identifierId")).sendKeys(new CharSequence[]{"ugandhar.1080t@gmail.com"});
      driver.findElement(By.className("VfPpkd-RLmnJb")).click();
      driver.findElement(By.className("VfPpkd-vQzf8d")).click();
      driver.findElement(By.name("Passwd")).sendKeys(new CharSequence[]{"1080testing"});
      driver.findElement(By.linkText("Next")).click();
   }
}
