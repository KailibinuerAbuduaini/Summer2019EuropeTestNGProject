package com.cybertek.tests.Day_2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrl_Title {
    public static void main(String[] args) {
        //set up your driver
        WebDriverManager.chromedriver().setup();
        //create your driver object
        WebDriver driver=new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");
        // get the web page title
        String title=driver.getTitle();
        //soutv
        System.out.println("title = " + title);
        // get web page  current URL
        String currenturl=driver.getCurrentUrl();
        System.out.println("currenturl = " + currenturl);
        
        //get the  source code of the web page;
        String pageSource=driver.getPageSource();
        System.out.println("pageSource = " + pageSource);
        

    }
}
