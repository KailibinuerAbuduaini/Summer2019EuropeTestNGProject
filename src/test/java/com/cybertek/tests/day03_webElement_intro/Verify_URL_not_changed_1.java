package com.cybertek.tests.day03_webElement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Verify_URL_not_changed_1 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //save url to String variable
        String expectedUrl = driver.getCurrentUrl();
        // click on Retrieve password
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String actualUrl = driver.getCurrentUrl();

        //verify that url is not change
        if (expectedUrl.equals(actualUrl)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        driver.quit();
    }
}