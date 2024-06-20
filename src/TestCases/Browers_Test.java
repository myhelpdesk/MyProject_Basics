package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browers_Test {
   public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().fullscreen();
      driver.get("https://facebook.com");
      driver.get("https://google.com");
      driver.navigate().to("https://facebook.com");
      driver.navigate().to("https://google.com");
      driver.get("file:///D:\\Selenium scripts");
      driver.manage().window().maximize();
      driver.get("https://facebook.com");
      driver.get("https://google.com");
      driver.navigate().to("https://facebook.com");
      driver.navigate().to("https://google.com");
      driver.get("file:///D:\\Selenium scripts");
      driver.navigate().to("https://google.com");
      driver.navigate().back();
      driver.navigate().forward();
      Thread.sleep(3000L);
      driver.navigate().refresh();
      driver.findElement(By.linkText("About")).click();
      driver.close();
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver1 = new FirefoxDriver();
      driver1.manage().deleteAllCookies();
      driver1.manage().window().maximize();
      driver1.get("http://google.com");
      driver1.findElement(By.linkText("Images")).click();
      String pgtitle = driver1.getTitle();
      System.out.println(pgtitle);
      driver1.get("http://google.com");
      driver1.findElement(By.linkText("Gmail")).click();
      String pgurl = driver1.getCurrentUrl();
      System.out.println(pgurl);
      driver1.manage().deleteAllCookies();
      driver1.manage().window().maximize();
      driver1.get("http://primusbank.qedgetech.com");
      driver1.findElement(By.linkText("Site Map")).click();
      driver1.findElement(By.linkText("Home")).click();
      driver1.get("http://primusbank.qedgetech.com");
      driver1.findElement(By.linkText("Site Map")).click();
      List<WebElement> links = driver1.findElements(By.linkText("Home"));
      System.out.println(links.size());
      links.get(1).click();
      driver1.get("http://google.com");
      List<WebElement> links1 = driver1.findElements(By.tagName("a"));
      System.out.println(links1.size());
   }
}
