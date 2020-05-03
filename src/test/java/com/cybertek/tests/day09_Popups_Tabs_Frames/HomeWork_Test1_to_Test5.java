package com.cybertek.tests.day09_Popups_Tabs_Frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeWork_Test1_to_Test5 {
    WebDriver driver;
    @BeforeMethod
 public void setupMethod(){
       driver= WebDriverFactory.getDriver("chrome");

    }
  @AfterMethod
  public void afterMethod(){
       // driver.quit();
  }
    @Test
    public void test1(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//a[.='Registration Form']")).click();

        driver.findElement(By.xpath("//input[@*='MM/DD/YYYY']")).sendKeys("wrong_dob");
        WebElement invalidMessage=driver.findElement(By.xpath("//small[@*='birthday'][2]"));
        System.out.println(invalidMessage.getText());

        //String actualMessage="The date of birth is not valid";
       // String expectedMessage=invalidMessage.getText();
       // Assert.assertEquals(actualMessage,expectedMessage);

    }
    @Test
    public void test2(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//a[.='Registration Form']")).click();
        WebElement checkbox1=driver.findElement(By.xpath("//input[@*='inlineCheckbox1']"));
        Assert.assertTrue(checkbox1.isDisplayed(),"C++ is displayed");
        // i want to know C++ is displayed or no
        System.out.println(checkbox1.isDisplayed());
        WebElement checkbox2=driver.findElement(By.xpath("//input[@*='java']"));
        Assert.assertTrue(checkbox2.isDisplayed(),"Java is displayed.");
        // i want to know Java is displayed or no
        System.out.println(checkbox2.isDisplayed());

        WebElement checkbox3=driver.findElement(By.xpath("//input[@*='javascript']"));
        Assert.assertTrue(checkbox3.isDisplayed(),"JavaScript is displayed.");
        // i want to know JavaScript is displayed or no
        System.out.println(checkbox3.isDisplayed());
    }
    @Test
    public void test3(){
    driver.get("https://practice-cybertekschool.herokuapp.com/");
    driver.findElement(By.xpath("//a[.='Registration Form']")).click();
    driver.findElement(By.xpath("//input[@*='firstname']")).sendKeys("a");
    WebElement invalidMessage=driver.findElement(By.xpath("//small[.='first name must be more than 2 and less than 64 characters long']"));
        System.out.println(invalidMessage.getText());
        String expectedMessage="first name must be more than 2 and less than 64 characters long";
        String actualMessage=invalidMessage.getText();
        Assert.assertEquals(actualMessage,expectedMessage);

    }
    @Test
    public void test4(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//a[.='Registration Form']")).click();
        driver.findElement(By.xpath("//input[@*='lastname']")).sendKeys("A");
        WebElement invalidMessage=driver.findElement(By.xpath("//small[.='The last name must be more than 2 and less than 64 characters long']"));

        String expectedMessage="The last name must be more than 2 and less than 64 characters long";
        String actualMessage=invalidMessage.getText();
        Assert.assertEquals(actualMessage,expectedMessage);
    }
    @Test
    public void test5(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//a[.='Registration Form']")).click();
        driver.findElement(By.xpath("//input[@*='firstname']")).sendKeys("kailibinuer");
        driver.findElement(By.xpath("//input[@*='lastname']")).sendKeys("abuduaini");
        driver.findElement(By.xpath("//input[@*='username']")).sendKeys("kalbinur103");
        driver.findElement(By.xpath("//input[@*='email']")).sendKeys("kalbi822@gmail.com");
        driver.findElement(By.cssSelector("input[name^='password']")).sendKeys("z7v8tcm889966");
        // i find phonenumber web element By.cssSelector and  By.xpath
        driver.findElement(By.cssSelector("input[type^='tel']")).sendKeys("388-970-4895");
       // driver.findElement(By.xpath("//input[@*='571-000-0000']")).sendKeys("388-970-4895");

        driver.findElement(By.cssSelector("input[value^='female']")).click();
        driver.findElement(By.cssSelector("input[name^='birthday']")).sendKeys("01/03/1989");
        // locate the department dropdown element with unique locator
        WebElement department=driver.findElement(By.name("department"));
        //create select object by passing the element as a constructor
        // [Select class ] is  only work when the web element has [select tag]
        Select departmentList=new Select(department);
        // select department from dropdown box
        departmentList.selectByVisibleText("Department of Engineering");
        // locate the job title dropdown element with unique locator
        WebElement jobTitle=driver.findElement(By.name("job_title"));
        Select jobList=new Select(jobTitle);
        //select  QA as a job title from dropdown box
        jobList.selectByVisibleText("QA");

        driver.findElement(By.xpath("//input[@*='inlineCheckbox2']")).click();
        driver.findElement(By.id("wooden_spoon")).click();

        WebElement message=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/p"));
        String actualMesage=message.getText();
        System.out.println("actualMesage = " + actualMesage);
        String expectedMessage="You've successfully completed registration!";
        Assert.assertEquals(actualMesage,expectedMessage);


    }
    @Test
    public void test6() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebDriverWait w =new WebDriverWait(driver,5);




        String[] names={"Cucumber","Brocolli","Beetroot","Carrot","Potato"};
        /*
        driver.findElement(By.partialLinkText("Java & QA Resume course"));
        Alert alert=driver.switchTo().alert();
        alert.accept();
*/

        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));


        for(int i=0;i<products.size();i++){
            String[] name= products.get(i).getText().split("-");
            String formatedName=name[0].trim();


            List itemsName=Arrays.asList(names);
            int j=0;
            if(itemsName.contains(formatedName)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if (j == names.length) {
                    break;
                }
            }
        }

    }


}
