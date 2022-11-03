package a1;
import java.util.Scanner;
public class Armstrong2
{
    public static void main(String[]args)
    {
        Scanner a = new Scanner(System.in);
        System.out.println("enter lower and upper ranges: ");
        int low = a.nextInt();
        int high = a.nextInt();
        System.out.println("Armstrong numbers between "+ low + " and "+ high);
        for( int num = low; num<=high; num++)
        {
            int sum = 0, digit,temp,len;
            len = getOrder(num);
            temp=num;
            while(temp!=0)
            {
                digit = temp%10;
                sum = sum + (int)Math.pow(digit, len);
                temp /= 10;
            }
            if(sum==num)
                System.out.println(num + " ");
        }
    }
    private static int getOrder(int num)
    {
        int len = 0;
        while (num != 0)
        {
            len++;
            num=num/10;
        }
        return len;
    }

}
