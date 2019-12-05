package com.cybertek.tests.day05_xpath;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xxxx {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.co.uk/ref=nav_logo");
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("selenium");
        driver.findElement(By.xpath("//*[@value='Go']")).click();

        WebElement result = driver.findElement(By.xpath("//span[contains(text(), 'results for')]"));
        System.out.println(result.getText());

    }
}
