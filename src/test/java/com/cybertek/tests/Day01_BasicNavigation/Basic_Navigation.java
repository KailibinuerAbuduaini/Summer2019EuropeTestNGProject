package com.cybertek.tests.Day01_BasicNavigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigation {
    public static void main(String[] args) {
        // we have to set up based on the browser that we gonna use
        WebDriverManager.chromedriver().setup();

        // create object for using selenium driver;
        WebDriver driver=new ChromeDriver();

        //open browser
        driver.get("http://amazon.com");// bumu exlaydu
        //driver.get("http://google.com");
       // open website
        System.out.println(driver.getTitle());




    }
}