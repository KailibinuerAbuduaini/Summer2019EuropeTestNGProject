package com.cybertek.tests.day014_pom_tests;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests extends TestBase {
    @Test
    public void wrongPaswordTest(){
        LoginPage loginPage=new LoginPage();
        loginPage.usernameInput.sendKeys("user1");
        loginPage.passwordInput.sendKeys("12344");
        loginPage.LoginBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/user/login");

    }
    @Test
    public void wrongUsername(){
        LoginPage loginPage=new LoginPage();
        loginPage.usernameInput.sendKeys("someusername");
        loginPage.passwordInput.sendKeys("UserUser123");
        loginPage.LoginBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/user/login");
    }
}
