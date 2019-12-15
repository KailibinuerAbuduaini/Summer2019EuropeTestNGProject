package com.cybertek.tests.day08_TypesOfElement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {
    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropdownElement=driver.findElement(By.id("dropdownMenuLink"));
        // click Dropdown Link
        dropdownElement.click();
       //  Select Links=new Select(dropdownElement); this is wrong
        // because this element do not have select tag
       List<WebElement> listoflinks=driver.findElements(By.className("dropdown-item"));
        System.out.println("number of links "+listoflinks.size());
        //print text of each element in the list
        for (WebElement listoflink : listoflinks) {
            System.out.println(listoflink.getText());
        }
       //print text of first element in the list
      System.out.println(listoflinks.get(0).getText());
        //find the element and click it
       // driver.findElement(By.linkText("Yahoo")).click();
        listoflinks.get(3).click();
    }
}
