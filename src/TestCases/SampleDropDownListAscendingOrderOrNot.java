package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleDropDownListAscendingOrderOrNot {
   public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver.get("file:///D:/Selenium%20scripts/dropdown%20code2.html");
      Select cars = new Select(driver.findElement(By.id("demo")));
      List<WebElement> carlist = cars.getOptions();
      boolean ordered = true;

      for(int i = 1; i < carlist.size(); ++i) {
         String item1 = carlist.get(i - 1).getText();
         String item2 = carlist.get(i).getText();
         if (item2.compareToIgnoreCase(item1) < 0) {
            ordered = false;
            break;
         }
      }

      if (ordered) {
         System.out.println("all items are listed in ascending order, test pass");
      } else {
         System.out.println("items are not listed in ascending order, test fail");
      }

   }
}
