package a8;

import java.util.ArrayList;

public class uniqueObjects
{
    public static void main(String[] args)
    {
        int[] arr = {11,12,13,14,15,16,17,18,19,20};
        ArrayList<Integer> arr1 = new ArrayList<>();

        for(int i : arr)
        {
            if(!arr1.contains(i))
            {
                arr1.add(i);
            }
        }
        for (int i : arr1)
        {
            System.out.println(i+" ");
        }
    }
}
