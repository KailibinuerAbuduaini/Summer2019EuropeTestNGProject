package com.cybertek.tests.day09_Popups_Tabs_Frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupsAndAlerts {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
       driver= WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
       // driver.quit();
    }
    @Test
    public void test1(){

        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
        // locating and clicking Destroy button
       driver.findElement(By.xpath("//*[text()='Destroy the World']")).click();
       // Locate NO button and click it
       driver.findElement(By.xpath("//*[text()='No']")).click();
    }
     @Test
    public  void Alesrts() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        // click JS Alert
        driver.findElement(By.xpath("//button[1]")).click();
        // Alert is a special class provided by selenium. it is for to deal with non html alert
         Alert alert=driver.switchTo().alert();
         Thread.sleep(3000);
         // alert.accept---> click  ok in the alert
         alert.accept();
         // Clicking for JS confirm
         driver.findElement(By.xpath("//button[2]")).click();
          alert=driver.switchTo().alert();
         // clicking x to close , selecting no/cancel
         Thread.sleep(5000);
         alert.dismiss();



         // Clicking JS prompt
         driver.findElement(By.xpath("//button[3]")).click();
         alert=driver.switchTo().alert();
         // sendKeys()
         Thread.sleep(3000);
         alert.sendKeys("mike smith");
         alert.accept();



     }
}
