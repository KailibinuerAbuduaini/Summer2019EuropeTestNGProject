package com.cybertek.tests.day04_Basic_Locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagName_Test {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        //enter full name
        WebElement fullName=driver.findElement(By.tagName("input"));
        fullName.sendKeys("mike with TagName");
        //enter email
        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("test@gmail.com");

        WebElement signUp=driver.findElement(By.name("wooden_spoon"));
        signUp.click();

        //print the message using tagname locator
        WebElement messagge=driver.findElement(By.tagName("h3"));

        System.out.println(messagge.getText());
    }
}


