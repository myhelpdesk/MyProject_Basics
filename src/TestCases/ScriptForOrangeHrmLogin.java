package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptForOrangeHrmLogin {
   public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver.get("http://orangehrm.qedgetech.com");
      driver.findElement(By.id("txtUsername")).sendKeys(new CharSequence[]{"Admin"});
      driver.findElement(By.id("txtPassword")).sendKeys(new CharSequence[]{"Qedge123!@#"});
   }
}
