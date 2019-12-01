package com.cybertek.tests.day09_Popups_Tabs_Frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork_Test9_to_Test12 {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
   driver= WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public  void afterMethod(){
       // driver.quit();
    }
    @Test
    public void test9(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//a[.='Status Codes']")).click();
        driver.findElement(By.xpath("//a[.='200']")).click();
       WebElement Message=driver.findElement(By.xpath("//*[@id='content']/div/p/text()[1]"));
      String message=Message.getText();
        System.out.println("message = " + message);
    }
    @Test
    public void test10(){

    }
}
