package com.cybertek.tests.day05_xpath;

import com.cybertek.utilities.WebDriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        WebElement search=driver.findElement(By.xpath("//*[@name='field-keywords']"));
        search.sendKeys("selenium");
        //WebElement searchButton =driver.findElement(By.xpath("//input[@value='Go']"));

        WebElement searchButton=driver.findElement(By.cssSelector("div.nav-search-submit.nav-sprite"));
        searchButton.click();

       WebElement result=driver.findElement(By.xpath("//*[@id=\"search\"]/span[2]/h1/div/div[1]/div/div/span[1]"));
        System.out.println(result.getText());

    }
}
