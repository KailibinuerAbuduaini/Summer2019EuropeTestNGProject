package com.cybertek.tests.day010_FileUpload_Download;

import org.testng.annotations.Test;

public class FilePathExample {
    @Test
    public void test1(){
        System.out.println(System.getProperty("user.dir"));
        String projextPath=System.getProperty("user.dir");
        String relativePath="/src/test/resources/testfile.txt";
        String filePath=projextPath+relativePath;
        System.out.println("filePath = " + filePath);

    }
}
