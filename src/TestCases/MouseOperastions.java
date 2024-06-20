package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperastions {
   public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver.get("http://snapdeal.com");
      Actions act = new Actions(driver);
      act.moveToElement(driver.findElement(By.linkText("Home & Kitchen")));
      act.contextClick();
      act.build().perform();
      driver.get("http://jqueryui.com");
      driver.findElement(By.linkText("Droppable")).click();
      driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
      WebElement sourcelement = driver.findElement(By.id("draggable"));
      WebElement targetlement = driver.findElement(By.id("droppable"));
      Actions actions = new Actions(driver);
      actions.dragAndDrop(sourcelement, targetlement);
      actions.build().perform();
      driver.switchTo().parentFrame();
      driver.findElement(By.linkText("Demos")).click();
   }
}
