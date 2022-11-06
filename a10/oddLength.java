package a10;

import java.util.ArrayList;
import java.util.Arrays;

public class oddLength
{
    public static void main(String[] args)
    {
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("hello","java","intellij"));
        System.out.println(list1);
        for (String word : list1)
            System.out.println(word);
        System.out.println("the words with the even number length:");
        list1.removeIf(word ->((word.length()%2 )!= 0));
        for (String word : list1){
            System.out.println(word);
        }
    }
}
