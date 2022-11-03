package a1;
import java.util.Scanner;

public class cui
{
    public static void main(String[] args)
    {
        int passwordLength = 8;
        String name;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your name ");
        name = a.nextLine();
        System.out.println("Enter your password ");
        String password = a.nextLine();
        int total = password.length();
        if(total < passwordLength)
        {
         for(int i=0;i<3;i++)
         {
             System.out.println("password is invalid");
             System.out.println("Contact the admin");
         }
        }
        else
        {
            System.out.println("Password accepted");
        }
    }
}
