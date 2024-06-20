package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListElements {
   public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver.get("https://www.facebook.com/");
      driver.findElement(By.linkText("Create new account")).click();
      Select dlist = new Select(driver.findElement(By.id("day")));
      dlist.selectByIndex(0);
      Select mlist = new Select(driver.findElement(By.id("month")));
      mlist.selectByValue("4");
      WebElement yearelement = driver.findElement(By.id("year"));
      Select ylist = new Select(yearelement);
      ylist.selectByVisibleText("2000");
      driver.get("file:///D:/Selenium%20scripts/dropdown%20code.html");
      Select clist = new Select(driver.findElement(By.id("car")));
      clist.selectByIndex(1);
      Thread.sleep(2000L);
      clist.selectByVisibleText("Honda");
      Thread.sleep(2000L);
      clist.selectByValue("A");
      driver.get("http://amazon.com");
      Select category = new Select(driver.findElement(By.id("searchDropdownBox")));
      List<WebElement> categorylist = category.getOptions();
      System.out.println(categorylist.size());
      for (WebElement element : categorylist) {
         String categoryname = element.getText();
         System.out.println(categoryname);
      }

   }
}
