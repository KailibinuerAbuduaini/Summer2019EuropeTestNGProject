package com.cybertek.tests.day09_Popups_Tabs_Frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        // driver.quit();
    }
    @Test
    public void switchWindowsTest(){
        driver.get("http://practice.cybertekschool.com/windows");

        // clicking click here Link
        driver.findElement(By.linkText("Click Here")).click();
        // code for switching windows,we have to pass handle
        // driver.switchTo().window();
        String currentWindowHandle=driver.getWindowHandle();
        System.out.println("currentWindowHandle = " + currentWindowHandle);


        // after this line, our goal is switch to new window
        // set is just like arraylist but without duplicate values,only unique value
        Set<String> windowHandles=driver.getWindowHandles();
        // how many diffirent handles it is keeping
        System.out.println(windowHandles.size());
        // our problem is how we can reach new window handle from set of handles. there is no index.

        // we can say , if it is not the current window handle then switch to new window handle;
        //loop through all handles inside the Set of handles
        for (String windowHandle : windowHandles) {
            if (!currentWindowHandle.equals(windowHandle)) {
                //switching to new window
                driver.switchTo().window(windowHandle);
            }
        }
        System.out.println("After switch to new window , title is: "+driver.getTitle());

    }
    @Test
    public void moreThan2WindowsTest() {
        driver.get("http://practice.cybertekschool.com/windows");

        String targetWindowTitle = "New Window";
        driver.findElement(By.linkText("Click Here")).click();
        //check how many windows we have
        System.out.println(driver.getWindowHandles().size());
        Set<String> windowHandles= driver.getWindowHandles();
        //we will keep switching windows until our title equals to targetWindowTitle.
        for (String handle : windowHandles) {
            //switch them one by one
            driver.switchTo().window(handle);
            //checking if the window title equals to my target window title
            if(driver.getTitle().equals(targetWindowTitle)){
                //if they are equal stop looping.I want to keep that window driver.
                break;
            }
        }
        System.out.println("After loop title is : "+driver.getTitle());

    }
    }
