package com.cybertek.tests.day09_Popups_Tabs_Frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork_Test6_to_Test8 {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void afterMethod(){
        //driver.quit();
    }
    @Test
    public void test6(){
        driver.get("https://www.tempmailaddress.com/");
        WebElement Email=driver.findElement(By.cssSelector("span.animace"));
        String email=Email.getText();
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//a[.='Sign Up For Mailing List']")).click();
        driver.findElement(By.xpath("//input[@*='full_name']")).sendKeys("kalbi");
        driver.findElement(By.xpath("//input[@*='email']")).sendKeys(email);
        driver.findElement(By.xpath("//button[@*='wooden_spoon']")).click();
        WebElement message=driver.findElement(By.xpath("//h3[@*='subheader']"));
        String Message=message.getText();
        System.out.println("Message = " + Message);

        driver.findElement(By.cssSelector("i.icon-2x.icon-signout")).click();

        driver.get("https://www.tempmailaddress.com/");
       driver.findElement(By.xpath("//tbody[@id='schranka']/tr[4]")).click();



        driver.findElement(By.xpath("//span[.='Thanks for subscribing to practice.cybertekschool.com!']")).isDisplayed();


    }
    @Test
    public void test7(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//*[@id='content']/ul/li[18]/a")).click();
        WebElement uploadElement=driver.findElement(By.id("file-upload"));
       uploadElement.sendKeys("E:\\20`9_08_22\\Cybertek’s\\selenium\\TXT\\KELLY.txt");
       driver.findElement(By.id("file-submit")).click();
       WebElement Message=driver.findElement(By.xpath("//div[@*='content']/div[1]/h3"));

       String actualMessage=Message.getText();
        System.out.println("actualMessage = " + actualMessage);
        WebElement filelName=driver.findElement(By.id("uploaded-files"));
        String actualFileName=filelName.getText();
        String expectedFileName="KELLY.txt";
        Assert.assertEquals(actualFileName,expectedFileName,"correct");

    }
    @Test
    public void test8(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//div[@*='content']/ul/li[3]/a")).click();
        driver.findElement(By.id("myCountry")).sendKeys("United States of America");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        WebElement result=driver.findElement(By.id("result"));
        String actualResult=result.getText();
        String expectedResult="You selected: United States of America";
        Assert.assertEquals(actualResult,expectedResult);

    }

}
