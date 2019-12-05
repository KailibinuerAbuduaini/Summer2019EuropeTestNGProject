package com.cybertek.tests.day010_FileUpload_Download;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        //  driver.quit();
    }
    @Test
    public void FileUploadTest() {
        driver.get("http://practice.cybertekschool.com/upload");
        // user directory (user dir) means origin place of the your file
        // this line help us to get dynamic path ,then our code will work in other's computers too
        String projextPath=System.getProperty("user.dir");
        String relativePath="/src/test/resources/testfile.txt";
        String filePath=projextPath+relativePath;

        driver.findElement(By.name("file")).sendKeys(filePath);
        //clicking the upload button
        driver.findElement(By.id("file-submit")).click();
        //getting text of webelement
        String actualFilename = driver.findElement(By.id("uploaded-files")).getText();
        //verify file name is displayed in the next page
        Assert.assertEquals(actualFilename,"testfile.txt","Verify the file name");


    }

}
