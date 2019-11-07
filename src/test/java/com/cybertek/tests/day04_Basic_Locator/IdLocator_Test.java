package com.cybertek.tests.day04_Basic_Locator;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocator_Test {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //maximize the browser
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontClick=driver.findElement(By.id("disappearing_button"));
        dontClick.click();
        // WebElement button4=driver.findElement(By.id("b1_button"));// WE get error in here,because we can not locate
        //that element .if id keep changing we get this error.


    }
}
