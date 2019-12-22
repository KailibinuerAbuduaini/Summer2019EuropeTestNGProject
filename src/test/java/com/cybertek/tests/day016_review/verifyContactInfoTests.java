package com.cybertek.tests.day016_review;

import com.cybertek.pages.ContactInfoPage;
import com.cybertek.pages.ContactsPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyContactInfoTests extends TestBase {
    /*
* open the chrome
go to qa3.vytrack
login as a sales manager
navigate to customers ->contacts
click on email mbrackstone9@example.com
verify that full name is Ms Mariam Brackstone
verify that email is mbrackstone9@example.com
verify that phone number is +18982323434
* */
    @Test
    public void contactDetailsTest(){
       extentLogger=report.createTest("contactDetailsTest");
        LoginPage loginPage=new LoginPage();
        String username= ConfigurationReader.get("salesmanager_username");
        String password= ConfigurationReader.get("salesmanager_password");
        extentLogger.info("username:"+username);
        extentLogger.info("password:"+password);
        extentLogger.info("Login as a salesmanager");
        LoginPage.login(username,password);

        ContactsPage contactsPage=new ContactsPage();
        extentLogger.info("navigate to customer--contact page");
        contactsPage.navigateToModule("Customers","Contacts");
        contactsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(5);
        extentLogger.info("click mbrackstone9@example.com email");
         contactsPage.getContactEmail("mbrackstone9@example.com").click();
        contactsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(5);

        ContactInfoPage contactInfoPage=new ContactInfoPage();

        String actualFullname=contactInfoPage.fullname.getText();
        String expectedFullname="Ms Mariam Brackstone";
        Assert.assertEquals(actualFullname,expectedFullname,"verify fullname");

        String actualEmail=contactInfoPage.email.getText();
        String expectedEmail="mbrackstone9@example.com";
        Assert.assertEquals(actualEmail,expectedEmail,"verify email");

        String actualPhone=contactInfoPage.phone.getText();
        String expectedPhone="+18982323434";
        Assert.assertEquals(actualPhone,expectedPhone,"verify phone");

    }

}
