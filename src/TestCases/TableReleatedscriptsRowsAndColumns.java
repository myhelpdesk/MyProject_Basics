package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableReleatedscriptsRowsAndColumns {
   public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
      driver.get("https://www.railyatri.in/time-table");
      WebElement trains_table = driver.findElement(By.xpath("//div[2]/div/div/div/div/div/table"));
      List<WebElement> rows = trains_table.findElements(By.tagName("tr"));
      System.out.println("Count of Rows: " + rows.size());
      driver.get("https://www.railyatri.in/time-table");
      WebElement trains_table1 = driver.findElement(By.xpath("//div[2]/div/div/div/div/div/table"));
      List<WebElement> rowss = trains_table1.findElements(By.tagName("tr"));

      List roows;
      String empid;
      for(int i = 1; i < rowss.size(); ++i) {
         roows = rowss.get(i).findElements(By.tagName("td"));
         empid = ((WebElement)roows.get(0)).getText();
         String train_name = ((WebElement)roows.get(1)).getText();
         System.out.println(empid + "  " + train_name);
      }

      driver.get("https://www.railyatri.in/time-table");
      WebElement trains_table2 = driver.findElement(By.xpath("//div[2]/div/div/div/div/div/table"));
      roows = trains_table2.findElements(By.tagName("tr"));

      for(int i = 1; i < roows.size(); ++i) {
         List<WebElement> colum = ((WebElement)roows.get(i)).findElements(By.tagName("td"));
         for (WebElement element : colum) {
            System.out.println(element.getText());
         }
      }

      driver.get("http://orangehrm.qedgetech.com");
      driver.findElement(By.id("txtUsername")).sendKeys(new CharSequence[]{"Admin"});
      driver.findElement(By.id("txtPassword")).sendKeys(new CharSequence[]{"Qedge123!@#"});
      driver.findElement(By.name("Submit")).click();
      driver.findElement(By.linkText("PIM")).click();
      driver.findElement(By.linkText("Add Employee")).click();
      driver.findElement(By.id("firstName")).sendKeys(new CharSequence[]{"Rahman"});
      driver.findElement(By.id("lastName")).sendKeys(new CharSequence[]{"Demo"});
      empid = driver.findElement(By.id("employeeId")).getAttribute("value");
      driver.findElement(By.id("btnSave")).click();
      driver.findElement(By.linkText("Employee List")).click();
      driver.findElement(By.id("empsearch_id")).sendKeys(new CharSequence[]{empid});
      driver.findElement(By.id("searchBtn")).click();
      WebElement emptable = driver.findElement(By.id("resultTable"));
      List<WebElement> roowss = emptable.findElements(By.tagName("tr"));

      for(int i = 1; i < roowss.size(); ++i) {
         List<WebElement> colums = roowss.get(i).findElements(By.tagName("td"));
         if (colums.get(1).getText().equals(empid)) {
            System.out.println("New Employee Registered is displayed in Employee List, Test Pass");
         } else {
            System.out.println("New Employee Registered is not displayed in Employee List, Test fail");
         }
      }

      driver.get("http://flights.qedgetech.com");
      driver.findElement(By.name("email")).sendKeys(new CharSequence[]{"sureshbabu.qedge@gmail.com"});
      driver.findElement(By.name("password")).sendKeys(new CharSequence[]{"demo"});
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      driver.findElement(By.linkText("Flight Bookings")).click();
      String orderid = "10249";
      WebElement orders_table = driver.findElement(By.className("flights_table"));
      List<WebElement> rrows = orders_table.findElements(By.tagName("tr"));

      for(int i = 1; i < rrows.size(); ++i) {
         List<WebElement> column = rrows.get(i).findElements(By.tagName("td"));
         if (column.get(0).getText().equals(orderid)) {
            column.get(9).findElement(By.linkText("Delete")).click();
            driver.switchTo().alert().accept();
            break;
         }
      }

   }
}
