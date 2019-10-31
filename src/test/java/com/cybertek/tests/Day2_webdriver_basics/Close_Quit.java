package com.cybertek.tests.Day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");
        Thread.sleep(5000);

        driver.close();//
       //
        driver=new ChromeDriver();// this is important
        driver.get("https://practice.cybertekschool.com/open_new_tab");



        Thread.sleep(5000);
        driver.close();// this one will close previous  opened webside. not last openned one
        driver.quit();// will close browser and clear the memory.



    }
}
