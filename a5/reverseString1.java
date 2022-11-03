package a5;

public class reverseString1
{
    public static void main(String[] args)
    {
        StringBuilder sbd;
        sbd = new StringBuilder("This method returns the reversed object on which it is called.");

        sbd.reverse();
        System.out.println("String buffer after reversing = " + sbd);
    }
}

