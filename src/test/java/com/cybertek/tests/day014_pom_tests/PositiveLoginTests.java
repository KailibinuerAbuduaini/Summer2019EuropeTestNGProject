package com.cybertek.tests.day014_pom_tests;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTests extends TestBase {
    @Test
    public void loginAsDriver(){
        LoginPage loginPage=new LoginPage();
        String uesrname= ConfigurationReader.get("driver_username");
        String password=ConfigurationReader.get("driver_password");
        LoginPage.login(uesrname,password);
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/");

    }

    @Test
    public void lginAsStoreManager(){
        LoginPage loginPage=new LoginPage();
        String uesrname= ConfigurationReader.get("storemanager_username");
        String password=ConfigurationReader.get("storemanager_password");
        LoginPage.login(uesrname,password);
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/");

    }
}
