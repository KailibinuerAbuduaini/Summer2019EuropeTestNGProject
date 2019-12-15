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

       // how to check radio button selected or not ?

        System.out.println("if red is selected "+redRadioButton.isSelected());
        System.out.println("if blue is selected"+blueRadioButton.isSelected());


        //verify that blue radio button selected
        Assert.assertTrue(blueRadioButton.isSelected(),"Verify that blue button is selected");
        //verify that red radio button not selected
        Assert.assertFalse(redRadioButton.isSelected(),"verify that red button not selected");

        //how to select radio button ?
        System.out.println("Clicking red radio button");
        redRadioButton.click();

        System.out.println("if red is selected "+redRadioButton.isSelected());
        System.out.println("if blue is selected "+blueRadioButton.isSelected());
        // blue is not selected
        Assert.assertFalse(blueRadioButton.isSelected(),"verify that blue is not selected");
        //red is selected
        Assert.assertTrue(redRadioButton.isSelected(),"verify that red is selected");
    }

}
