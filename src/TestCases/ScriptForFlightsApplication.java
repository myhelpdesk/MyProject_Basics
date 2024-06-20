package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptForFlightsApplication {
   public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver.get("http://flights.qedgetech.com");
      driver.findElement(By.name("email")).sendKeys(new CharSequence[]{"ugandhar.fullstack@gmail.com"});
      driver.findElement(By.name("password")).sendKeys(new CharSequence[]{"demo"});
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      String pgtitle = driver.getTitle();
      if (pgtitle.toLowerCase().contains("dashboard")) {
         System.out.println("Login Successful, test pass");
      } else {
         System.out.println("Login UnSuccessful, test fail");
      }

      driver.findElement(By.xpath("/html/body/header/nav/div/div[3]/ul/li[2]/div/a/i")).click();
      driver.findElement(By.linkText("Logout")).click();
      driver.close();
   }
}
