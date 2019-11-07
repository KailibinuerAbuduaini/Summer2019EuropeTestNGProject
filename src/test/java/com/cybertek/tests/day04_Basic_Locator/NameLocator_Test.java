package com.cybertek.tests.day04_Basic_Locator;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocator_Test {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        driver.manage().window().maximize();
        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys("Mike Smith");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("kalbi822@gmail.com");
        WebElement sign_up = driver.findElement(By.name("wooden_spoon"));
        sign_up.click();


        WebElement messageElement = driver.findElement(By.name("signup_message"));
        String actualMessage = messageElement.getText();

        String expectMessage = "Thank you for signing up. Click the button below to return to the home page.";
        if (expectMessage.equals(actualMessage)) {
            System.out.println("pass");
        } else {
            System.out.println("expectMessage = " + expectMessage);
            System.out.println("actualMessage = " + actualMessage);
        }
    }
}
