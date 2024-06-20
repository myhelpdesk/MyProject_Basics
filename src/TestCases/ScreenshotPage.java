package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class ScreenshotPage {
   public static void main(String[] args) throws IOException, InterruptedException {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver.get("http://orangehrm.qedgetech.com");
      driver.findElement(By.id("txtUsername")).sendKeys(new CharSequence[]{"Admin"});
      driver.findElement(By.id("txtPassword")).sendKeys(new CharSequence[]{"Qedge123!@#"});
      driver.findElement(By.name("Submit")).click();
      Thread.sleep(2000L);
      driver.findElement(By.partialLinkText("Welcome")).click();
      Thread.sleep(2000L);
      driver.findElement(By.linkText("Change Password")).click();
      TakesScreenshot ts = (TakesScreenshot)driver;
      File srcfile = ts.getScreenshotAs(OutputType.FILE);
      File trgfile = new File("D:\\demo\\change_password_defect.png");
     Files.copy(srcfile, trgfile);
      
   }
}
