package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderScripts {
   public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver.get("http://flights.qedgetech.com");
      driver.findElement(By.linkText("Register")).click();
      driver.findElement(By.name("dob")).sendKeys(new CharSequence[]{"28-05-1999"});
      driver.get("http://flights.qedgetech.com");
      driver.findElement(By.linkText("Register")).click();
      driver.findElement(By.name("dob")).click();
      String dob = "22-Oct-1982";
      String[] temp = dob.split("-");
      String dt = temp[0];
      String month = temp[1];
      String year = temp[2];
      Select mlist = new Select(driver.findElement(By.className("ui-datepicker-month")));
      mlist.selectByVisibleText(month);
      Select ylist = new Select(driver.findElement(By.className("ui-datepicker-year")));
      ylist.selectByVisibleText(year);
      WebElement calender = driver.findElement(By.className("ui-datepicker-calendar"));
      List<WebElement> rows = calender.findElements(By.tagName("tr"));

      for(int i = 1; i < rows.size(); ++i) {
         List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
         for (WebElement element : cols) {
            if (element.getText().equals(dt)) {
               element.click();
               break;
            }
         }
      }

      driver.get("http://flights.qedgetech.com");
      driver.findElement(By.name("email")).sendKeys(new CharSequence[]{"sureshbabu.qedge@gmail.com"});
      driver.findElement(By.name("password")).sendKeys(new CharSequence[]{"demo"});
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      driver.findElement(By.id("search-date")).sendKeys(new CharSequence[]{"05/15/2024"});
      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
      driver.get("http://flights.qedgetech.com");
      driver.findElement(By.name("email")).sendKeys(new CharSequence[]{"sureshbabu.qedge@gmail.com"});
      driver.findElement(By.name("password")).sendKeys(new CharSequence[]{"demo"});
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      driver.findElement(By.id("search-date")).click();
      String flydate = "14-May-2032";
      String[] temp1 = flydate.split("-");
      String date = temp1[0];
      String month1 = temp1[1];
      String year1 = temp1[2];

      for(String calyear = driver.findElement(By.className("ui-datepicker-year")).getText(); !calyear.equals(year1); calyear = driver.findElement(By.className("ui-datepicker-year")).getText()) {
         driver.findElement(By.linkText("Next")).click();
      }

      for(String calmonth = driver.findElement(By.className("ui-datepicker-month")).getText(); !calmonth.equalsIgnoreCase(month1); calmonth = driver.findElement(By.className("ui-datepicker-month")).getText()) {
         driver.findElement(By.linkText("Next")).click();
      }

      WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
      List<WebElement> rowss = cal.findElements(By.tagName("tr"));

      for(int i = 1; i < rowss.size(); ++i) {
         List<WebElement> colss = rowss.get(i).findElements(By.tagName("td"));
         for (WebElement element : colss) {
            if (element.getText().equals(date)) {
               element.click();
               break;
            }
         }
      }

   }
}
