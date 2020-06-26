package org.example;
public class Concatenator {
    public static String hello(String name1, String name2)
    {
        checker(name1,name2);
        return name1+" " + name2;
    }
    private static void checker(String name1, String name2){
        if(name1.length()<=2 || name2.length()<=2)
            throw new RuntimeException("length is less "+name1+" "+name2);
    }
}