package com.cybertek.tests.day07_TypesofElement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {
    @Test
    public  void radioButton(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioButton=driver.findElement(By.id("blue"));
        WebElement redRadioButton=driver.findElement(By.id("red"));

        // check radio button selected or not
        System.out.println("if red is selected "+redRadioButton.isSelected());
        System.out.println("if blue is selected"+blueRadioButton.isSelected());

        Assert.assertTrue(blueRadioButton.isSelected(),"verify it is blue");
        Assert.assertFalse(redRadioButton.isSelected(),"verify red");

        redRadioButton.click();

        System.out.println("if red is selected "+redRadioButton.isSelected());
        System.out.println("if blue is selected"+blueRadioButton.isSelected());
        // blue is not selected
        Assert.assertFalse(blueRadioButton.isSelected(),"verify it is blue");
        //red is selected
        Assert.assertTrue(redRadioButton.isSelected(),"verify red");
    }

}
