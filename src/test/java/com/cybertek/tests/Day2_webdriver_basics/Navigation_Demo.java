package com.cybertek.tests.Day2_webdriver_basics;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Demo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        // we open  amazon ni first then facebook
        Thread.sleep(5000);
     // another way to open web
        driver.navigate().to("https://facebook.com");

        //go back to previous web(amazon will open )
        driver.navigate().back();
        // it will stop your code 3 second

        // go back to(facebook open )
        driver.navigate().forward();
        // refresh web page;
        driver.navigate().refresh();


    }
}
