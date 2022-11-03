package a5;

import java.lang.String;

public class test
{
    public static void main(String[] args) {
        String s = "Java String pool refers to Collection of strings which are stored in heap memory.";
        String str = s.toLowerCase();
        String str1 = s.toUpperCase();
        String str2 = s.replace("a","$");


        System.out.println("In lower case = "+str);
        System.out.println("In upper case = "+str1);
        System.out.println("Replaced string = "+str2);




    }
}
