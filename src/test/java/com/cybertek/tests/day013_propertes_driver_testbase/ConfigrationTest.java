package com.cybertek.tests.day013_propertes_driver_testbase;

import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ConfigrationTest {
    @Test
    public void test1(){
        String browser= ConfigurationReader.get("browser");
        System.out.println(browser);
        System.out.println(ConfigurationReader.get("url"));
        System.out.println(ConfigurationReader.get("username"));
        System.out.println(ConfigurationReader.get("password"));
    }



}
