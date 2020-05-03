package com.cybertek.tests.day011_action_JavaScript_Execution;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverOverTest {
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
    public void test1() {
        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement img = driver.findElement(By.tagName("img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();
        WebElement text = driver.findElement(By.xpath("//h5[.='name: user1']"));
        Assert.assertTrue(text.isDisplayed());

    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");
        for (int i = 1; i < 4; i++) {

            //creating dynamic xpath using i
            String imageXpath = "(//img)[" + i + "]";
            System.out.println("after combining string" + imageXpath);
            //passing xpath to weblement
            WebElement img = driver.findElement(By.xpath(imageXpath));

            //creating actions object
            Actions actions = new Actions(driver);
            Thread.sleep(1000);
            //hovering over on the image
            actions.moveToElement(img).perform();

            //creating dynamic xpath for the text
            String textXpath = "//h5[.='name: user" + i + "']";
            System.out.println("textXpath = " + textXpath);

            //passing xpath to webelement
            WebElement text = driver.findElement(By.xpath(textXpath));
            //verifying text is displayed
            Assert.assertTrue(text.isDisplayed());

        }
    }
    @Test
    public void staleTest(){
        driver.get("https://google.com/");
        WebElement input=driver.findElement(By.name("q"));
        input.sendKeys("selenium"+ Keys.ENTER);
        WebElement result=driver.findElement(By.id("resultStats"));
        Assert.assertTrue(result.isDisplayed());

        //go to google second time
        driver.navigate().back();
        input=driver.findElement(By.name("q"));
        input.sendKeys("java"+Keys.ENTER);
    }


    @Test
    public void test22(){
        driver.get("https://demoqa.com/selectmenu/");
        BrowserUtils.waitFor(5);
        WebElement speed=driver.findElement(By.id("speed"));



        Select menu = new Select(speed);
       menu.selectByVisibleText("Slower");
       // System.out.println( menu.getFirstSelectedOption().getText())
       ;
        //menu.selectByVisibleText("Slow");





    }
    @Test
    public void test23() {
        driver.get("https://demoqa.com/html-contact-form/");
        driver.findElement(By.cssSelector("[class='firstname']")).sendKeys("KELLY");
        driver.findElement(By.cssSelector("[id='lname']")).sendKeys("abdu");






        
        driver.findElement(By.name("country")).sendKeys("kashgar");
        driver.findElement(By.linkText("Google Link")).click();
        driver.navigate().back();
        driver.findElement(By.partialLinkText("is here")).click();
        driver.navigate().back();
        driver.findElement(By.name("subject")).sendKeys("computer");
        driver.findElement(By.tagName("input")).click();
    }


}