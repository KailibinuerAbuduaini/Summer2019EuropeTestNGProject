package com.cybertek.tests.day04_Basic_Locator;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocator_Test1 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        // WebElement home=driver.findElement(By.tagName("a"));
        // home.click();

        WebElement home=driver.findElement(By.className("nav-link"));
        home.click();// if there is a space in the class attribute value,we should not use it
        // for ex:class="btn btn-primary"

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement multiple=driver.findElement(By.tagName("h3"));
        multiple.click();
        System.out.println(multiple.getText());

    }
}
