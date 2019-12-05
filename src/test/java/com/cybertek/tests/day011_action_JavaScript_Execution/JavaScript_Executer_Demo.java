package com.cybertek.tests.day011_action_JavaScript_Execution;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScript_Executer_Demo {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        //  driver.quit();
    }
    @Test
   public void click(){
        driver.get("http://practice.cybertekschool.com/");
        WebElement link=driver.findElement(By.linkText("Dropdown"));
        //jsexecuter object
        // run js code with that object
        //how to create jse object? jse---means javascript executor
        JavascriptExecutor jse=(JavascriptExecutor)driver;// this is object casting
        jse.executeScript("arguments[0].click();",link);


    }
}
