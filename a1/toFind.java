package a1;

public class toFind
{
    public static void main(String[] args)
    {
        int[] num = {3,7,9,5,99,45,67,2,56,90,34,97,77,38,121};
        int find =  45;
        boolean found = false;
        for(int n : num)
        {
            if(n==find)
            {
                found = true;
                break;
            }
        }
        if(found)
        {
            System.out.println(find+" is found");
        }
        else
        {
            System.out.println(find+" is not found");
        }
    }
}
