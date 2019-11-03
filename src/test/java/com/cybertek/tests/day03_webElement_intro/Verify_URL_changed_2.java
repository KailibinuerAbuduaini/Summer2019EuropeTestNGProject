package com.cybertek.tests.day03_webElement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Verify_URL_changed_2 {

    /**
     * open browser
     * go to http://practice.cybertekschool.com/forgot_password to an external site.
     * enter any email
     * click on Retrieve password
     * verify that url changed to http://practice.cybertekschool.com/email_sent
     *
     */
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // enter any email
        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("email@gmail.com");
        //locate to password
        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String expectedUrl="http://practice.cybertekschool.com/email_sent";
        String actualUrl=driver.getCurrentUrl();
        if(expectedUrl.equals(actualUrl)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
            System.out.println("expectedUrl = " + expectedUrl);
            System.out.println("actualUrl = " + actualUrl);

        }
        driver.quit();
    }
}


