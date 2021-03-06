package com.cybertek.tests.day08_TypesOfElement;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ListofElement {
    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
      List<WebElement> buttons=driver.findElements(By.tagName("button"));
        System.out.println("buttons.size()"+buttons.size());
        //verify you got 6 webElement
        Assert.assertEquals(buttons.size(),6,"verify we got 6 webelements");
        //enter  iter  click enter selenium will create for each loop for us
        for (WebElement button : buttons) {
            System.out.println(button.getText());
        }

        }
    @Test
    public void test2(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        // wrong locator but we are not  getting any error, we are getting empty list
        List<WebElement>buttons=driver.findElements(By.tagName("buttondaafdffs"));
        System.out.println(buttons.size());

    }
}
