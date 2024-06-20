package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiplePropertiesInXath {
   public static void main(String[] args) {
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver.get("http://flights.qedgetech.com");
      driver.findElement(By.name("email")).sendKeys(new CharSequence[]{"ugandhar.fullstack@gmail.com"});
      driver.findElement(By.name("password")).sendKeys(new CharSequence[]{"demo"});
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      driver.findElement(By.xpath("//input[@name='price_class' and @value='Business']")).click();
      driver.get("http://facebook.com/");
      List<WebElement> editlist = driver.findElements(By.xpath("//input[@type='text' and @type='password']"));
      System.out.println(editlist.size());
      driver.get("http://facebook.com/");
      List<WebElement> editlist1 = driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
      System.out.println(editlist1.size());
      driver.get("https://www.facebook.com/");
      driver.findElement(By.id("email")).sendKeys(new CharSequence[]{"7288868731"});
      driver.findElement(By.id("pass")).sendKeys(new CharSequence[]{"Abhintr!9999"});
      driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();
      driver.close();
      WebDriver driver1 = new FirefoxDriver();
      driver1.manage().deleteAllCookies();
      driver1.manage().window().maximize();
      driver1.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver1.get("http://orangehrm.qedgetech.com");
      driver1.findElement(By.id("txtUsername")).sendKeys(new CharSequence[]{"Admin"});
      driver1.findElement(By.id("txtPassword")).sendKeys(new CharSequence[]{"Qedge123!@#"});
      driver1.findElement(By.id("btnLogin")).click();
      driver1.findElement(By.linkText("PIM")).click();
      driver1.findElement(By.linkText("Employee List")).click();
      List<WebElement> chklist = driver1.findElements(By.xpath("//input[starts-with(@id,'ohrmList_chkSelectRecord')]"));
      for (WebElement element : chklist) {
         element.click();
      }

      driver1.manage().deleteAllCookies();
      driver1.get("http://facebook.com");
      driver1.findElement(By.xpath("//input[contains(@placeholder,'phone')]")).sendKeys(new CharSequence[]{"demo"});
      driver1.get("http://flights.qedgetech.com");
      driver1.findElement(By.name("email")).sendKeys(new CharSequence[]{"ugandhar.fullstack@gmail.com"});
      driver1.findElement(By.name("password")).sendKeys(new CharSequence[]{"demo"});
      driver1.findElement(By.xpath("//button[@type='submit']")).click();
      driver1.findElement(By.xpath("/html/body/header/nav/div/div[3]/ul/li[2]/div/a/i")).click();
      driver1.close();
      driver1.get("http://flights.qedgetech.com");
      driver1.findElement(By.name("email")).sendKeys(new CharSequence[]{"ugandhar.fullstack@gmail.com"});
      driver1.findElement(By.name("password")).sendKeys(new CharSequence[]{"demo"});
      driver1.findElement(By.xpath("//button[@type='submit']")).click();
      driver1.findElement(By.cssSelector("button[type='submit']")).click();
   }
}
