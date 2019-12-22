package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage {

    // we do not need to create constructor and use (PageFactory ,why )class here,
    //since we extend from BasePage
    //*[contains(text(),'abc@gmail.com')][@data-column-label='Email']
    @FindBy(xpath = "//td[contains(text(),'mbrackstone9@example.com')][@data-column-label='Email']")
    public WebElement email;

    // create method that accepts email as a string and returns webelemnt based on that email
    public WebElement getContactEmail(String email) {
 String emailXpath = "//td[contains(text(),'"+email+"')][@data-column-label='Email']";
     return Driver.get().findElement(By.xpath(emailXpath));

}
}
