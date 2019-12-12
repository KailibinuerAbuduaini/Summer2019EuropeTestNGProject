package com.cybertek.tests.day013_propertes_driver_testbase;

public class Singleton {



    // Sigleton class will have private constructor
    // this means other classes can not create object from this class
    private  static String str;
    private Singleton(){}

    public  static  String getInstance(){
        // if str has no value,initialize it and return it
        if(str==null) {
            System.out.println("str is null,assign value to it");
            str="somevalue";

        }else{
            //if it has value just return it
            System.out.println("it has value just return it");
        }

        return str;
    }
    }



