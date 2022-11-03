package a1;

public class marks
{
    public static void main(String[] args)
    {
        int a = 75 , b = 68 ,c = 88;
        if(a>=60 && b>=60 && c>=60)
            System.out.println("promoted");
        else if(a>60 && b>=60 && c<60)
        {
            System.out.println("pass");
        }
        else if(a<60 && b>=60 && c>=60)
        {
            System.out.println("pass");
        }
        else
            System.out.println("fail");
    }

}
