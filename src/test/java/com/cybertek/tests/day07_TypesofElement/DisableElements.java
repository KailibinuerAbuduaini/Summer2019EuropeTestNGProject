package com.cybertek.tests.day07_TypesofElement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisableElements {
    @Test
    public  void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement greenButton=driver.findElement(By.id("green"));
        // how can we check is button enable or not?
        System.out.println("is element enabled"+greenButton.isEnabled());
        Assert.assertFalse(greenButton.isEnabled(),"verify green button");

    }
    @Test
    public  void test2(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement enableElement=driver.findElement(By.cssSelector("#input-example > input[type=text]"));
        System.out.println("is input enable "+enableElement.isEnabled());


    }
}
