package com.cybertek.tests.day05_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpath_Test {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
       // WebElement homeLink=driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
       // homeLink.click();
        WebElement button6=driver.findElement(By.xpath("//button[@onclick='button6()']"));
        button6.click();

        // ----->  "//button[@onclick='button3()']"
        // ----->  "//button[@*='button3()]"    * means----any attribute
        // ----->  "//*[@onclick='button3()]"     means----any element
        //-------> //button[starts-with(@id, 'button_')]

    }

}
