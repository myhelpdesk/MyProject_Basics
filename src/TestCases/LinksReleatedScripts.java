package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksReleatedScripts {
   public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver.get("http://facebook.com");
      driver.findElement(By.linkText("Create new account")).click();
      String pgtitle = driver.getTitle();
      if (pgtitle.toLowerCase().contains("sign up")) {
         System.out.println("Title of the Window Link is Working test pass");
      } else {
         System.out.println("Title of the Window Link is not Working test fail");
      }

      driver.get("http://facebook.com");
      driver.findElement(By.partialLinkText("password")).click();
      String pgurl = driver.getCurrentUrl().toLowerCase();
      if (pgurl.contains("recover")) {
         System.out.println("URL of the Window Link is Working test pass");
      } else {
         System.out.println("URL of the Window Link is not Working test fail");
      }

      String link_tobe_check = "Sign in";
      driver.get("http://google.com");

      try {
         if (driver.findElement(By.linkText(link_tobe_check)).isDisplayed()) {
            System.out.println("Sign in link present in a Windowtest pass");
         }
      } catch (Exception var12) {
         System.out.println("Sign in link present not in a Windowtest fail");
      }

      String link_tobe_check1 = "Sign up";
      driver.get("http://google.com");

      try {
         if (driver.findElement(By.linkText(link_tobe_check1)).isDisplayed()) {
            System.out.println("Sign up link present in a Windowtest pass");
         }
      } catch (Exception var11) {
         System.out.println("Sign up link present not in a Windowtest fail");
      }

      driver.get("http://facebook.com");
      List<WebElement> linkslist = driver.findElements(By.tagName("a"));
      System.out.println("Count of Links: " + linkslist.size());
      driver.get("http://facebook.com");
      List<WebElement> linkslist1 = driver.findElements(By.tagName("a"));
      for (WebElement element : linkslist1) {
         String linkname = element.getText();
         System.out.println(linkname);
      }

      driver.get("file:///D:/Selenium%20scripts/brokenlink.html");
      List<WebElement> links = driver.findElements(By.tagName("a"));
      for (WebElement element : links) {
         if (element.getAttribute("href").isEmpty()) {
            System.out.println(element.getText());
         }
      }

   }
}
