package com.cybertek.tests.day017_data_drive_framework;

import com.cybertek.utilities.ExcelUtil;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExcelUtilsDemo {
    @Test
    public void readExcelFile(){
        // create an object from ExcelFile
       // it accepts two parameter
      // Argument1: location of the file----path
     // Argument2: sheet that what we want to open---sheetName
        ExcelUtil qa3short=new ExcelUtil("src/test/resources/Vytracktestdata.xlsx","QA3-short");
        // how many Row in the sheet;
        System.out.println("Row count:"+qa3short.rowCount());
        // how many Columns in the sheet
        System.out.println("Columns count:"+qa3short.columnCount());
        //get Columns name
        System.out.println("Columns name:"+qa3short.getColumnsNames().get(1));
       // qa3short.getDataList() after this --->press Alt+Enter, then you will get below line;
        List<Map<String, String>> dataList = qa3short.getDataList();
        System.out.println(dataList.get(0).get("firstname"));

         // print them one by one for each row
        for(Map<String,String>onerow:dataList){
            System.out.println(onerow);
        }
        // print the array
        String[][] dataArray=qa3short.getDataArray();
        System.out.println(Arrays.deepToString(dataArray));

    }
}
