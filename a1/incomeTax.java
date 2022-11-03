package a1;
import java.util.Scanner;

public class incomeTax
{
    public static void main(String[] args)
    {
        double tax = 0, ctc;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter ctc");
        ctc = a.nextDouble();
        if(ctc <= 181000)
        {
            tax = 0;
        }
        else if(ctc <= 300000)
        {
            tax = 0.1*(ctc-181000);
        }
        else if(ctc <= 500000)
        {

            tax = 0.2*(ctc-300000) + (0.1*100000);
        }
        else if(ctc <= 1000000)
        {
            tax = (0.3*(ctc-500000)) + (0.2*200000) + (0.1*100000);
        }
        else
        {
            tax = (0.4*(ctc-1000000)) + (0.3*500000) + (0.2*200000) + (0.1*100000);
        }
        System.out.println("Income tax amount = "+ tax);
    }
}
