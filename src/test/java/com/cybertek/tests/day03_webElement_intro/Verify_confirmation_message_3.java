package com.cybertek.tests.day03_webElement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Verify_confirmation_message_3 {

    /**
     *open browser
     * go to http://practice.cybertekschool.com/forgot_password to an external site.
     * enter any email
     * verify that email is displayed in the input box
     * click on Retrieve password
     * verify that confirmation message says 'Your e-mail's been sent!'
     */
    public static void main(String[] args) {
        // open bowser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password ");
        WebElement emailInputBox=driver.findElement(By.name("email"));
        String expectedEmail="test@gmail.com";
        //send expected email
        emailInputBox.sendKeys(expectedEmail);
        String actualEmail=emailInputBox.getAttribute("value"); // result would be pass
        // String actualEmail=emailInputBox.getText();// result would be fail
        if (expectedEmail.equals(actualEmail)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("actualEmail = " + actualEmail);
            System.out.println("expectedEmail = " + expectedEmail);
        }
        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        // verify confirmation message
        String expectedMessage="Your e-mail's been sent!";

        WebElement messageElement=driver.findElement(By.name("confirmation_message"));
        //locate your web element
        String actualMessage=messageElement.getText();
        System.out.println(actualMessage);
        if(expectedMessage.equals(actualMessage)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("actualMessage = " + actualMessage);
            System.out.println("expectedMessage = " + expectedMessage);
        }
        driver.quit();
    }
}


