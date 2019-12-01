package com.cybertek.tests.day010_sync;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ExplicitWaitTest {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
       // driver.quit();
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        driver.findElement(By.tagName("button")).click();
      // find the user name input
        WebElement username=driver.findElement(By.id("username"));


        //HOW TO WAIT EXPLICITLY ?
        //Create Explicit wait object
        WebDriverWait wait=new WebDriverWait(driver,10);
        //call until method from wait object
        //waiting for the specific element to be visible (up to 10 sec)
        wait.until(ExpectedConditions.visibilityOf(username));

        // sending some user name
        username.sendKeys("MikeSmith");

    }
    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        // click enable
        driver.findElement(By.xpath("//button[contains(text(),'Enable')]")).click();
        // find input box
        WebElement inputBox=driver.findElement(By.cssSelector("input[type='text']"));
        // wait until inputbox is enable or cliclble
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(inputBox));

        // type something in the input box
        inputBox.sendKeys("kelly xahida");
    }

}
