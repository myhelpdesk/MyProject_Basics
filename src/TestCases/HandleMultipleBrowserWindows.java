package TestCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleMultipleBrowserWindows {
   public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver.get("http://gmail.com");
      System.out.println(driver.getWindowHandle());
      driver.get("http://gmail.com");
      driver.findElement(By.linkText("Help")).click();
      Set<String> allwindows = driver.getWindowHandles();
      System.out.println(allwindows);
      driver.close();
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver1 = new FirefoxDriver();
      driver1.manage().deleteAllCookies();
      driver1.manage().window().maximize();
      driver1.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver1.get("http://gmail.com");
      driver1.findElement(By.linkText("Help")).click();
      Set<String> allwindows1 = driver1.getWindowHandles();
      Object[] windows = allwindows1.toArray();
      String window1 = windows[0].toString();
      String window2 = windows[1].toString();
      driver1.switchTo().window(window2);
      driver1.findElement(By.linkText("Community")).click();
      driver1.switchTo().window(window1);
      driver1.findElement(By.id("identifierId")).sendKeys(new CharSequence[]{"demo"});
   }
}
