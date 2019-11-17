package com.cybertek.tests.day07_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionDemo {
    @Test
    public void test1(){
        System.out.println("First Assertion");
        Assert.assertEquals(1, 1);
        System.out.println("Second Assertion");
        Assert.assertEquals("one","two");
        System.out.println("After second ");
    }
    @Test
    public void  test2(){
        String actualTitle="java";
        String expectedTitle="C#";
        System.out.println("verify me");
        Assert.assertTrue(actualTitle.startsWith(expectedTitle),"verify title");
        // verify that email includes @ sign
        Assert.assertTrue("kalbi822@gmail.com".contains("@"),"verify @ in email");
    }
    @Test
    public void test3(){
   Assert.assertNotEquals("one","two","one should not be equal");


    }
    @Test
    public void test4(){
       Assert.assertFalse(1<0);


    }


}
