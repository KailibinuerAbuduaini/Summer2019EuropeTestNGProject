package com.cybertek.tests.TestCase4;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase4 extends TestBase {
/*
Test Case #1
1. Go to “https://qa1.vytrack.com/"
2. Login as a store manager
3. Navigate to “Activities -> Calendar Events”
4. Hover on three dots “…” for “Testers meeting”
calendar event
 */

@Test
    public void hoverOverTest(){
    //Login as a store manager
    LoginPage loginPage=new LoginPage();
    String username= ConfigurationReader.get("driver_username");
    String password=ConfigurationReader.get("driver_password");
    LoginPage.login(username,password);
    //Navigate to “Activities -> Calendar Events”
    DashboardPage dashboardPage=new DashboardPage();
    dashboardPage.navigateToModule("Activities","Calendar Events");


    WebElement threeDot=driver.findElement(By.xpath("//a[@*='dropdown']"));





    Actions actions=new Actions(driver);
    actions.moveToElement(threeDot).perform();

}



}
