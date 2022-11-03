package a5;

public class reverseString
{
    public static void main(String[] args)
    {
        StringBuffer sbf = new StringBuffer("This method returns the reversed object on which it is called.");

        sbf.reverse();
        System.out.println("String buffer after reversing = " + sbf);
    }
}
