package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement {
   public static void main(String[] args) {
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver.get("https://www.facebook.com/");
      String x = driver.findElement(By.id("email")).getAttribute("placeholder");
      System.out.println(x);
      String x1 = driver.findElement(By.linkText("Create a Page")).getAttribute("href");
      System.out.println(x1);
      String fbheader = driver.findElement(By.className("_8eso")).getText();
      System.out.println(fbheader);
      driver.get("http://primusbank.qedgetech.com");
      String content = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]/p[1]")).getText();
      System.out.println(content);
      String link_tobe_check = "Sign in";
      driver.get("http://google.com");

      try {
         if (driver.findElement(By.linkText(link_tobe_check)).isDisplayed()) {
            System.out.println("test pass");
         }
      } catch (Exception var12) {
         System.out.println("test fail");
      }

      String link_tobe_check1 = "Sign up";
      driver.get("http://google.com");

      try {
         if (driver.findElement(By.linkText(link_tobe_check1)).isDisplayed()) {
            System.out.println("test pass");
         }
      } catch (Exception var11) {
         System.out.println("test fail");
      }

      driver.get("http://orangehrm.qedgetech.com");
      driver.findElement(By.id("txtUsername")).sendKeys(new CharSequence[]{"Admin"});
      driver.findElement(By.id("txtPassword")).sendKeys(new CharSequence[]{"Qedge123!@#"});
      driver.findElement(By.name("Submit")).click();

      try {
         if (driver.findElement(By.linkText("Admin")).isDisplayed()) {
            System.out.println("Admin Login Test Pass");
         }
      } catch (Exception var10) {
         System.out.println("Admin Login Test Fail");
      }

      driver.get("http://orangehrm.qedgetech.com");
      driver.findElement(By.id("txtUsername")).sendKeys(new CharSequence[]{"Tusar"});
      driver.findElement(By.id("txtPassword")).sendKeys(new CharSequence[]{"Tusar123!@#"});
      driver.findElement(By.name("Submit")).click();

      try {
         if (driver.findElement(By.linkText("Admin")).isDisplayed()) {
            System.out.println("Employee Login Test Fail");
         }
      } catch (Exception var9) {
         System.out.println("Employee Login Test Pass");
      }

      driver.get("http://flights.qedgetech.com");
      driver.findElement(By.linkText("Register")).click();
      org.openqa.selenium.WebElement element = driver.findElement(By.id("flexCheckChecked"));
      if (!element.isSelected()) {
         element.click();
      }

   }
}
