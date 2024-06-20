package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomatingTextBoxOperations {
   public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver.get("http://facebook.com");
      List<WebElement> editlist = driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
      System.out.println(editlist.size());
      driver.get("http://google.com");
      driver.findElement(By.name("q")).sendKeys(new CharSequence[]{"selenium"});
      Thread.sleep(2000L);
      List<WebElement> keywordlist = driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
      System.out.println(keywordlist.size());
      for (WebElement element : keywordlist) {
         String keyword = element.getText();
         System.out.println(keyword);
      }

      driver.get("http://google.com");
      driver.findElement(By.name("q")).sendKeys(new CharSequence[]{"selenium"});
      Thread.sleep(2000L);
      List<WebElement> keywordlist1 = driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
      System.out.println(keywordlist1.size());
      for (WebElement element : keywordlist1) {
         String keyword = element.getText();
         if (keyword.equalsIgnoreCase("selenium download")) {
            element.click();
            break;
         }
      }

   }
}
