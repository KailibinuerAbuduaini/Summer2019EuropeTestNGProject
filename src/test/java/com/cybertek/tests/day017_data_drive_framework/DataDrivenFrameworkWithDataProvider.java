package com.cybertek.tests.day017_data_drive_framework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenFrameworkWithDataProvider {
    @DataProvider
    public Object[][]testData(){
        String[][] data={
                {"GOT","9"},
                {"HIMYM","9"},
                {"Friends","10"},
                {"Person of Interest","10"},
                {"Breaking Bad","9"},
                {"Big Bang Theory","9"},
                {"Chernobyl","9"},
                {"Prison break","12" +
                        ""}
        };
        return data;
    }
    // get data from data provider then pass as an arguments
    @Test(dataProvider = "testData")
    public void test1(String tvshow,String rating){
        System.out.println("TVshow:" + tvshow+"has rating "+rating);

    }
}
