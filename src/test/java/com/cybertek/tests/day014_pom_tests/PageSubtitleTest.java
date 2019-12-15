package com.cybertek.tests.day014_pom_tests;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitleTest extends TestBase {
    @Test
    public void verifySubtitleTest(){
        LoginPage loginPage=new LoginPage();

        String username= ConfigurationReader.get("driver_username");
        String password= ConfigurationReader.get("driver_password");
        loginPage.login(username,password);
        DashboardPage dashboardPage=new DashboardPage();

        System.out.println(dashboardPage.getPageSubTitle());

        String actual=dashboardPage.getPageSubTitle();
        Assert.assertEquals(actual,"Quick Launchpad");

        dashboardPage.navigateToModule("Activities","Calendar Events");
        //dashboardPage.navigateToModule("Customers","Accounts");
        Assert.assertEquals(dashboardPage.getPageSubTitle(),"Calendar Events","verify subtitle");
        CalendarEventsPage calendarEventsPage=new CalendarEventsPage();
        calendarEventsPage.createCalendarEvent.click();


    }
}
