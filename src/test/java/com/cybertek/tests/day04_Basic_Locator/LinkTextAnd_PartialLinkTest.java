package com.cybertek.tests.day04_Basic_Locator;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAnd_PartialLinkTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        //linkText
        WebElement Link3=driver.findElement(By.linkText("Example 3: Element on page that is hidden and become" +
                " visible after 5 seconds"));
        Link3.click();

        //linkText
        WebElement home=driver.findElement(By.linkText("Home"));
        home.click();

        //partialLinkText
        WebElement Link6=driver.findElement(By.partialLinkText("Example 6:"));
        Link6.click();

    }
}
