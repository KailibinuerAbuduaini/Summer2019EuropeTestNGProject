package com.cybertek.tests.day015_extent_reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtentDemoTest {
    ExtentReports report;
    ExtentHtmlReporter htmlReporter;
    ExtentTest extentLogger;

    @BeforeMethod
    public void  setUp(){
        report=new ExtentReports();
       // System.out.println("user.dir");

        // creat report path
        String projectPath=System.getProperty("user.dir");
        String path=projectPath+"/test-output/report.html";

        htmlReporter=new ExtentHtmlReporter(path);
        report.attachReporter(htmlReporter);

        htmlReporter.config().setReportName("Vytrack smoke test");
        report.setSystemInfo("Environment","QA");
        report.setSystemInfo("Browser","chrome");
        report.setSystemInfo("Tester","Europe+UK testers");
    }
    @Test
    public void test1(){
        //give name to the current test
        extentLogger=report.createTest("TC342 Login as Driver Test");
        extentLogger.info("open chrome");
        extentLogger.info("go to url");
        extentLogger.info("enter driver info");
        extentLogger.info("click submit");
        extentLogger.info("verify logged in");
        extentLogger.pass("TC342 is passed");

    }

    @AfterMethod
    public void teardown(){
        report.flush();
    }
}
