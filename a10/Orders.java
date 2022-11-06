package a10;
import java.text.Format;
import java.util.Scanner;

public class Orders
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your order price");
        int price = a.nextInt();
        if(price > 10000)
        {
            stringFunction str1;
            str1 = (str)-> (str);
            printFormatted("Order is above 10000.");
        }

        else
        {
            stringFunction str3;
            str3 = (str) -> (str);
            printFormatted("order is Accepted");
        }

    }

    private static void printFormatted(String order_is_accepted)
    {
        String result = order_is_accepted;
        System.out.println(result);

    }

}
interface stringFunction
{
    String orderStr(String str);

}
