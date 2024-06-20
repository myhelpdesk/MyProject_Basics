package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HtmlCode {
   public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.get("file:///D:/Selenium%20scripts/dropdown%20code.html");
      Select clist = new Select(driver.findElement(By.id("car")));
      clist.selectByVisibleText("BMW");
      clist.selectByVisibleText("Jeep");
   }
}
