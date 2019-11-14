package com.cybertek.tests.day05_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class seleniumTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.it");
        WebElement searchInput=driver.findElement(By.id("twotabsearchtextbox"));
        searchInput.sendKeys("selenium");

        WebElement searchButton=driver.findElement(By.xpath("//*[@value='VAI']"));
        searchButton.click();
        WebElement result=driver.findElement(By.xpath("//span[contains(text(), 'risultati in']"));
        System.out.println(result.getText());


    }
}
